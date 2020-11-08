package variables_practic_2;

public class Practice1APT_java {
    static String robot = "vacume clearner";
    //class level variables/global variable


    public static void main(String[] args) {
        bedRoom();
        kithchen();
    }

    public static void bedRoom() {
        //method level variable / local variable
        String furniture = "Bed";
        System.out.println(furniture);
        System.out.println(robot);
    }

    public static void kithchen() {
        String oven = "gas";
        System.out.println(oven);
        System.out.println(robot);

    }

}