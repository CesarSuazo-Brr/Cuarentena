package tareas_mayo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dinero extends JFrame{
    private JLabel l1, l2;
    private static JLabel l3;
    private static JLabel l4;
    private static JTextField t1;
    private JPanel p1;
    private static JRadioButton r1;
    private static JRadioButton r2;
    private Image img1, img2;
    private static ImageIcon image1;
    private static ImageIcon image2;
    private static double num, total1, total2;
    image img = new image();

    public dinero() {
        this.setContentPane(img);
        initComponents();
    }

    private void initComponents() {
        // frame
        this.setTitle("Formu");
        this.setSize(800, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        L_a();
        p_a();
        r_a();
        t_a();

        this.setVisible(true);
    }

    public void L_a() {
        // labels
        l1 = new JLabel("Conversión de moneda");
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(200, 1, 450, 100);

        l2 = new JLabel("Ingresa Cantidad en L.");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(500, 100, 450, 100);

        img.add(l2);
        img.add(l1);
    }

    public void p_a() {
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(230, 250, 380, 80);

        l3 = new JLabel();
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        l3.setBorder(BorderFactory.createLineBorder(Color.black));
        l3.setBounds(10, 10, 65, 60);

        l4 = new JLabel();
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.BLACK);
        l4.setBorder(BorderFactory.createLineBorder(Color.black));
        l4.setBounds(90, 10, 280, 60);
        p1.add(l4);
        p1.add(l3);
        img.add(p1);
    }

    public void r_a() {
        final ButtonGroup groupr = new ButtonGroup();
        r1 = new JRadioButton("Dolar");
        r1.setFont(new Font("Arial", Font.BOLD, 20));
        r1.setForeground(Color.YELLOW);
        r1.setBounds(300, 200, 80, 20);
        r1.setOpaque(false);

        r2 = new JRadioButton("Euro");
        r2.setFont(new Font("Arial", Font.BOLD, 20));
        r2.setForeground(Color.YELLOW);
        r2.setBounds(420, 200, 80, 20);
        r2.setOpaque(false);
        groupr.add(r1);
        groupr.add(r2);

        img.add(r2);
        img.add(r1);
    }

    public void t_a() {
        // text
        t1 = new JTextField();
        t1.setFont(new Font("Arial", Font.BOLD, 20));
        t1.setBounds(195, 130, 300, 40);
        img.add(t1);
    }

    public void i_a() {
        image1 = new ImageIcon("Tareas_Cuarentena/dolar.jpg");
        img1 = image1.getImage().getScaledInstance(5, 5, Image.SCALE_SMOOTH);
        image1 = new ImageIcon(img1);

        image2 = new ImageIcon("Tareas_Cuarentena/euro.jpg");
        img2 = image2.getImage().getScaledInstance(5, 5, Image.SCALE_SMOOTH);
        image2 = new ImageIcon(img2);
    }

    public static void main(final String[] args) {
        new dinero();

        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == r1) {
                    num = Double.parseDouble(t1.getText());
                    if (r1.isSelected()) {
                        l3.setIcon(new ImageIcon("Tareas_Cuarentena/dolar.jpg"));
                        total1 = num / 25;
                        l4.setText(String.valueOf(String.format("%.2f", total1)));
                    }
                }
            }
        });

        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == r2) {
                    num = Double.parseDouble(t1.getText());
                    if (r2.isSelected()) {
                        l3.setIcon(new ImageIcon("Tareas_Cuarentena/euro.jpg"));
                        total2 = num / 28;
                        l4.setText(String.valueOf(String.format("%.2f",total2)));
                    } 
                }    
			}
        }); 
        
    } 
    

    class image extends JPanel {
        private Image img_image;

        public void paint(final Graphics g) {

            final ImageIcon img = new ImageIcon("Tareas_Cuarentena/banco.jpg");
            img_image = img.getImage();

            g.drawImage(img_image, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }
    
}