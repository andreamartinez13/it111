package package_person_homework;

public class Person_homework {

    String name;
    char gender;
    int age;
    int car;
    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Customer name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Car: " +car);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);

    }

    // our logic is regarding our credit score and violations

    public double getRate(double monthlyRate) {
        if(violations == true && creditScore <= 700)  {
            monthlyRate = 500.00;

        } else {
            monthlyRate = 100.00;
        }
        //needs a return
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {

        if(gender == 'M' && age <= 25){
            adjustedRate = 100.00;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;

    }

    public double modelRate(double plusRate){
        if (car >= 2020) {
            plusRate = 100.00;
        } else {
            plusRate = 0.00;
        }
    return plusRate;

    }


}


