//package it.workStation;
//
////abstract class A{
////    public abstract void show();
////    public abstract void config();
////}
//
//
//
//interface A{
//    // every variable in an interface is by default final and static
//    int age = 32;
//    String area = "Tehran";
//    void show();
//    void config();
//}
//
//
//interface X{
//    void run();
//}
//
//
//interface Y extends X{}
//
//class B implements A, X, Y{
//    public void show(){
//        System.out.println("in the B show");
//    }
//    public void config(){
//        System.out.println("in config of B");
//    }
//    public void run(){
//        System.out.println("in run of B");
//    }
//}
//
//
//// Status is a class we all need to know that
//enum Status{
//    Running, Failed, Pending, Success;
//}
//
//
//
//enum Laptop{
//    MacBook(2000), XPS(1800), Surface, ThinkPad(2480);
//
//    private int price;
//
//    // I can make it not to give the price directly also
//    private Laptop(){
//        price = 500;
//    }
//    private Laptop(int price){
//        this.price = price;
//        System.out.println("in laptop " + this.name());
//    }
//
//    public int getPrice(){
//        return price;
//    }
//
//    public void setPrice(int pr){
//        this.price = pr;
//    }
//}
//
//
//public class Tsabstract {
//    public static void main(String[] args){
////        A object = new B();
////        object.show();
////        object.config();
////        System.out.println(A.area);
////        System.out.println(A.age);
////
////
////        X objRun = new B();
////        objRun.run();
//
//
//
//        // working with ENUMs
////        Status s = Status.Success;
////        System.out.println(s);
////
////        Status p = Status.Pending;
////        System.out.println(p.ordinal());
//
////        Status[] t = Status.values();
////        for(int i = 0; i < Status.values().length; i++) {
////            System.out.println(t[i]);
//
//        // enhanced for loop
////        for(Status term: t){
////            System.out.println(term);
////        }
//
//
//
////        Status s = Status.Pending;
////        if(s == Status.Running){
////            System.out.println("good to go");
////        } else if(s == Status.Failed) {
////            System.out.println("try again ...");
////        }
////        else if(s == Status.Pending){
////            System.out.println("wait for it ...");
////        }
////        else System.out.println("DONE, DONE, DONE!");
//
//
////        Laptop lap = Laptop.MacBook;
////        System.out.println(lap);
////        System.out.println(lap.getPrice());
////        System.out.println(lap.getClass().getSuperclass());
//
//
//        for(Laptop lap1: Laptop.values()){
//            System.out.println(lap1 + ":" + lap1.getPrice());
//        }
//    }
//
//
//
//
//
//
//}
