public class MyOperators2 {

    public static void main(String[] args) {

//        boolean tuna = true;
//        boolean bread = true;
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }


        boolean tuna = false;
        boolean bread = true;
        if (tuna == true || bread == true) {
            System.out.println("We are having some food products");
        } else {
                System.out.println("Not eating any food products today");
        }


        // drinking age
        int age = 18;

        if(age <= 38) {
            System.out.println("Yippy, we can order beer");
        } else {
            System.out.println("Only diet coke");
        }


        // amusement park roller coaster ride - smaller than 4 feet

        float height = 4f;

        if(height < 4) {
            System.out.println("You will not ride");

        } else {
            System.out.println("You can ride");

                }

    }
}

