import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BG_client_1 extends JFrame {

    public static void main(String arg[]){
        BG_client_1 window = new BG_client_1();
        window.setVisible(true);
    }
    public BG_client_1(){
        this.setSize(300,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel M1 = new JPanel();
        JPanel M2 = new JPanel();
        M1.setLayout(new FlowLayout(15,25,200));
        M1.setBackground(Color.WHITE);
//        M1.setBorder(new LineBorder(Color.BLACK,3));
        M2.setLayout(new FlowLayout(15,100,50));
        M2.setBackground(Color.WHITE);
  //      M2.setBorder(new LineBorder(Color.CYAN,3));


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);

//        panel1.setBorder(new LineBorder(Color.BLACK,3));
        JTextArea txt1 = new JTextArea("User name");
        JTextArea txt2 = new JTextArea("Password");

 //       panel2.setBorder(new LineBorder(Color.BLACK,3));
        JButton bt1 = new JButton("Log in");

        panel1.setLayout(new GridLayout(2,1,10,10));
        panel2.setLayout(new GridLayout(1,1,10,10));
 //       this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.RED));

        txt1.setPreferredSize(new Dimension(250,32));
        txt2.setPreferredSize(new Dimension(250,32));
        bt1.setPreferredSize(new Dimension(100,32));

        panel1.add(txt1);
        panel1.add(txt2);
        panel2.add(bt1);
        M1.add(panel1);
        M2.add(panel2);
        this.add(M1, BorderLayout.CENTER);
        this.add(M2, BorderLayout.SOUTH);

    }
}
