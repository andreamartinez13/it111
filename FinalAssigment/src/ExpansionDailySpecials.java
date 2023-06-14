import java.util.Scanner;

public class ExpansionDailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Only Monday to Friday!)");

        specials = input.next();
        
//        input.close();

        //in the world of coffee I name of a coffee beverage and a price

        String coffee = null;
        double price = 0;

        boolean saturday = true;
        boolean sunday = true;

        // I would like to make a while loop to keep printing the message while saturday and sunday are being written
        while (saturday || sunday) {

            saturday = specials.equals("Saturday");
            sunday = specials.equals("Sunday");

            if (saturday || sunday) {
                System.out.println("Please enter a weekday, not weekend!");
                specials = input.next();


            }


            // I changed the specials value to keep checking the booleans and break the while loop
            saturday = specials.equals("Saturday");
            sunday = specials.equals("Sunday");



            switch (specials) {
                // my cases are the day of the week

                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                    System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price will be $");
                    System.out.printf("%.2f dollars!", price);
                }
                case "Tuesday" -> {
                    coffee = "Americano";
                    price = 1.50;
                    System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price will be $");
                    System.out.printf("%.2f dollars!", price);
                }
                case "Wednesday" -> {
                    coffee = "Iced Latte";
                    price = 5.10;
                    System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price will be $");
                    System.out.printf("%.2f dollars!", price);
                }
                case "Thursday" -> {
                    coffee = "Lavender Latte";
                    price = 6.80;
                    System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price will be $");
                    System.out.printf("%.2f dollars!", price);
                }
                case "Friday" -> {
                    coffee = "Seattle Fog";
                    price = 4.70;
                    System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price will be $");
                    System.out.printf("%.2f dollars!", price);
                }


                default -> System.out.println("Please only enter weekdays or check spelling (Cap-case at the beginning!)");
            }

            if (coffee != null) {

                System.out.println();

                System.out.println("How many " + coffee + "s would you like?");

                int coffeesOrdered = input.nextInt();
                double RegularPriceWithoutDiscount = coffeesOrdered * price;

                //if the customer doesn't want any coffees (inters zero)
                if (coffeesOrdered <= 0) {
                    System.out.println("Looks like you don't like any " + coffee + "s at the time. Sad :( ");
                }

                // if the customer wants more than 1
                if (coffeesOrdered >= 1 && coffeesOrdered <5) {

                    System.out.print(+coffeesOrdered + " " + coffee + "s have been ordered today.");
                    System.out.printf(" Totalling %.2f dollars!", coffeesOrdered * price);

                }
                //if the customer wants 5 or more
                if (coffeesOrdered >= 5 && coffeesOrdered <10) {
                    System.out.print("Looks like you qualify for a group discount! Your regular price is ");
                    System.out.printf("%.2f dollars!", coffeesOrdered * price);

                    System.out.println();
                    System.out.print("You have ordered " +coffeesOrdered+ " " +coffee+ "s but you will be only charged ");
                    System.out.printf("%.2f dollars!",  +RegularPriceWithoutDiscount * .90);

                }

                // if the customer wants more than 10
                if (coffeesOrdered >=10) {
                    System.out.print("You will receive a BIG group discount! Your regular price is ");
                    System.out.printf("%.2f dollars!", coffeesOrdered * price);

                    System.out.println();
                    System.out.print("You have ordered " +coffeesOrdered+ " " +coffee+ "s but you will be only charged ");
                    System.out.printf("%.2f dollars!",  +RegularPriceWithoutDiscount * .80);

                }

            }


        }


    }
}



