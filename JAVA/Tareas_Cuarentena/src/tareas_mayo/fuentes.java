package tareas_mayo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Map;
import java.awt.font.*;

public class fuentes implements ActionListener {
    private JFrame f;
    private JPanel p1;
    private JLabel  l1, l2, l3, l4, l5, l6, l7;
    private JComboBox<String> c1, c2, c3, c4;
    private JToggleButton b1, b2, b3;
    private String x,primeraLetra,restoDeLaCadena,primeraMinuscula,minuscula,mayusculas, pm,sg;
    private int i,t;
    private Font font;
    private Map attributes;

    public fuentes(){
        ff_();
    }

    public void ff_(){
        f = new JFrame();
        f.setSize(560, 360);
        f.setResizable(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pp_();
        cc_();
        ll_();
        f.setVisible(true);
    }

    public void pp_(){
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        p1.setBounds(250, 30, 156, 52);
        
        bb_();
        f.add(p1);
    }

    public void bb_(){
        b1 = new JToggleButton("N");
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBounds(1, 1, 50, 50);
        b1.addActionListener(this);

        b2 = new JToggleButton("K");
        b2.setFont(new Font("Arial",Font.ITALIC,20));
        b2.setBounds(53, 1, 50, 50);
        b2.addActionListener(this);

        b3 = new JToggleButton("S");
        b3.setFont(new Font("Arial",Font.PLAIN,20));
        b3.setBounds(105, 1, 50, 50);
        b3.addActionListener(this);

        p1.add(b3);
        p1.add(b2);
        p1.add(b1);
    }

    public void ll_(){
        l1 = new JLabel("Fuente");
        l1.setFont(new Font("Arial",Font.BOLD,15));
        l1.setBounds(5, 10, 50, 20);

        l2 = new JLabel("Tamaño");
        l2.setFont(new Font("Arial",Font.BOLD,15));
        l2.setBounds(5, 70, 70, 20);

        l3 = new JLabel("Tamaño");
        l3.setFont(new Font("Arial",Font.BOLD,15));
        l3.setBounds(5, 70, 70, 20);

        l4 = new JLabel("Alineamiento");
        l4.setFont(new Font("Arial",Font.BOLD,15));
        l4.setBounds(5, 130, 100, 20);

        l5 = new JLabel("Convertir minúsculas y Mayúsculas");
        l5.setFont(new Font("Arial",Font.BOLD,15));
        l5.setBounds(5, 250, 250, 20);

        l6 = new JLabel("Estilo");
        l6.setFont(new Font("Arial",Font.BOLD,15));
        l6.setBounds(300, 10, 100, 20);
        
        l7 = new JLabel("texto prueba");
        l7.setFont(new Font("Arial",Font.BOLD,8));
        l7.setBorder(BorderFactory.createLineBorder(Color.black));
        l7.setBounds(170, 100, 350, 130);

        f.add(l7);
        f.add(l6);
        f.add(l5);
        f.add(l4);
        f.add(l2);
        f.add(l1);
    }

    public void cc_(){
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        c1 = new JComboBox<>();
        for(String campos : fontNames){
            c1.addItem(campos);
        }
        c1.setBounds(5, 40, 140, 20);
        c1.addActionListener(fuente);

        c2 = new JComboBox<>();
        for(i=8; i<=61 ; i++){
            c2.addItem(String.valueOf(i));
        }
        c2.setBounds(5, 100, 130, 20);
        c2.addActionListener(fuente);

        c3 = new JComboBox<>();
        c3.addItem("Izquierda");
        c3.addItem("Centro");
        c3.addItem("Derecha");
        c3.setBounds(5, 160, 130, 20);
        c3.addActionListener(alineacion);

        c4 = new JComboBox<>();
        c4.addItem("Seleccione una Opción");
        c4.addItem("Tipo oración");
        c4.addItem("minúsculas");
        c4.addItem("MAYÚSCULAS");
        c4.addItem("Poner Mayúsculas Cada Palabra");
        c4.setBounds(5, 280, 200, 20);
        c4.addActionListener(mayus);

        f.add(c4);
        f.add(c3);
        f.add(c2);
        f.add(c1);
    }
    public static void main(String[] args) {
        new fuentes();
    }

    ActionListener fuente = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stu
                t = Integer.parseInt((String) c2.getSelectedItem());
                x = String.valueOf(c1.getSelectedItem());
                if(c1.getSelectedItem().equals(x)){
                    l7.setFont(new Font(x,Font.PLAIN,t));
                }
            }
        };

        ActionListener alineacion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                   if(c3.getSelectedItem().equals("Izquierda")){
                       l7.setHorizontalAlignment(SwingConstants.LEFT);
                   }else if(c3.getSelectedItem().equals("Centro")){
                       l7.setHorizontalAlignment(SwingConstants.CENTER);
                   }else if(c3.getSelectedItem().equals("Derecha")){
                       l7.setHorizontalAlignment(SwingConstants.RIGHT);
                }
            }
        };

        ActionListener mayus = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c4.getSelectedItem().equals("Tipo oración")){
                    primeraLetra = l7.getText().substring(0, 1).toUpperCase();
		            restoDeLaCadena = l7.getText().substring(1);
                    primeraMinuscula = primeraLetra + restoDeLaCadena;
                    l7.setText(primeraMinuscula);
                }else if(c4.getSelectedItem().equals("minúsculas")){
                    minuscula = l7.getText().toLowerCase();
                    l7.setText(minuscula);
                }else if(c4.getSelectedItem().equals("MAYÚSCULAS")){
                    mayusculas = l7.getText().toUpperCase();
                    l7.setText(mayusculas);
                }else if(c4.getSelectedItem().equals("Poner Mayúsculas Cada Palabra")){
                    pm = String.valueOf(l7.getText().toUpperCase().charAt(0))+ l7.getText().substring(1,5).toLowerCase();
                    sg = l7.getText().toUpperCase().charAt(6) + l7.getText().substring(7).toLowerCase();
                    l7.setText(pm+" "+sg);
                }     
            }
        };

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource()==b1){
                if(b1.isSelected()){
                    font = l7.getFont();
                    attributes = font.getAttributes();
                    attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
                    l7.setFont(font.deriveFont(attributes));
                }else{
                    l7.setFont(font);
                }   
            }

            if(e.getSource()==b2){
                if(b2.isSelected()){
                    font = l7.getFont();
                    attributes = font.getAttributes();
                    attributes.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
                    l7.setFont(font.deriveFont(attributes));
                }else{
                    l7.setFont(font);
                }
            }

            if(e.getSource()==b3){
                if(b3.isSelected()){
                    font = l7.getFont();
                    attributes = font.getAttributes();
                    attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                    l7.setFont(font.deriveFont(attributes));
                }else{
                    l7.setFont(font);
                }
            }
        }
}

        