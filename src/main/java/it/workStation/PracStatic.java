package it.workStation;

//class Dog{
//    int age;
//    String name;
//    static int count;
//
//    public Dog(){}
//
//    public Dog(int a, String n, int c){
//        age = a;
//        name = n;
//        count = c;
//    }
//
//    public void show(){
//        System.out.println(" Name: " + name + "Age: " + age + " Count: " + count);
//    }
//    static int setCount(){
//        return count++;
//    }
//}

public class PracStatic {

    public static void main(String[] args) {
//        Dog d1 = new Dog(10, "Peter", 10);
//        Dog d2 = new Dog(20, "Rex", 20);
//        d1.show();
//        d2.show();
//        d1.setCount();
//        d1.show();




        Calculator obj1 = new Calculator();
        int r1 = obj1.add(1,2);
        int r2 = obj1.mul(2, 3);
        int r3 = obj1.sub(5, 7);
        System.out.println(r1 + " " + r2 + " " + r3);
        System.out.println("---------------------------");
        AdvCalculator obj2 = new AdvCalculator();
        int term1 = obj2.cube_root(125);
        int term2 = obj2.square_root(25);
        int term3 = obj2.add(12, 15);
        int term4 = obj2.sub(45, 15);
        System.out.println(term1 + " " + term2 + " " + term3 + " " + term4);
        System.out.println("---------------------------");
        VeryAdvCalculator obj3 = new VeryAdvCalculator();
        int qwerty1 = obj3.div(21, 7);
        int qwerty2 = obj3.mul(12, 12);
        int qwerty3 = obj3.add(15, 15);
        double qwerty4 = obj3.power(2, 3);
        int qwerty5 = obj3.square_root(81);
        System.out.println(qwerty1 + " " + qwerty2 + " " + qwerty3 + " " + qwerty4 + " " + qwerty5);
        System.out.println("---------------------------");



    }
}
