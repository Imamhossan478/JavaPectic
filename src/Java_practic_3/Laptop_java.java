package Java_practic_3;

public class Laptop_java { // parameterization of constructor
   int yearFromClass;// goal : set these date using the constructor
   String modelFromClass;
   String makeFromClass;
   String keysFromClass;

   // default constructor
    public Laptop_java(){


    }
    public Laptop_java(int yearFromConstructor, String modelFromConstructor){
        this.yearFromClass = yearFromConstructor;
        this.modelFromClass = modelFromConstructor;

    }
    public Laptop_java(int yearFromConstructor,String keysFromConstructor,String modelFromConstructor){
        this.yearFromClass = yearFromConstructor;
        this.keysFromClass = keysFromConstructor;
        this.modelFromClass = modelFromConstructor;
    }
    public Laptop_java(int yearFromConstructor){
        this.yearFromClass = yearFromConstructor;
    }
    public static void main(String[] args) { // psvm
        Laptop_java Laptop_java = new Laptop_java();
        Laptop_java.printDetailsOfLaptop_java();

        Laptop_java Laptop_java3 = new Laptop_java(2019);
        Laptop_java3.printDetailsOfLaptop_java();
    }
    public void printDetailsOfLaptop_java(){
        System.out.println(yearFromClass);
        System.out.println(modelFromClass);//sout

    }
}
