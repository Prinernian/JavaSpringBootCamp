package it.workStation;


interface Piano{
    int volume = 25;
    int speed = 10;
    int pitch = 55;
    void stop();
    void practice();
}

interface Guitar{
    void practice();
    void stop();
}

class Yamaha implements Piano, Guitar{
    private boolean isGuitar = false;

    public void setGuitar(){
        this.isGuitar = true;
    }
    public void practice(){
        if (isGuitar) {
            System.out.println("Playing the Guitar");
        }
        else {
            System.out.println("Playing the Piano");
        }
    }
    public void stop(){
        if (isGuitar) {
            System.out.println("Stop Practicing the Guitar");
        }
        else {
            System.out.println("Stop Practicing the Piano");
        }
    }
}



//abstract class Computer{
//    public abstract void code();
//}
//
//class Laptop extends Computer{
//    public void code(){
//        System.out.println("code, compile, run....");
//    }
//}
//
//
//class Desktop extends Computer{
//    public void code(){
//        System.out.println("code, compile, run.... | FASTER");
//    }
//}
//
//
//class Developer{
//    public void developApp(Computer computer){
//        computer.code();
//    }
//}





interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run....");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run.... | FASTER");
    }
}


class Developer{
    public void developApp(Computer computer){
        computer.code();
    }
}


public class InterfacesPractice {
    static void main(String [] args){
//        Yamaha piano = new Yamaha();
//        piano.practice();
//        piano.stop();
//
//
//        Yamaha guitar = new Yamaha();
//        guitar.setGuitar();
//        guitar.practice();
//        guitar.stop();
//
//
//        Yamaha guitar2 = new Yamaha();
//        guitar2.setGuitar();
//        guitar2.practice();
//        guitar2.stop();




        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Developer dev = new Developer();
        dev.developApp(desk);
        dev.developApp(lap);




    }
}