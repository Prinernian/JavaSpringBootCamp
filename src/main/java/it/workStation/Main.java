//package it.workStation;
//
//
//class Human{
//    private int age;
//    private String name;
//    public int getAge(){
//        return age;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setAge(int a){
//        this.age = a;
//    }
//    public void setName(String n){
//        this.name = n;
//    }
//}
//
//class Calculator{
//
//    int num = 5;
//
//    // method overloading
//    public int add(int a, int b){
//        return a + b;
//    }
//    public double add(double a, int b){
//        return a + b;
//    }
//    public int add(int a, int b, int c){
//        return a + b + c;
//    }
//}
//
//
//class Mobile{
//    int price;
//    static String brand;
//    String model;
//
//    public Mobile(){
//        System.out.println("Constructor is called");
//        price = 100;
//        model = "DEFAULT";
//    }
//    public void show(){
//        System.out.println("Price: " + price + " Brand: " + brand + " Model: " + model);
//    }
//
//    static{
//        System.out.println("static block is here to be executed only once");
//        brand = "DEFAULT";
//    }
////    public static void show1(Mobile m){
////        System.out.println("I am in the static method");
////        System.out.println("Price: " + m.price + " Brand: " + brand + " Model: " + m.model);
////    }
//}
//public class Main {
//    static void main() throws ClassNotFoundException{
////        Human h = new Human();
////        h.setAge(20);
////        h.setName("Pearson");
////        System.out.println(h.getName() + " with the age: " + h.getAge());
//
////        Mobile m1 = new Mobile();
////        m1.price = 1000;
////        Mobile.brand = "Samsung";
////        m1.model = "Galaxy S20";
////
////        Mobile m2 = new Mobile();
//
//
//
////        Mobile m2 = new Mobile();
////        m2.price = 2000;
////        Mobile.brand = "Apple";
////        m2.model = "iPhone 11";
//
////        m1.show();
////        m2.show();
//
//
////        Mobile.brand = "PhonWWE";
////        m1.show();
////        m2.show();
////        m1.show1(m2);
////        m2.show1(m1);
//
//
//
//
//        Class.forName("it.workStation.Mobile");
//
//
//
//
//
//
//
////        int n = 9;
////        switch (n){
////            case 1:
////                System.out.println("Monday");
////                break;
////            case 2:
////                System.out.println("Tuesday");
////                break;
////            case 3:
////                System.out.println("Wednesday");
////                break;
////            case 4:
////                System.out.println("Thursday");
////                break;
////            case 5:
////                System.out.println("Friday");
////                break;
////            case 6:
////                System.out.println("Saturday");
////                break;
////            case 7:
////                System.out.println("Sunday");
////                break;
////            default:
////                System.out.println("Invalid day");
////        }
//
//
//
////        int i = 0;
////        do{
////            System.out.println(i);
////            i++;
////        } while(i < 8);
//
//
//
////        int j = 10;
////        do {
////            System.out.println("j is " + j);
////            j--;
////        } while (j >= 5);
//
//
////        int data = 10;
////
////        Calculator obj1 = new Calculator();
////        Calculator obj2 = new Calculator();
////        int r1 = obj1.add(1,2);
////
////        obj1.num = 10;
////        System.out.println(obj1.num);
////        System.out.println(obj2.num);
//
//
////        int barray[][] = new int[3][4];
////
////
////        for(int i =0; i < 3; i++){
////            for(int j = 0; j < 4; j++){
////                barray[i][j] = (int)(Math.random() * 100);
////            }
////            System.out.println();
////        }
//
//
////        for(int i = 0; i < 3; i++){
////            for(int j = 0; j < 4; j++){
////                System.out.print(barray[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//
////        int nums[][] = new int [3][];   //jagged array
////        nums[0] = new int[5];
////        nums[1] = new int[4];
////        nums[2] = new int[2];
////
////        for(int i = 0; i < nums.length; i++){
////            for(int j = 0; j < nums[i].length; j++){
////                nums[i][j] = (int)(Math.random() * 100);
////            }
////        }
//
////        for(int i = 0; i < nums.length; i++){
////            for(int j = 0; j < nums[i].length; j++){
////                System.out.print(nums[i][j] + " ");
////            }
////            System.out.println();
////        }
//
////        for(int n []: nums){
////            for(int i: n){
////                System.out.print(i + " ");
////            }
////            System.out.println();
////        }
//
//        // how to create an object of String
////        String str = new String("PearsonHardman");
////        System.out.println(str.hashCode());
////        System.out.println(str.charAt(3));
//
//
////        StringBuffer sb = new StringBuffer("PearsonHardman");   // 16 bytes of buffer size + 14(PearsonHardman)
////        System.out.println(sb.capacity());
////        System.out.println(sb.length());
////        sb.append(" is a nice person!");
////        System.out.println(sb);
////        sb.deleteCharAt(13);
////        System.out.println(sb);
////        sb.insert(13, "n");
////        System.out.println(sb);
////        sb.setLength(35);
////        System.out.println(sb);
//
//
//
//
//
//
//    }
//}
