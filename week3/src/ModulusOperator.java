public class ModulusOperator {

    public static void main (String[] args) {
        int number1, number2, number3;
        number1 = 2577;
        number2 = 2;
        number3 = number1 % number2;

        System.out.println(number3);

        if(number3 == 1) {
            System.out.println(number1 + " is an even number");

            //do something
        } else {
            //do something else

            System.out.println(number1 + " is an ODD number");
        }

// we are going shopping

//        double tax, priceOfItem, taxOnItem, totalPrice;
//        tax = .10;
//        priceOfItem = 100.00;
//        taxOnItem = priceOfItem * tax;
//        totalPrice = priceOfItem + taxOnItem;
//
//        System.out.println("Price of item $" +priceOfItem+ " dollars");
//        System.out.println("Tax $" +taxOnItem+ " dollars");
//        System.out.println("Price including tax $" +totalPrice+ " dollars");

   // double priceOfItem = 100;
        // tax is 10%

        double priceOfItem = 100;
        priceOfItem *= 1.10;

        System.out.println("Total price of item is: " +priceOfItem+ " dollars");
        System.out.print("Total price of item is: ");
        System.out.printf("$%.2f dollars", priceOfItem);







    }







}
