package Java_practic_3;

public class Phone_java {
    String model;
    String price;

    //1
    public Phone_java(){

    }
    //2

    public Phone_java(String nameOfTheModelFromConstructor){
        this.model = nameOfTheModelFromConstructor;

    }
    //3
    public Phone_java(String nameOfTheModelFromConstructor, String priceFromConstructor){
        this.model = nameOfTheModelFromConstructor;
        this.price = priceFromConstructor;

    }
    public static void main(String[] args){
        Phone_java Phone_java3 = new Phone_java("galaxy note 20 ulter","1000 USD" );
        Phone_java3.printPhone_java();
    }
    public void printPhone_java(){
        System.out.println(model);
        System.out.println(price);
    }


}
