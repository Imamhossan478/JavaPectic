package Method_Practice;

public class ChampionLeague {
    public static void main(String[] args) {

        Barcelona bercelonaObject = new Barcelona();
        RMadrid rMadridObject = new RMadrid();

        bercelonaObject.bestPlayer();
        rMadridObject.bestPlayer();
        RMadrid.printStadium();
        Barcelona.printStadium();
    }
     public void wordlXI(){
        Barcelona barcelonaObject = new Barcelona();
        barcelonaObject.bestPlayer();
    }
}
    //static --->keyword
    //1. static method/variable ---> can go inside static mmethod or non static method,
    // if bin the same class it can go directly , but if in different class we nedd to
    // specify name of the class.method name();


   //2. non- static method/variable ---> can go inside non-static mathod in the same class directly
   // if we still have to call non static methods inside static, we should create objects of the class
   // Same class or different class