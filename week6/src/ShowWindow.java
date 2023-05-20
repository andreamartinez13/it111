import javax.swing. *;

public class ShowWindow {

    public static void main (String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        // CREATE A WINDOW

        JFrame window = new JFrame();
        // Scanner input = new Scanner(System.in)
        // Set the Tittle

        window.setTitle("My Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we do not the window, it will not display!
        // for displaying the window is in boolean

        window.setVisible(true);






    }




}
