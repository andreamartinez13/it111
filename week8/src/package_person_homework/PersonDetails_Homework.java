package package_person_homework;

public class PersonDetails_Homework {
    public static void main(String[] args) {
        Person_homework firstPerson;
        Person_homework  secondPerson;
        Person_homework thirdPerson;

        //I am in the process of creating an object from my Person class

        firstPerson = new Person_homework ();
        secondPerson = new Person_homework ();
        thirdPerson = new Person_homework();

        // we will be entering the info, but assigning values to our fields

        firstPerson.name = "Cathy Jones";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2023;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Black";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2015;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Ariel Martinez";
        thirdPerson.gender = 'F';
        thirdPerson.age = 50;
        thirdPerson.car = 1990;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double plusRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " + firstPerson.getRate(monthlyRate) + " dollars!");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate) +" dollars!");
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) +firstPerson.getRate(monthlyRate) +firstPerson.modelRate(plusRate));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " + secondPerson.getRate(monthlyRate) + " dollars!");
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate) +" dollars!");
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) +secondPerson.getRate(monthlyRate) +secondPerson.modelRate(plusRate));

        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " +thirdPerson.name+ ": " + thirdPerson.getRate(monthlyRate) + " dollars!");
        System.out.println("Adjustments: " +thirdPerson.assumeGender(adjustedRate) +" dollars!");
        System.out.print("Here is " +thirdPerson.name+ "'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) +thirdPerson.getRate(monthlyRate) +thirdPerson.modelRate(plusRate));


    }



}
