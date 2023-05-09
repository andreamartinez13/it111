import java.util.Locale;
import java.util.Scanner;

public class DailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Only Monday to Friday!)");

        specials = input.next().toLowerCase();

//        input.close();

        //in the world of coffee I name of a coffee beverage and a price

        String coffee = null;
        double price = 0;

        boolean saturday = specials.equals("saturday");
        boolean sunday = specials.equals("sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }
        switch (specials) {
            // my cases are the day of the week

            case "monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);

                break;

            case "tuesday":
                coffee = "Americano";
                price = 1.50;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);

                break;

            case "wednesday":
                coffee = "Iced Latte";
                price = 5.10;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);

                break;

            case "thursday":
                coffee = "Lavender Latte";
                price = 6.80;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);

                break;

            case "friday":
                coffee = "Seattle Fog";
                price = 4.70;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);

                break;

            default:
                System.out.println("Please only enter weekdays or check spelling (Cap-case at the beginning!)");

        }
        if(coffee != null) {

            System.out.println("How many " + coffee + "s would you like?");

            int coffeesOrdered = input.nextInt();
            if (coffeesOrdered <= 0) {
                System.out.println("Looks like you don't like " + coffee + "s at the time. Sad :( ");
            } else {

                System.out.print(+coffeesOrdered + " " + coffee + " have been ordered today.");
                System.out.printf(" Totalling %.2f dollars!", coffeesOrdered * price);

            }
        }








    }



}
