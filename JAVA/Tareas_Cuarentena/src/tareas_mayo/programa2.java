package tareas_mayo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class programa2 {
    private JFrame f;
    private JPanel p;
    private JComboBox<String> combo;

    public programa2(){
        gui2();
    }
    
    public void gui2(){
        f = new JFrame();
        f.setSize(450, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        p = new JPanel();
        p.setBackground(Color.WHITE);

        combo = new JComboBox<>();
        combo.addItem("Seleccione un mes");
		combo.addItem("Enero");
		combo.addItem("Febrero");
        combo.addItem("Marzo");
        combo.addItem("Abril");
		combo.addItem("Mayo");
        combo.addItem("Junio");
        combo.addItem("Julio");
		combo.addItem("Agosto");
        combo.addItem("Septiembre");
        combo.addItem("Octubre");
        combo.addItem("Noviembre");
        combo.addItem("Diciembre");
        combo.setBounds(130, 20, 150, 30);

        combo.addActionListener(new ActionListener() {    
        @Override
        public void actionPerformed(final ActionEvent e){
            if(combo.getSelectedItem().equals("Diciembre") || combo.getSelectedItem().equals("Enero") || combo.getSelectedItem().equals("Febrero")){
                p.setBackground(Color.BLUE);
                f.setTitle(combo.getSelectedItem()+" , estamos en Invierno");
            }else if(combo.getSelectedItem().equals("Marzo") || combo.getSelectedItem().equals("Abril") || combo.getSelectedItem().equals("Mayo") || combo.getSelectedItem().equals("Junio")){
                p.setBackground(Color.ORANGE);
                f.setTitle(combo.getSelectedItem()+" , estamos en Primavera");
            }else if(combo.getSelectedItem().equals("Julio") || combo.getSelectedItem().equals("Agosto") || combo.getSelectedItem().equals("Septiembre")){
                p.setBackground(Color.YELLOW);
                f.setTitle(combo.getSelectedItem()+" , estamos en Verano");
            }else if(combo.getSelectedItem().equals("Octubre") || combo.getSelectedItem().equals("Noviembre")){
                p.setBackground(Color.GRAY);
                f.setTitle(combo.getSelectedItem()+" , estamos en Verano");
            }else{
                p.setBackground(Color.white);
                f.setTitle("");
            }
        }     
    });
        f.add(combo);
        f.add(p);
        f.setVisible(true);
    }
    public static void main(final String[] args) {
        new programa2();
    }
}