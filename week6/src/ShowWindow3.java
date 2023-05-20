import javax.swing. *;
import java.awt.*;

public class ShowWindow3 extends JFrame {
    JLabel messageLabel;
    JLabel messageLabel2;
    JTextField whitespace;
    JTextField whitespace2;

    final int WINDOW_WIDTH = 500;
    final int WINDOW_HEIGHT = 700;

    public static void main(String[] args) {
        new ShowWindow3();
    }

    public ShowWindow3() {
        setTitle("My Simple Window");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        getContentPane().setBackground(Color.red);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel("My First Big Label");
        messageLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        messageLabel2 = new JLabel("My First Big Label 2");
        messageLabel2.setFont(new Font("Verdana", Font.BOLD,24));
        whitespace = new JTextField();
        whitespace2 = new JTextField();

        messageLabel.setBounds(0,0,500,50);
        whitespace.setBounds(0,50,450,80);
        messageLabel2.setBounds(0,150,500,50);
        whitespace2.setBounds(0,200, 450,80);

        add(messageLabel);
        add(messageLabel2);
        add(whitespace);
        add(whitespace2);

        setVisible(true);
    }





}
