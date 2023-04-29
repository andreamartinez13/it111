import java.util.Arrays;
import java.util.Locale;

public class MyArrays {

    public static void main (String[] args){

//        String car = "volvo";

        String [] cars = new String[4];
        // in many computer programs we start counting with zero (not one)

        cars[0] = "Volvo";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Honda";

        System.out.println(cars[0].toUpperCase());
        System.out.println(Arrays.toString(cars));

//    String[] books = {"Handmaid's Tale", "Slenderman", "The Joy Luck", "It", "The Looming Tower"};

        String[] books = new String[5];

        books[0] = "Handmaid's Tale";
        books[1] = "Slenderman";
        books[2] = "The Joy Luck";
        books[3] = "It";
        books[4] = "The Looming Tower";

        System.out.println(Arrays.toString(books));

        // we're going to build for each loop

        for(String book : books) {
            System.out.println(book);

        }

        int[] numbers = new int[3];
        numbers [0] = 20;
        numbers [1] = 30;
        numbers [2] = 50;

        System.out.println(Arrays.toString(numbers));

        for(int number : numbers) {
            System.out.println(number);

        }

        String[] wines = new String[5];

        wines[0] = "Cabernet";
        wines[1] = "Merlot";
        wines[2] = "Syrah";
        wines[3] = "Malbec";
        wines[4] = "Cabernet-Frank";

        System.out.println(Arrays.toString(wines));
        for(String wine : wines) {
            System.out.println(wine);
            System.out.println(wine.length());
        }

        for(String wine : wines) {
            if(wine.equals("Syrah")) {
                break;

            }

            System.out.println(wine);

        }


    }

}
