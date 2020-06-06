package tareas_mayo;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculadora  {
    private JFrame f;
    private JTextField text1;
    private JButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,s,r,m,d;
    private int num1,suma1;

    public calculadora(){
        F_A();
    }

    public void F_A(){
        f = new JFrame("Calculadora");
        f.setSize(500, 530);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        
        f.setVisible(true);
    }

    public void cal(){

    }

    public void t_f(){
        text1 = new JTextField();
    }



    public static void main(String[] args) {
        new calculadora();
        
    }
}