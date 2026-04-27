package it.workStation;


// functional interface
// an interface which has only 1 method
// you can call it SAM also
//@FunctionalInterface
//interface A{
//    void show(int i, int j);
//}



@FunctionalInterface
interface A{
    void show(int i);
}




//class B implements A
//{
//    public void show(){
//        System.out.println("in the show of B");
//    }
//}

//class A
//{
//    public void showTheDataWhichBelongToThisClass(){
//        System.out.println("in the A show method");
//    }
//}


//class B extends A
//{
//    @Override
//    public void showTheDataWhichBelongToThisClass(){
//        System.out.println("in the B show method");
//    }
//}
public class Tannotations {
    public static void main(String[] args){
//        B obj = new B();
//        obj.showTheDataWhichBelongToThisClass();


//        A object_1 = new B();
//        object_1.show();


//        A object_2 = new A(){
//            public void show(){
//                System.out.println("I am in the show of A, HA HA HA");
//            }
//        };


        // LAMBDA EXPRESSION
//        A object_2 =  (int i, int j) -> System.out.println("I am using lambda expression for the JOB" + i + j);
//        object_2.show(3, 12);


        // OR YOU CAN WRITE
//        A object2 = (i, j) -> System.out.println("I am using lambda expression for the job" + i + " "+ j);
//        object2.show(1, 2);



        // what if we only have one variable
        // I need to rewrite the interface with only one variable
//        A object22 = (i) -> System.out.println("Hi I am here!" + i);
//        object22.show(5);


        //OR INSTEAD OF ABOVE YOU CAN JUST WRITE
        A object22 = i -> System.out.println("Hi I am here!" + i);
        object22.show(12);



    }
}