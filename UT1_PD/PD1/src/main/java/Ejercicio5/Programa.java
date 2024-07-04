package main.java.Ejercicio5;

public class Programa {
    
    public static void main (String args[]) {
        IContador contador = new Contador();
        // Invocar al método a probar
        
        // Prueba de cada uno de los métodos
        System.out.println("Prueba usando bucle while");
        contador.mostrarContadorWhile();
        System.out.println("Prueba usando bucle do-while");
        contador.mostrarContadorDoWhile();
        System.out.println("Prueba usando bucle for");
        contador.mostrarContadorFor(); 
    }
}

