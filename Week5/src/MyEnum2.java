public class MyEnum2 {

    enum Wines {CABERNET, MERLOT, SYRAH}

public static void main(String[] args) {
        Wines choose = Wines.MERLOT;

//    System.out.println(choose);

switch (choose) {
    case CABERNET -> {
        System.out.println("Love my WA Cabernets");
        break;
    }

    case MERLOT -> {
        System.out.println("The main character in the kitchen");
        break;
    }

    case SYRAH -> {
        System.out.println("I like some Syrahs");
        break;
    }



}


}

}
