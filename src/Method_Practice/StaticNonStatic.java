package Method_Practice;

public class StaticNonStatic {

    //default constructort --->same name as the classname, no void/static
    //optional to create default constructor
    public StaticNonStatic(){

    }

    public static void main(String[] args){
        myCollege();//can go inside static method
        //printMYName();---shows error

        //object creation of the class
        StaticNonStatic refferenVariable = new StaticNonStatic();
        //nameofTheClassThat we went to crete obj of  --refferneceVariable of the Class (= new)--->law ---nameofTheConsttuctor
        refferenVariable.printMe();
    }
    public static void myCollege(){
        System.out.println("XYZ College");
    }
    public void printMyName(){
        System.out.println("Zann");
    }
    // if you don't use the keyword static ---->it Becomes non static
    public void printMyAge(){
        System.out.println("00");
        
    }
    public void printMe(){
        myCollege();//can go inside non-static method
        printMyName();
        printMyAge();
        
    }

    //static ---> keyword
    // 1. static method/varible --->can go inside static method or non static
    //method
    // 2. non-static method/variable ----> can go inside non -static method only
    //if we still have to call non static method, we should create objects of the class
}
