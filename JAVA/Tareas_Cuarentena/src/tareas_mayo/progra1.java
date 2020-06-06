package tareas_mayo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class progra1{
    private JFrame f;
    private JPanel p;
    private JComboBox<String> combo;
    private JTextField text2;

    public progra1(){
        gui();
    }

    public void gui(){
        f = new JFrame();
        f.setSize(450, 150);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setBackground(Color.WHITE);

        text2 = new JTextField();
        text2.setBounds(20, 30, 200, 30);

        combo = new JComboBox<>();
        combo.addItem("Seleccione un país");
		combo.addItem("Argentina");
		combo.addItem("Brasil");
        combo.addItem("Honduras");
        combo.addItem("USA");
		combo.addItem("Canadá");
        combo.addItem("México");
        combo.addItem("Australia");
		combo.addItem("Angola");
        combo.addItem("Francia");
        combo.addItem("China");
        combo.setBounds(230, 30, 150, 30);

        combo.addActionListener(new ActionListener() {    
        @Override
        public void actionPerformed(final ActionEvent e){
            if(combo.getSelectedItem().equals("Argentina")){
                text2.setText("Argentina - Su Capital Buenos Aires");
            }else if(combo.getSelectedItem().equals("Brasil")){
                text2.setText("Brasil - Su Capital Brasilia");
            }else if(combo.getSelectedItem().equals("Honduras")){
                text2.setText("Honduras - Su Capital Tegucigalpa");
            }else if(combo.getSelectedItem().equals("USA")){
                text2.setText("USA - Su Capital Washington DC");
            }else if(combo.getSelectedItem().equals("Canadá")){
                text2.setText("Canadá - Su Capital Ottawa");
            }else if(combo.getSelectedItem().equals("México")){
                text2.setText("México - Su Capital Ciudad de México");
            }else if(combo.getSelectedItem().equals("Australia")){
                text2.setText("Australia - Su Capital Canberra");
            }else if(combo.getSelectedItem().equals("Angola")){
                text2.setText("Angola - Su Capital Luanda");
            }else if(combo.getSelectedItem().equals("Francia")){
                text2.setText("Francia - Su Capital París");
            }else if(combo.getSelectedItem().equals("China")){
                text2.setText("China - Su Capital Pekín");
            }else{
                text2.setBackground(Color.white);
                text2.setText("");
            }
        }
    });
        f.add(combo);
        f.add(text2);
        f.add(p);
        f.setVisible(true);
    }
    public static void main(final String[] args) {
        new progra1();
    }
}