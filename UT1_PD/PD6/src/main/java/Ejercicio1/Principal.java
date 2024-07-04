package main.java.Ejercicio1;    

public class Principal {
    public static void main(String[] args) {
        imprimirTablero(7, 7);
    }

    public static void imprimirTablero(int largo, int ancho) {
        // Impresión del tablero
        for (int i = 0; i < largo; i++) {
            // Imprime cada fila del tablero
            for (int j = 0; j < ancho; j++) {               
                System.out.print("#");              
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}
