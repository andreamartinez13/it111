import java.util.Scanner;

public class MyEnum {

    enum WhoWins {HOME, VISITOR, NEITHER}

    public static void main(String[] args) {

// Now I am going to declare a variable

WhoWins who;
int seahawks, broncos;

Scanner input = new Scanner(System.in);

        System.out.println("Please enter the final score for the Seahawks");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Broncos");
        broncos = input.nextInt();

        // If the Seahawks score is greater than the broncos -

        if(seahawks > broncos) {
            who = WhoWins.HOME;
            // What WhoWins.HOME is an object of the WhoWins type
            System.out.println(who + " team won!");
            System.out.println("Seahawks win!");

        } else if(broncos > seahawks) {
            who = WhoWins.VISITOR;
            // What WhoWins.HOME is an object of the WhoWins type
            System.out.println(who + " team won!");
            System.out.println("Broncos win!");

        } else {
            who = WhoWins.NEITHER;
            // What WhoWins.HOME is an object of the WhoWins type
            System.out.println(who + " team won!");
            System.out.println("Neither win");

        }

    }






}
