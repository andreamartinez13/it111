public class MyOperators {

    public static void main (String[] args) {

        // Arithmetic Operators
        // employee, wage, hours worked, overtime, the whole enchilada

        int regHours, overtimeHours;

        double overtimePay, regularPay, total;

        float wage;

        double hourlyWithOverTime;


        regHours = 40;
        overtimeHours = 5;
        wage = 25.50F; // Decimal number always need to have F (which means Float) to short the decimal number after the dot
        regularPay = regHours * wage;
        overtimePay = (wage * 1.5) * overtimeHours;
        total = overtimePay + regularPay;
        hourlyWithOverTime = total / (regHours + overtimeHours);


        System.out.println("Regular pay $" +regularPay+ " dollars");
        System.out.println("Overtime pay $" +overtimePay+ " dollars");
        System.out.println("Total pay $" +total+ " dollars");
        System.out.println("Hourly With Over Time $" +hourlyWithOverTime+ " Dollars");

        System.out.print("Hourly With Over Time:");
        System.out.printf("$%.2f dollars", hourlyWithOverTime);

















    }






}
