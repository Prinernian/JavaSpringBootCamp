package it.workStation;
// import it.workStation.A;
import java.util.ArrayList;


class C {
    public void show(){
        System.out.println("In Show of C");
    }
    public void config(){
        System.out.println("In Config of C");
    }
}

class D extends C{
    public void show(){
        System.out.println("In Show of D");
    }
}


//class Launch {
//    public void abc(){
//        A mojo = new A();
//        System.out.println(mojo.marks);
//    }
//}
//
//class E extends A {
//    public void abc(){
//
//    }
//}

//public class Demo {
//    public static void main(String[] args) {
//        C obj = new C();
//        obj.show();
//        obj.config();
//
//        A obj2 = new A();
//        obj2.marks = 12;
//
//
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("class D object");
//        System.out.println(list1);
//
//
//    }
//}
