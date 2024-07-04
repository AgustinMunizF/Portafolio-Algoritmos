package main.java.Ejercicio3;

public class NumberHolder {
    public int anInt;
    public float aFloat;
    
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt = 15;
        numberHolder.aFloat = 35.5f;

        System.out.println("El valor de anInt es: " + numberHolder.anInt + " y el valor de aFloat es: " + numberHolder.aFloat);
    }
}