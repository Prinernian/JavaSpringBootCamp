package it.workStation;

class Dog{
    int age;
    String name;
    static int count;

    public Dog(){}

    public Dog(int a, String n, int c){
        age = a;
        name = n;
        count = c;
    }

    public void show(){
        System.out.println(" Name: " + name + "Age: " + age + " Count: " + count);
    }
    static int setCount(){
        return count++;
    }
}

public class PracStatic {

    public static void main(String[] args) {
        Dog d1 = new Dog(10, "Peter", 10);
        Dog d2 = new Dog(20, "Rex", 20);
        d1.show();
        d2.show();
        d1.setCount();
        d1.show();
    }
}
