package it.workStation;


import org.w3c.dom.ls.LSOutput;

//class F{
//    public void show(){
//        System.out.println("In Show of F");
//    }
//}
//class G extends F{
//    public void show(){
//        System.out.println("In Show of G");
//    }
//}
//class H extends F{
//    public void show(){
//        System.out.println("In Show of H");
//    }
//}

//class Computer{}
//class Laptop extends Computer{}

// cannot inherit from final class
// cannot override final method
// cannot change the value of num variable inside the class
final class FinalClass{
    final int num = 8;
}
public class PolymorphismExtra {
    public static void main(String[] args){
//        G obj = new F(); // ERROR
//        obj.show();

//        F obj2 = new F();
//        obj2.show();
//
//        obj2 = new G();
//        obj2.show();


//        Computer obj1 = new Laptop();
//        System.out.println(obj1);


        // constant variable - you can't change the value of num variable
//        final int num = 8;
//        num = 12;
//        System.out.println(num);

        FinalClass obj = new FinalClass();
        System.out.println(obj.num);
    }
}