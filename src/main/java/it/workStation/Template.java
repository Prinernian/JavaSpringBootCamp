package it.workStation;


//class Frame{
//    int height;
//    int width;
//    public void show(){
//        System.out.println("Frame height: " + height + " width: " + width);
//    }
//    static class Picture{
//        String name;
//        int size;
//        public void show(){
//            System.out.println("Picture name: " + name + " size: " + size);
//        }
//    }
//}



class Outer{
    class Inner{
        int x = 10;
        int y = 20;
        public void show(){
            System.out.println("x: " + x + " y: " + y + " x + y: " + (x + y) + " ");
        }
    }
    static class StaticInner{
        int x = 59;
        int y = 21;
        int z = 31;
        public void show(){
            System.out.println("x: " + x + " y: " + y + "z: " + z);
        }
    }
}


public class Template {

    public void main(String[] args){
        Outer obj = new Outer();
        Outer.Inner firstInner = obj.new Inner();
        firstInner.show();


        Outer.StaticInner secondInner = new Outer.StaticInner();
        secondInner.show();






//        Frame obj = new Frame();
//        obj.height = 123;
//        obj.width = 456;
//        obj.show();



        // use an inner class inside the outer one.
//        Frame.Picture pic = obj.new Picture();

        // now this obj.new is a bit weird in my eyes what can I do?
        // it works but it doesn't matter, well I can say
        // go to the Picture class and use static for the class
        // static class means: you don't need object so you can directly refer
        // with the Frame.Picture this thing wouldn't work with no static keyword
//        Frame.Picture pic = new Frame.Picture();
//        pic.name = "Landscape";
//        pic.size = 1024;
//        pic.show();





    }
}