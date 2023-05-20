import javax.swing. *;
import java.awt.*;

public class ShowWindow3 extends JFrame {
    JLabel messageLabel;
    JLabel messageLabel2;
    JTextField whitespace;
    JTextField whitespace2;

    final int WINDOW_WIDTH = 900;
    final int WINDOW_HEIGHT = 900;

    public static void main(String[] args) {
        new ShowWindow3();
    }

    public ShowWindow3() {
        setTitle("My Simple Window");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        getContentPane().setBackground(Color.red);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel("My First Big Label");
        messageLabel2 = new JLabel("My First Big Label 2");
//        messageLabel.setForeground(Color.black);
//        messageLabel.setVerticalTextPosition(JLabel.BOTTOM);
//        messageLabel.setHorizontalTextPosition(JLabel.CENTER);
//        whitespace.add(messageLabel);
        add(messageLabel);
        add(messageLabel2);

        whitespace = new JTextField(10);
        whitespace2 = new JTextField(10);
//        whitespace.setSize(new Dimension(10,10));
//        whitespace.setBounds(0,0,100,100);
        whitespace.setBackground(Color.BLACK);
//        whitespace.setLocation(0,0);
        whitespace2.setBounds(0,0, 100,100);
        whitespace2.setBackground(Color.BLUE);
        add(whitespace);

        add(whitespace2);

        setVisible(true);
    }





}
