package main.java.Ejercicio4;

public class MultiplicarVectores {
    public static void main(String[] args) {
        // Definir los vectores
        int[] vector1 = {3, 2, 9, 4};
        int[] vector2 = {2, 5, 6, 7};

        int[] resultado = multiplicarVectores(vector1, vector2);

        if (resultado != null) {
            System.out.println("El resultado de la multiplicación de los vectores es:");
            for (int i = 0; i < resultado.length; i++) {
                System.out.print(resultado[i] + " ");
            }         
        } else {
            // En caso de que los vectores no puedan ser multiplicados
            System.out.println("Los vectores no pueden ser multiplicados.");
        }
    }

    public static int[] multiplicarVectores(int[] vector1, int[] vector2) {
        // Verificar si los vectores tienen la misma longitud
        if (vector1.length != vector2.length) {
            return null; // No se puede realizar la multiplicación
        }

        // Multiplicar los vectores
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] * vector2[i];
        }

        return resultado;
    }
    
}
