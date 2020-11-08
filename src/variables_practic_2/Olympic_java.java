package variables_practic_2;

public class Olympic_java {
    // static --->keyword
    //1 . static method/variable --->can go inside static method or non static method,
    //if in the same class it can go directly , but if in different class we need to
    //specify name of the class.method/variable name;

    //2 .non-static method/variable--->can go inside non-static method in the same class directly
    //if we still have to call non static methods/variable inside static method, we should create objects class
    //same class or different class

    public static void main(String[] args){
        //print details from the usa and canada
        System.out.println(Canada_java.province);

        USA_java objOfUSA = new USA_java();
        System.out.println("objOfUSA.name");

        System.out.println(Laptop_java.company);
    }
}
