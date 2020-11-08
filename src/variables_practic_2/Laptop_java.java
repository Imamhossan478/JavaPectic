package variables_practic_2;

public class Laptop_java {

    //static ---->keyword
    //1 .static method/variable ---->can go inside static method or non static method,
    //if in the same class  it can go directly , but if in different class we need to
    //specify name of the class . method name();

    // 2 .n0n-static method/variable --->can go inside non-static method in the same class directly
    //if we still have to call non static method/variable inside static method,we should create object of the class
    // same class or different class

    protected static String company = "apple";
    int modelYear = 2020;

    public static void main(String[] args){
        Laptop_java objNameOfLaptop = new Laptop_java();
        objNameOfLaptop.printNumberOfkeys();
        printModelName();
        printCompany();
    }
    public static void printModelName() {
        String model = "macbook pro";
        System.out.println(model);
        System.out.println(company);

    Laptop_java objOfTheLaptop = new Laptop_java();
    System.out.println(objOfTheLaptop.modelYear);
}

    public static void printCompany() {
        System.out.println(company);
    }
    public void printNumberOfkeys(){
      System.out.println(32);
      System.out.println(company);
      System.out.println(modelYear);
    }
}