package it.workStation;


class Computer{
    public void playMusic(){
        System.out.println("Playing music......");
    }

    public String getMeAPen(int cost){
        if (cost >= 10)
            return "pen";

        return "nothing";
    }
}


//class Calculator{
////    int a, b;
////    public Calculator(int a, int b){
////        this.a = a;
////        this.b = b;
////    }
//
//    public int add(int a, int b){
//        return a+b;
//    }
//}
public class Hello {
    public static void main(String[] args) {
        // We need an object to use the class
        Calculator calc = new Calculator();
//        System.out.println(calc.add(2,3));


        Computer c = new Computer();
        String str = c.getMeAPen(11);
        c.playMusic();
        System.out.println(str);
    }
}
