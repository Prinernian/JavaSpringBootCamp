package it.workStation;


//class A
//{
//    public void show1(){
//        System.out.println("In Show of A");
//    }
//}
//class B extends A {
//    public void show2(){
//        System.out.println("In Show of B");
//    }
//}




abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing music......");
    }
}


class WagonR extends Car{
    public void drive(){
        System.out.println("Driving a wagon");
    }
    public void fly(){
        System.out.println("Flying a wagon");
    }
}


class BMW extends Car{
    public void drive(){
        System.out.println("Driving a BMW");
    }
    public void fly(){
        System.out.println("Flying a BMW");
    }
}


public class GatherInfo {
    public void main(String[] args){
//        Laptop obj = new Laptop();
//        obj.model = "HP";
//        obj.price = 1000;
//       System.out.println(obj.toString());
//        System.out.println(obj);
//
//        Laptop obj1 = new Laptop();
//        obj1.model = "HP";
//        obj1.price = 1000;
//        System.out.println(obj1);
//
//        System.out.println(obj.equals(obj1));
//        System.out.println(obj == obj1);

        // what is typecasting?
//        double x = 10.6;
//        int y = (int) x;
//        System.out.println(y);



//        A obj = new A();
//        obj.show1();
//        B obj1 = new B();
//        obj1.show2();


        // UP CASTING
//        A obj = new B();
//        obj.show1();
//
        // DOWN CASTING
//        B obj1 = (B) obj;
//        obj1.show2();



//        int num = 17;
//        Integer obj = new Integer(18);
//        System.out.println(obj);
//
//        Integer obj1 = num; // autoboxing
//        System.out.println(obj1);
//
//        int num2 = obj1.intValue();
//        System.out.println(num2);

        String str = "256";
        int numberFromStr = Integer.parseInt(str);
        numberFromStr = numberFromStr * 2;
//        System.out.println(numberFromStr);


//        Car obj = new Car();
//        obj.playMusic();
//        obj.drive();


        Car obj = new WagonR();
//        obj.playMusic();
//        obj.drive();



        Car obj1 = new BMW();
        BMW obj2 = (BMW) obj1;
        obj1.playMusic();
        obj1.drive();
        obj1.fly();
        obj2.playMusic();
        obj2.drive();
        obj2.fly();
    }
}