package Method_Practice;

public class Barcelona {
    public static void main(String[] args) {
        printStudium();
        Barcelona objName = new Barcelona();
        objName.bestPlayer();
    }
    //create a static and a non static method and call the both methods inside the main mathod
    public static void printStudium() {
        System.out.println("Camp Nu");
    }

    public static void printStadium() {
    }

    public void bestPlayer(){
        System.out.println("L Messi");

}
}
