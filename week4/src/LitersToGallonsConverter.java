public class LitersToGallonsConverter {
    public static void main(String[] args) {
// 3.79 Liters = 1.0 Gallon

        int counter = 0;

        float Liters;
        float Gallons;

        for (Gallons = 1; Gallons <= 100; Gallons = Gallons + 4) {
            Liters = (float) (Gallons * 3.79);
            System.out.printf("%.2f", Liters);

            if(Gallons ==1.0f) {
                System.out.println(" Liters = " + Gallons + " Gallon");

            } else {
                System.out.println(" Liters = " + Gallons + " Gallons");
            }
        counter += 1;

            if(counter == 5) {
                System.out.println();

                counter = 0;

            }

        }
        System.out.println("We are done!");
    }
}


