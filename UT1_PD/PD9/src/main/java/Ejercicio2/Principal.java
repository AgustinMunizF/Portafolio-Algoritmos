package main.java.Ejercicio2;

public class Principal {
    public static void main(String[] args) {
        long num = 31; // Numero a evaluar
        
        // Se comprueba si el número es primo y se imprime el resultado
        if (EsPrimo(num)) {
            System.out.println("El número " + num + " es primo! La suma de los números pares hasta " + num + " es " + SumarNumeros(num, true));
        } else {
            System.out.println("El número " + num + " no es primo. La suma de los números impares hasta " + num + " es " + SumarNumeros(num, false));
        }
    }

    public static boolean EsPrimo(long n) {
        // Ni 1 ni 0 son primos
        if (n <= 1) {
            return false;
        }
        // Sabemos que 2 es primo
        else if (n == 2) {
            return true;
        }
        // Si n es par, no es primo
        else if (n % 2 == 0) {
            return false;
        }
        // Se comprueba si n es divisible por algún número impar desde 3 hasta la raíz cuadrada de n
        long sqrt = (long) Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        // Si no se encontró ningún divisor, n es primo
        return true;
    }

    public static long SumarNumeros(long num, boolean primo) {
        long sum = 0;
        //Si es primo empieza suma los numeros pares desde 2, si no, empieza desde 1
        long i = primo ? 2 : 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
    
}
