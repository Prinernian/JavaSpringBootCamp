package it.workStation;

public class AdvCalculator extends Calculator{
    public int square_root(int a){
        return (int) Math.sqrt(a);
    }
    public int cube_root(int a){
        return (int) Math.cbrt(a);
    }
}