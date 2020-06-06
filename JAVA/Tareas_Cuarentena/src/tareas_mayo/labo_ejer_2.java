package tareas_mayo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
//César Eduardo Macias Suazo
public class labo_ejer_2 implements ActionListener {
    private JFrame f ;
    private JPanel p1;
    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private JButton b1,b2,b3;
    private JComboBox<String> c1,c2;
    private int ta1;

    public labo_ejer_2(){
        Fr_A();
    }

    public void Fr_A(){
        f = new JFrame();
        f.setSize(540, 160);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Pa_N();
        f.setVisible(true);
    }

    public void Pa_N(){
        p1 = new JPanel();
        p1.setLayout(null);

        BU_T();
        Co_M();
        La_B();
        f.add(p1);
    }

    public void La_B(){
        l1 = new JLabel("Fuente");
        l1.setBounds(5, 10, 40, 10);

        l2 = new JLabel("Color");
        l2.setBounds(5,60,40,10);

        l3 = new JLabel();
        l3.setBounds(155, 80, 20, 20);
        l3.setBorder(BorderFactory.createLineBorder(Color.black));
        l3.setOpaque(true);

        l4 = new JLabel("Tamañano de texto: Grande");
        l4.setBounds(250, 10, 170, 10);

        l5 = new JLabel("Ventana");
        l5.setBounds(300, 70, 50,10);

        
        l6 = new JLabel("BRRRRR", SwingConstants.CENTER);
        l6.setFont(l6.getFont().deriveFont(10f));
        l6.setBorder(BorderFactory.createLineBorder(Color.black));
        l6.setBackground(Color.white);
        l6.setBounds(250, 85, 155,30);
        l6.setOpaque(true);

        p1.add(l6);
        p1.add(l5);
        p1.add(l4);
        p1.add(l3);
        p1.add(l2);
        p1.add(l1);
    }

    public void Co_M(){
        c1 = new JComboBox<>();
        c1.setBounds(5,30,140,20);
        c1.addItem("Times New Roman");
        c1.addItem("Helvetica");
        c1.addActionListener(fuente);

        c2 = new JComboBox<>();
        c2.setBounds(5, 80, 140, 20);
        c2.addItem("Amarillo");
        c2.addItem("Azul");
        c2.addActionListener(color);
    
        p1.add(c2);
        p1.add(c1);
    }

    public void BU_T(){
        b1 = new JButton("A");
        b1.setFont(new Font("Arial", Font.PLAIN, 10));
        b1.setBounds(250, 30, 50, 30);
        b1.addActionListener(this);

        b2 = new JButton("A");
        b2.setFont(new Font("Arial", Font.PLAIN, 20));
        b2.setBounds(300, 30, 50, 30);
        b2.addActionListener(this);

        b3 = new JButton("A");
        b3.setFont(new Font("Arial", Font.PLAIN, 30));
        b3.setBounds(350, 30, 55, 30);
        b3.addActionListener(this);

        p1.add(b3);
        p1.add(b2);
        p1.add(b1);
    }

    public static void main(String[] args) {
        new labo_ejer_2();
    }


    ActionListener fuente = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(c1.getSelectedItem().equals("Times New Roman")){
            l6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
            }else if(c1.getSelectedItem().equals("Helvetica")){
                l6.setFont(new Font("Helvetica", Font.PLAIN, 30));
                }
            }
        };

        ActionListener color = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(c2.getSelectedItem().equals("Amarillo")){
                l6.setForeground(Color.YELLOW);
                l3.setBackground(Color.YELLOW);
                }else if(c2.getSelectedItem().equals("Azul")){
                    l3.setBackground(Color.blue);
                    l6.setForeground(Color.blue);
                    }
                }
            };

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == b1){
            l6.setFont(l6.getFont().deriveFont(10f));
        }

        if(e.getSource()==b2){
            l6.setFont(l6.getFont().deriveFont(20f));
        }

        if(e.getSource()==b3){
            l6.setFont(l6.getFont().deriveFont(30f));
        }
    }
}