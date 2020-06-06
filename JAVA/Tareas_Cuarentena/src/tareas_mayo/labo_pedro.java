package tareas_mayo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class labo_pedro implements ActionListener {
    private JFrame f1;
    private JPanel p1, p2;
    private JTextField t1, t2, t3;
    private JLabel titulo1, l1, l2, l3, l4, l5, l6, l7, a1, a2, a3, a4, a5, a6, titulo, x1, x2, x3, x4, x5, x6;
    private JComboBox<String> combo1;
    private JCheckBox ch1, ch2;
    private JRadioButton r1, r2;
    private JButton b1, b2;
    private Image img, img2;
    private ImageIcon image, image2;

    public labo_pedro() {
        gui3();
    }

    public void gui3() {
        f1 = new JFrame();
        f1.setTitle("Formulario");
        f1.setSize(750, 470);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel
        p1 = new JPanel();
        p1.setBounds(10, 130, 320, 280);
        p1.setLayout(null);
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        p1.setBackground(Color.LIGHT_GRAY);

        p2 = new JPanel();
        p2.setBounds(340, 161, 370, 220);
        p2.setLayout(null);
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.setBackground(Color.LIGHT_GRAY);

        // labels
        l1 = new JLabel("Formulario 1");
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setBounds(20, 50, 180, 25);

        titulo1 = new JLabel();
        // titulo1.setBorder(BorderFactory.createLineBorder(Color.black));
        titulo1.setBounds(205, 10, 100, 100);

        l2 = new JLabel("Tratamiento");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Arial", Font.PLAIN, 22));
        l2.setBounds(5, 10, 140, 25);

        l3 = new JLabel("Nombre:");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Arial", Font.PLAIN, 17));
        l3.setBounds(27, 50, 140, 25);

        l4 = new JLabel("Apellidos:");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Arial", Font.PLAIN, 17));
        l4.setBounds(20, 90, 140, 25);

        l5 = new JLabel("Dirreción:");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Arial", Font.PLAIN, 17));
        l5.setBounds(20, 130, 140, 25);

        l6 = new JLabel("Ciudad:");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Arial", Font.PLAIN, 17));
        l6.setBounds(35, 170, 140, 25);

        l7 = new JLabel("Preferencia:");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Arial", Font.PLAIN, 17));
        l7.setBounds(15, 210, 140, 25);

        // radiobutton, Group the radio buttons.
        ButtonGroup groupr = new ButtonGroup();
        r1 = new JRadioButton("Sr.");
        r1.setBounds(130, 12, 45, 25);
        r1.setBackground(Color.LIGHT_GRAY);
        r2 = new JRadioButton("Sra.");
        r2.setBounds(200, 12, 55, 25);
        r2.setBackground(Color.LIGHT_GRAY);
        groupr.add(r1);
        groupr.add(r2);

        // TextField
        t1 = new JTextField();
        t1.setBounds(100, 52, 180, 20);
        t2 = new JTextField();
        t2.setBounds(100, 92, 180, 20);
        t3 = new JTextField();
        t3.setBounds(100, 132, 180, 20);

        // combo box
        combo1 = new JComboBox<>();
        combo1.addItem("Comayagua");
        combo1.addItem("Tegucigalpa");
        combo1.addItem("La Paz");
        combo1.setBounds(100, 172, 180, 20);

        // checkbutton
        ch1 = new JCheckBox("Libros");
        ch1.setBounds(115, 212, 65, 20);
        ch1.setBackground(Color.LIGHT_GRAY);
        ch2 = new JCheckBox("Películas");
        ch2.setBounds(190, 212, 80, 20);
        ch2.setBackground(Color.LIGHT_GRAY);

        // Buttons
        b1 = new JButton("Enviar");
        b1.setBounds(115, 240, 70, 30);
        b2 = new JButton("Cancelar");
        b2.setBounds(190, 240, 85, 30);

        // Labels segundo panel
        titulo = new JLabel("Datos Introducidos:");
        titulo.setForeground(Color.BLACK);
        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(5, -4, 140, 40);

        a1 = new JLabel("Tratamiento:");
        a1.setForeground(Color.BLACK);
        a1.setFont(new Font("Arial", Font.PLAIN, 17));
        a1.setBounds(5, 20, 140, 40);
        x1 = new JLabel();
        x1.setForeground(Color.BLACK);
        x1.setBorder(BorderFactory.createLineBorder(Color.black));
        x1.setFont(new Font("Arial", Font.PLAIN, 17));
        x1.setBounds(100, 30, 140, 20);

        a2 = new JLabel("Nombre:");
        a2.setForeground(Color.BLACK);
        a2.setFont(new Font("Arial", Font.PLAIN, 17));
        a2.setBounds(5, 50, 140, 40);
        x2 = new JLabel();
        x2.setForeground(Color.BLACK);
        x2.setBorder(BorderFactory.createLineBorder(Color.black));
        x2.setFont(new Font("Arial", Font.PLAIN, 17));
        x2.setBounds(70, 60, 140, 20);

        a3 = new JLabel("Apellidos:");
        a3.setForeground(Color.BLACK);
        a3.setFont(new Font("Arial", Font.PLAIN, 17));
        a3.setBounds(5, 80, 140, 40);
        x3 = new JLabel();
        x3.setForeground(Color.BLACK);
        x3.setBorder(BorderFactory.createLineBorder(Color.black));
        x3.setFont(new Font("Arial", Font.PLAIN, 17));
        x3.setBounds(77, 90, 140, 20);

        a4 = new JLabel("Dirección:");
        a4.setForeground(Color.BLACK);
        a4.setFont(new Font("Arial", Font.PLAIN, 17));
        a4.setBounds(5, 110, 140, 40);
        x4 = new JLabel();
        x4.setForeground(Color.BLACK);
        x4.setBorder(BorderFactory.createLineBorder(Color.black));
        x4.setFont(new Font("Arial", Font.PLAIN, 17));
        x4.setBounds(83, 120, 140, 20);

        a5 = new JLabel("Ciudad:");
        a5.setForeground(Color.BLACK);
        a5.setFont(new Font("Arial", Font.PLAIN, 17));
        a5.setBounds(5, 140, 140, 40);
        x5 = new JLabel();
        x5.setForeground(Color.BLACK);
        x5.setBorder(BorderFactory.createLineBorder(Color.black));
        x5.setFont(new Font("Arial", Font.PLAIN, 17));
        x5.setBounds(64, 150, 140, 20);

        a6 = new JLabel("Preferencia:");
        a6.setForeground(Color.BLACK);
        a6.setFont(new Font("Arial", Font.PLAIN, 17));
        a6.setBounds(5, 170, 140, 40);
        x6 = new JLabel();
        x6.setForeground(Color.BLACK);
        x6.setBorder(BorderFactory.createLineBorder(Color.black));
        x6.setFont(new Font("Arial", Font.PLAIN, 17));
        x6.setBounds(100, 180, 140, 20);

        // Register a listener for all.
        r1.addActionListener(this);
        r2.addActionListener(this);
        b1.addActionListener(this);
        combo1.addActionListener(this);
        ch1.addActionListener(this);
        ch2.addActionListener(al);
        b2.addActionListener(al);

        // imagen
        image = new ImageIcon("Tareas_Cuarentena/pedro.jpg");
        img = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        image = new ImageIcon(img);

        image2 = new ImageIcon("Tareas_Cuarentena/vilma.jpg");
        img2 = image2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        image2 = new ImageIcon(img2);

        // Labels panel2
        p2.add(titulo);
        p2.add(a1);
        p2.add(a2);
        p2.add(a3);
        p2.add(a4);
        p2.add(a5);
        p2.add(a6);
        p2.add(x1);
        p2.add(x2);
        p2.add(x3);
        p2.add(x4);
        p2.add(x5);
        p2.add(x6);
        // Buttons
        p1.add(b1);
        p1.add(b2);
        // checkbutton
        p1.add(ch1);
        p1.add(ch2);
        // combo box
        p1.add(combo1);
        // text
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        // labels
        p1.add(l7);
        p1.add(l6);
        p1.add(l5);
        p1.add(l4);
        p1.add(l3);
        p1.add(l2);
        // radiobutton
        p1.add(r2);
        p1.add(r1);
        // Panels
        f1.add(p2);
        f1.add(p1);
        f1.add(titulo1);
        f1.add(l1);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new labo_pedro();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            titulo1.setIcon(image);
        } else if (r2.isSelected()) {
            titulo1.setIcon(image2);
        }
        if (e.getSource() == b1) {
            if (r1.isSelected()) {
                x1.setText(r1.getText() + "");
            } else if (r2.isSelected()) {
                x1.setText(r2.getText() + "");
            }
            x2.setText(t1.getText() + "");
            x3.setText(t2.getText() + "");
            x4.setText(t3.getText() + "");
            x5.setText(combo1.getSelectedItem() + "");

            if (ch1.isSelected()) {
                x6.setText(ch1.getText() + "");
            } else if (ch2.isSelected()){
                x6.setText(ch2.getText() + "");
            }else{
                x6.setText("");
            }
            if(ch1.isSelected() && ch2.isSelected()){
                x6.setText(ch1.getText() + ", "+ch2.getText());
            }
        }
    }

    ActionListener al = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == b2){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                x1.setText("");
                x2.setText("");
                x3.setText("");
                x4.setText("");
                x5.setText("");
                x6.setText("");
            }
        }
    };
}

    