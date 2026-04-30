package it.workStation;


// If I want to have my own Exception, I need to have a class related to that:
class MyException extends Exception{
    public MyException(String string){
        super(string);
    }
}



//class ABC{
//    public void show(){
//        try{Class<?> bmw = Class.forName("it.workStation.BMW");
//            System.out.println(bmw);}
//        catch(ClassNotFoundException e){
//            System.out.println("The class isn't found by whom and you");
//        }
//    }
//}




class ABC{
    public void show() throws ClassNotFoundException
    {
        Class.forName("it.workStation.Calculator");
    }
}



public class PracExceptions {

    static{
        System.out.println("Class Loaded");
    }
    public static void main(String [] args) throws ClassNotFoundException {
        // normal statement
        int i = 20;
        int j = 0;
        int nums[] = new int[5];
        String str = null;


        // we want to see the THROW AND THROWS words:
//        try{
//            j = 8/i;
//            if(j == 0)
//            {
                // throw the object of arithmetic exception
//                throw new ArithmeticException("I don't want to print zero");
//                throw new MyException("Release HELL!");
//            }
//            System.out.println(str.length());
//            System.out.println(nums[1]);
//            System.out.println(nums[5]);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("can't divide by zero");
//        }

        // in the catch for arithmetic exception I want to say
        // whenever you see sth as divided by zero divide it by one instead!

        // read the throw and throws page in the A4 page:
//        catch(ArithmeticException e){
//            j = 8 / 1;
//            System.out.println("That's the default output " + e);
//        }

//        catch(MyException e){
//            j = 8/1;
//            System.out.println("That is the default output " + e);
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("stay in your limit");
//        }
//        catch(NullPointerException e){
//            System.out.println("null string doesn't have length ");
//        }
//        catch(Exception e)
//        {
//            System.out.println("something went wrong " + e);
//        }
//        System.out.println(j);



//        try{
//            Class<?> cal = Class.forName("it.workStation.Calculator");
//            System.out.println(cal);
//        }
//        catch(ClassNotFoundException e)
//        {
//            System.out.println("The class you are looking for not found");
//        }



//        ABC obj = new ABC();
//        obj.show();



        ABC object = new ABC();
        try{
            object.show();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }





    }

}
