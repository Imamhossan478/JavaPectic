package Method_Practice;

//package name : all lower case
// class name : Starts with lowerCase and then goes CamelCase
//variable/methodName :starts with lowerCase and then goes Camelcase
//constructor Name : Same name as class name ---> Starts with UpperCase and then goes CamelCase

public class TypesOfMethods {

    public static void main(String[] args) {

        printMyName();
        String cup = getMeACoffee();
        System.out.println(cup);
        System.out.println("I am throwing the " + cup);

        // className obj/refVar = new ConstrutorName();
        TypesOfMethods Typesofmethods = new TypesOfMethods();

        Typesofmethods.printMyAge();

        TypesOfMethods typesofmethods;
        int age = Typesofmethods.getMyAge();
        int newAge = age + 5;
        System.out.println("my age after 5 years from now is " + newAge);

        boolean answer = isItSunnyToday();
        System.out.println(answer);

    }

    private static boolean isItSunnyToday() {
        return false;
    }

    //static void method
    public static void printMyName(){
        System.out.println("Zann");

    }
    //non static return type method
    public static String getMeACoffee(){
        return "espresso";
    }
    //non static void method
    public void printMyAge(){
        System.out.println(25);
    }
    //static return type methods
    public int getMyAge(){
        return 30;
    }
    //public static/nonstatic datatype nameofTheMrthod(){
    //return " what you want to return";
    //}


}
