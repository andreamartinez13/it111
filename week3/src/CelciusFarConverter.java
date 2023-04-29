public class CelciusFarConverter {

    public static void main(String[] args) {

        // far = (cel * 9/5) + 32

        int cel, far;

        for(cel = 0; cel <= 100; cel = cel+1) {
            far = (cel * 9/5) + 32;
            System.out.println(cel + "degrees Celsius is equal to " +far+ " degrees Fahrenheit");

//            System.out.println(cel);
//            System.out.println(far);

        } // end of loop
        System.out.println("All Done!");




    }
}
