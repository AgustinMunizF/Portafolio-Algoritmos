package main.java.Ejercicio1;

public class Principal {
    public static int factorial(int num) {
        if (num < 0) {
            //Si el número es negativo, lanza una excepción
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
    
        int result = 1;
        //Se multiplica el resultado por cada número desde 2 hasta num
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5; // número para calcular el factorial
        System.out.println("El factorial de " + num + " es " + factorial(num));
    }
}
