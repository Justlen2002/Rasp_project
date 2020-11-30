import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BG_Client_2 extends JFrame {
    public static void main(String arg[]){
        BG_Client_2 window = new BG_Client_2();
        window.setVisible(true);
    }
    public BG_Client_2(){
        this.setSize(1000,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel M1 = new JPanel();
        JPanel M2 = new JPanel();
        M1.setBorder(new LineBorder(Color.BLACK,3));
        M1.setBackground(Color.WHITE);
        M2.setBorder(new LineBorder(Color.BLACK,3));
        M2.setLayout(new FlowLayout(10,10,10));
        M2.setBackground(Color.WHITE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(new GridLayout(20,2,10,10));

        JTextArea tf1 = new JTextArea();
        JTextArea tf2 = new JTextArea();
        JTextArea tf3 = new JTextArea();
        JTextArea tf4 = new JTextArea();
        JTextArea tf5 = new JTextArea();
        JTextArea tf6 = new JTextArea();
        JTextArea tf7 = new JTextArea();
        JTextArea tf8 = new JTextArea();
        JTextArea tf9 = new JTextArea();
        JTextArea tf10 = new JTextArea();

        JTextField txt1 = new JTextField();
        JButton bt1 = new JButton();
        txt1.setPreferredSize(new Dimension(500,40));
        bt1.setPreferredSize(new Dimension(50,40));

        panel1.add(txt1);
        panel1.add(bt1);
        M1.add(panel1);
        this.add(M1, BorderLayout.NORTH);
        this.add(M2, BorderLayout.CENTER);

    }
}
