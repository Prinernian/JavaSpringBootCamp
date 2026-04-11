//package it.workStation;



class A {
    public void show(){
        System.out.println("In Show of A");
    }
}

public class Anonymous {

    public void main(String[] args){
        A obj = new A()
        {
            public void show(){
                System.out.println("In a new show!");
            }
        };
        obj.show();
    }
}
