package tareas_mayo;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cajero_A  implements ActionListener{
    private JFrame f;
    private JPanel p,p1;
    private JTextField text1,z1,z2,z3,z4,z5,z6,z7,z8,g1,g2,g3,g4,g5,g6,g7,g8,mn;
    private JButton b1,b2,b3;
    private JLabel l1,l2,l3,l4,l5,l6,l7,a1,a2,a3,a4,a5,a6,a7,a8;
    private int num1,suma1,suma2,suma3,suma4,suma5,suma6,suma7,suma8,smn;

    public Cajero_A(){
        F_A();
    }

    public void F_A(){
        f = new JFrame();
        f.setTitle("Cajero");
        f.setSize(500, 530);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P_A();
        B_A();
        T_E();
        L_A();
        f.setVisible(true);
    }

    public void L_A(){
        l1 = new JLabel("Banco popular de los pobres");
        l1.setFont(new Font("Arial", Font.BOLD, 25));
        l1.setBounds(60, 20, 350, 30);

        l2 = new JLabel("Arqueo de Caja");
        l2.setFont(new Font("Arial", Font.BOLD, 15));
        l2.setBounds(180, 50, 200, 30);

        l3 = new JLabel("Cantidad:");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setBounds(25, 85, 350, 30);

        f.add(l3);
        f.add(l2);
        f.add(l1);
    }

    public void B_A(){
        b1 = new JButton("Calcular");
        b1.setBounds(250, 87, 85,25);
        b1.addActionListener(this);
        b2 = new JButton("Nuevo");
        b2.setBounds(350, 87, 85,25);
        b2.addActionListener(al);
        b3 = new JButton("Salir");
        b3.setBounds(200, 460, 85,25);
        b3.addActionListener(al1);

        f.add(b3);
        f.add(b2);
        f.add(b1);
    }

    public void T_E(){
        text1 = new JTextField();
        text1.setBounds(90, 87, 90, 25);

        f.add(text1);
    }

    public void P_A(){
        p = new JPanel();
        p.setBackground(Color.green);
        Border raised = BorderFactory.createRaisedBevelBorder();
        p.setBorder(raised);
        p.setBounds(20, 120, 445, 335);

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBorder(raised);
        p1.setBackground(Color.lightGray);
        p1.setBounds(27, 130, 430, 320);

        l4 = new JLabel("Denominación");
        l4.setFont(new Font("Arial", Font.BOLD, 10));
        l4.setBounds(20, 20, 350, 30);

        l5 = new JLabel("Cantidad");
        l5.setFont(new Font("Arial", Font.BOLD, 10));
        l5.setBounds(155, 20, 350, 30);

        l6 = new JLabel("Cant. Lempiras(L...)");
        l6.setFont(new Font("Arial", Font.BOLD, 10));
        l6.setBounds(260, 20, 350, 30);

        l7 = new JLabel("Monto Total:");
        l7.setFont(new Font("Arial", Font.BOLD, 15));
        l7.setBounds(160, 283, 350, 30);

        //labels2
        a1 = new JLabel("500");
        a1.setFont(new Font("Arial", Font.BOLD, 10));
        a1.setBounds(45, 45, 350, 30);

        a2 = new JLabel("100");
        a2.setFont(new Font("Arial", Font.BOLD, 10));
        a2.setBounds(45, 75, 350, 30);

        a3 = new JLabel("50");
        a3.setFont(new Font("Arial", Font.BOLD, 10));
        a3.setBounds(45, 104, 350, 30);

        a4 = new JLabel("20");
        a4.setFont(new Font("Arial", Font.BOLD, 10));
        a4.setBounds(45, 130, 350, 30);

        a5 = new JLabel("10");
        a5.setFont(new Font("Arial", Font.BOLD, 10));
        a5.setBounds(45, 160, 350, 30);

        a6 = new JLabel("5");
        a6.setFont(new Font("Arial", Font.BOLD, 10));
        a6.setBounds(45, 190, 350, 30);

        a7 = new JLabel("2");
        a7.setFont(new Font("Arial", Font.BOLD, 10));
        a7.setBounds(45, 220, 350, 30);

        a8 = new JLabel("1");
        a8.setFont(new Font("Arial", Font.BOLD, 10));
        a8.setBounds(45, 255, 350, 30);

        //textcanti
        z1 = new JTextField();
        z1.setFont(new Font("Arial", Font.BOLD, 10));
        z1.setHorizontalAlignment(JTextField.CENTER);
        z1.setBounds(160, 45, 35, 20);
        
        z2 = new JTextField();
        z2.setFont(new Font("Arial", Font.BOLD, 10));
        z2.setHorizontalAlignment(JTextField.CENTER);
        z2.setBounds(160, 75, 35, 20);

        z3 = new JTextField();
        z3.setFont(new Font("Arial", Font.BOLD, 10));
        z3.setHorizontalAlignment(JTextField.CENTER);
        z3.setBounds(160, 104, 35, 20);
        
        z4 = new JTextField();
        z4.setFont(new Font("Arial", Font.BOLD, 10));
        z4.setHorizontalAlignment(JTextField.CENTER);
        z4.setBounds(160, 130, 35, 20);

        z5 = new JTextField();
        z5.setFont(new Font("Arial", Font.BOLD, 10));
        z5.setHorizontalAlignment(JTextField.CENTER);
        z5.setBounds(160, 160, 35, 20);
        
        z6 = new JTextField();
        z6.setFont(new Font("Arial", Font.BOLD, 10));
        z6.setHorizontalAlignment(JTextField.CENTER);
        z6.setBounds(160, 190, 35, 20);

        z7 = new JTextField();
        z7.setFont(new Font("Arial", Font.BOLD, 10));
        z7.setHorizontalAlignment(JTextField.CENTER);
        z7.setBounds(160, 220, 35, 20);
        
        z8 = new JTextField();
        z8.setFont(new Font("Arial", Font.BOLD, 10));
        z8.setHorizontalAlignment(JTextField.CENTER);
        z8.setBounds(160, 255, 35, 20);

        //textcanti2
        g1 = new JTextField();
        g1.setFont(new Font("Arial", Font.BOLD, 10));
        g1.setHorizontalAlignment(JTextField.RIGHT);
        g1.setBounds(258, 45, 100, 20);
        
        g2 = new JTextField();
        g2.setFont(new Font("Arial", Font.BOLD, 10));
        g2.setHorizontalAlignment(JTextField.RIGHT);
        g2.setBounds(258, 75, 100, 20);

        g3 = new JTextField();
        g3.setFont(new Font("Arial", Font.BOLD, 10));
        g3.setHorizontalAlignment(JTextField.RIGHT);
        g3.setBounds(258, 104, 100, 20);
        
        g4 = new JTextField();
        g4.setFont(new Font("Arial", Font.BOLD, 10));
        g4.setHorizontalAlignment(JTextField.RIGHT);
        g4.setBounds(258, 130, 100, 20);

        g5 = new JTextField();
        g5.setFont(new Font("Arial", Font.BOLD, 10));
        g5.setHorizontalAlignment(JTextField.RIGHT);
        g5.setBounds(258, 160, 100, 20);
        
        g6 = new JTextField();
        g6.setFont(new Font("Arial", Font.BOLD, 10));
        g6.setHorizontalAlignment(JTextField.RIGHT);
        g6.setBounds(258, 190, 100, 20);

        g7 = new JTextField();
        g7.setFont(new Font("Arial", Font.BOLD, 10));
        g7.setHorizontalAlignment(JTextField.RIGHT);
        g7.setBounds(258, 220, 100, 20);
        
        g8 = new JTextField();
        g8.setFont(new Font("Arial", Font.BOLD, 10));
        g8.setHorizontalAlignment(JTextField.RIGHT);
        g8.setBounds(258, 255, 100, 20);

        mn = new JTextField();
        mn.setFont(new Font("Arial", Font.BOLD, 10));
        mn.setHorizontalAlignment(JTextField.RIGHT);
        mn.setBounds(258, 285, 100, 20);

        p1.add(mn);
        p1.add(g1);
        p1.add(g2);
        p1.add(g3);
        p1.add(g4);
        p1.add(g5);
        p1.add(g6);
        p1.add(g7);
        p1.add(g8);
        p1.add(z1);
        p1.add(z2);
        p1.add(z3);
        p1.add(z7);
        p1.add(z6);
        p1.add(z5);
        p1.add(z4);
        p1.add(z8);
        p1.add(a8);
        p1.add(a7);
        p1.add(a6);
        p1.add(a5);
        p1.add(a4);
        p1.add(a3);
        p1.add(a2);
        p1.add(a1);
        p1.add(l7);
        p1.add(l6);
        p1.add(l5);
        p1.add(l4);
        f.add(p1);
        f.add(p);
    }

    public static void main(String[] args) {
        new Cajero_A();
    }

    @Override
        public void actionPerformed(ActionEvent e){
            num1 = Integer.parseInt(text1.getText());
            int dinero[] = new int[9];
            if(e.getSource()==b1){
                while(num1>0){
                    while(num1-500>=0){
                        num1 = num1-500;
                        dinero[0]++;
                    }
                    while(num1-100>=0){
                        num1 = num1-100;
                        dinero[1]++;
                    }
                    while(num1-50>=0){
                        num1 = num1-50;
                        dinero[2]++;
                    }
                    while(num1-20>=0){
                        num1 = num1-20;
                        dinero[3]++;
                    }
                    while(num1-10>=0){
                        num1 = num1-10;
                        dinero[4]++;
                    }
                    while(num1-5>=0){
                        num1 = num1-5;
                        dinero[5]++;
                    }
                    while(num1-2>=0){
                        num1 = num1-2;
                        dinero[6]++;
                    }
                    while(num1-1>=0){
                        num1 = num1-1;
                        dinero[7]++;
                    }

                    for(int i=0;i<9;i++){
                        if(i==0){
                            z1.setText(dinero[i]+"");
                            suma1 = 500*dinero[i];
                            g1.setText(""+suma1);
                        }else if(i==1){
                            z2.setText(dinero[i]+"");
                            suma2 = 100*dinero[i];
                            g2.setText(""+suma2);
                        }else if(i==2){
                            z3.setText(dinero[i]+"");
                            suma3 = 50*dinero[i];
                            g3.setText(""+suma3);
                        }else if(i==3){
                            z4.setText(dinero[i]+"");
                            suma4 = 20*dinero[i];
                            g4.setText(""+suma4);
                        }else if(i==4){
                            z5.setText(dinero[i]+"");
                            suma5 = 10*dinero[i];
                            g5.setText(""+suma5);
                        }else if(i==5){
                            z6.setText(dinero[i]+"");
                            suma6 = 5*dinero[i];
                            g6.setText(""+suma6);
                        }else if(i==6){
                            z7.setText(dinero[i]+"");
                            suma7 = 2*dinero[i];
                            g7.setText(""+suma7);
                        }else if(i==7){
                            z8.setText(dinero[i]+"");
                            suma8 = 1*dinero[i];
                            g8.setText(""+suma8);
                        }
                    }
                    smn = suma1+suma2+suma3+suma4+suma5+suma6+suma7+suma8;
                    mn.setText(""+smn);
                }
            }
        }

        ActionListener al = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == b2){
                    text1.setText("");
                    z1.setText("");
                    z2.setText("");
                    z3.setText("");
                    z4.setText("");
                    z5.setText("");
                    z6.setText("");
                    z7.setText("");
                    z8.setText("");
                    g1.setText("");
                    g2.setText("");
                    g3.setText("");
                    g4.setText("");
                    g5.setText("");
                    g6.setText("");
                    g7.setText("");
                    g8.setText("");
                    mn.setText("");
                }
            }
        };

        ActionListener al1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == b3){
                    System.exit(0);
                }
            }
        };
}