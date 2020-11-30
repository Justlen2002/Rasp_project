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
        M1.setBorder(new LineBorder(Color.BLACK,1));
        M1.setBackground(Color.WHITE);
        M2.setLayout(new FlowLayout(15,10,10));
        M2.setBackground(Color.WHITE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.WHITE);
     //   panel3.setBorder(new LineBorder(Color.BLACK,1));
        panel2.setLayout(new GridLayout(10,1,2,2));
        panel3.setLayout(new GridLayout(10,1,2,2));

        JLabel tl1 = new JLabel("100001");
        tl1.setPreferredSize(new Dimension(100,40));
        JLabel tl2 = new JLabel("100002");
        tl2.setPreferredSize(new Dimension(100,40));
        JLabel tl3 = new JLabel("100003");
        tl3.setPreferredSize(new Dimension(100,40));
        JLabel tl4 = new JLabel("100004");
        tl4.setPreferredSize(new Dimension(100,40));
        JLabel tl5 = new JLabel("100005");
        tl5.setPreferredSize(new Dimension(100,40));
        JButton tb6 = new JButton("Lop HP1");
        tb6.setPreferredSize(new Dimension(100,40));
        tb6.setBorderPainted(false);  // Xoa vien
    //    tb6.setContentAreaFilled(false);
        JButton tb7 = new JButton("Lop HP2");
        tb7.setPreferredSize(new Dimension(100,40));
        tb7.setBorderPainted(false);
        JButton tb8 = new JButton("Lop HP3");
        tb8.setPreferredSize(new Dimension(100,40));
        tb8.setBorderPainted(false);
        JButton tb9 = new JButton("Lop HP4");
        tb9.setPreferredSize(new Dimension(100,40));
        tb9.setBorderPainted(false);
        JButton tb10 = new JButton("Lop HP5");
        tb10.setPreferredSize(new Dimension(100,40));
        tb10.setBorderPainted(false);

        JTextField txt1 = new JTextField();
        JButton bt1 = new JButton();
        txt1.setPreferredSize(new Dimension(500,40));
        bt1.setPreferredSize(new Dimension(50,40));



        panel1.add(txt1);
        panel1.add(bt1);
        panel2.add(tl1);
        panel3.add(tb6);
        panel2.add(tl2);
        panel3.add(tb7);
        panel2.add(tl3);
        panel3.add(tb8);
        panel2.add(tl4);
        panel3.add(tb9);
        panel2.add(tl5);
        panel3.add(tb10);
        M2.add(panel2, BorderLayout.WEST);
        M2.add(panel3, BorderLayout.CENTER);
        M1.add(panel1);
        this.add(M1, BorderLayout.NORTH);
        this.add(M2, BorderLayout.CENTER);

    }
}
