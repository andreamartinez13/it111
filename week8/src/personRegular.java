import java.util.SortedMap;

public class personRegular {

    public static void main(String[] args) {

        // we are going to create our variables first (Name, gender, age, type of car, driving violation, credit scores) in that orden
        // Char variable is for 1 letter only (string is multiple char)

        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagen Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;

        //one variable for each person
        double monthlyRate1;
        double monthlyRate2;

        double adjustedRate1;
        double adjustedRate2;

        double total1;
        double total2;

        // adding logic in the car insurance industry with an if condition (meaning: if you have traffic tickets, DUI's, etc. You will pay more for car insurance)

        if(firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

        // Second Person if condition
        if(secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;
        } else {
            monthlyRate2 = 100;
        }

        // Adding more questions: Will gender and age makes a difference?

        // first person if condition with genter and age
        if(firstPersonAge <= 25 && firstPersonGender == 'F') {
            adjustedRate1 = 100;
        } else {
            adjustedRate1 = 0;
        }

        // Second person if condition with gender and age
        if(secondPersonAge <= 25 && secondPersonGender == 'M') {
            adjustedRate2 = 100;
        } else {
            adjustedRate2 = 0;
        }

        // this operation need to have value before run it before (Placement important!!)

        total1 = monthlyRate1 + adjustedRate1;
        total2 = monthlyRate2 + adjustedRate2;

        //Printing results

        System.out.println("First Person Name: " + firstPersonName);
        System.out.println("First Person Gender: " + firstPersonGender);
        System.out.println("First Person Age: " + firstPersonAge);
        System.out.println("First Person Car: " + firstPersonCar);
        System.out.println("First Person Violations: " + firstPersonViolations);
        System.out.println("First Person Credit Score: " + firstPersonCreditScore);
        System.out.println("First Person Preliminary Rate: " + monthlyRate1);
        System.out.println("First Person Final Monthly Rate (including gender and age): " + total1);

        // adding blank space between 2 person
        System.out.println();

        System.out.println("Second Person Name: " + secondPersonName);
        System.out.println("Second Person Gender: " + secondPersonGender);
        System.out.println("Second Person Age: " + secondPersonAge);
        System.out.println("Second Person Car: " + secondPersonCar);
        System.out.println("Second Person Violations: " + secondPersonViolations);
        System.out.println("Second Person Credit Score: " + secondPersonCreditScore);
        System.out.println("Second Person Monthly Rate: "+ monthlyRate2);
        System.out.println("Second Person Preliminary Rate: " + monthlyRate2);
        System.out.println("Second Person Final Monthly Rate (including gender and age): " + total2);

    }
}
