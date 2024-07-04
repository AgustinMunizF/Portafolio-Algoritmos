package main.java.Ejercicio3;

public class Programa {

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        IMultisuma multisuma = new Multisuma();
        // Invocar al método a probar
        double resultado = multisuma.multsuma(a, b, c);
        System.out.println("El resultado de multsuma es: " + resultado);
    }   
}
