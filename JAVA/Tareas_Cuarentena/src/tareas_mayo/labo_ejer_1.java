package tareas_mayo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//César Eduardo Macías Suazo
public class labo_ejer_1 implements ActionListener {
    private JFrame f;
    private JPanel p1;
    private JLabel l1,l2,l3;
    private JButton b1;
    private JTextField t1,t2,t3;
    private JComboBox<String> c1;
    private double x1,x2;

    public labo_ejer_1() {
        F_A();
    }
    //frame
    public void F_A(){
        f = new JFrame("Calculadora");
        f.setSize(340, 200);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P_A();
        f.setVisible(true);
    }
    //panel and label
    public void P_A(){
        p1 = new JPanel();
        p1.setSize(400, 230);
        p1.setLayout(null);

        l1 = new JLabel("Primer operando:");
        l1.setFont(new Font("Arial", Font.PLAIN, 17));
        l1.setBounds(17, 13, 130, 15);
        l2 = new JLabel("Operador:");
        l2.setFont(new Font("Arial", Font.PLAIN, 17));
        l2.setBounds(75, 48, 120, 15);
        l3 = new JLabel("Segundo operando:");
        l3.setFont(new Font("Arial", Font.PLAIN, 17));
        l3.setBounds(5, 80, 145, 15);

        C_A();
        T_X();
        B_A();
        p1.add(l3);
        p1.add(l2);
        p1.add(l1);
        f.add(p1);
    }
    //TextFiled
    public void T_X(){
        t1 = new JTextField();
        t1.setBounds(150, 10, 170, 25);
        t2 = new JTextField();
        t2.setBounds(150, 105, 170, 30);
        t3 = new JTextField();
        t3.setBounds(150, 76, 170, 25);
        
        p1.add(t3);
        p1.add(t2);
        p1.add(t1);
    }
    //Boton
    public void B_A(){
        b1 = new JButton("Calcular");
        b1.addActionListener(this);
        b1.setBounds(5, 105, 140, 30);

        p1.add(b1);
    }
    //Combo
    public void C_A(){
        c1 = new JComboBox<>();
        c1.addItem("+");
        c1.addItem("-");
        c1.addItem("*");
        c1.addItem("/");
        c1.setBounds(150, 44, 170, 25);

        p1.add(c1);
    }

    public static void main(String[] args) {
        new labo_ejer_1();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1){
            x1 = Integer.parseInt(t1.getText());
            x2 = Integer.parseInt(t3.getText());
            if(c1.getSelectedItem().equals("+")){
                double s = x1+x2;
                t2.setText(String.valueOf(s));
            }else if(c1.getSelectedItem().equals("-")){
                double r = x1-x2;
                t2.setText(String.valueOf(r));
            }else if(c1.getSelectedItem().equals("*")){
                double m = x1*x2;
                t2.setText(String.valueOf(m));
            }else if(c1.getSelectedItem().equals("/")){
                double d = x1/x2;
                t2.setText(String.valueOf(d));
            }
        }
    }
}