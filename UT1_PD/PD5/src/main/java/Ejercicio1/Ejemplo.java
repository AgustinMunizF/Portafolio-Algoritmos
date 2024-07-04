package main.java.Ejercicio1;

enum Colores {
    ROJO, VERDE, AZUL, AMARILLO, NARANJA, MORADO, ROSA, BLANCO, NEGRO, GRIS;
}

public class Ejemplo {
    public static void main(String[] args) {
        Colores[] colores = Colores.values();
        for (Colores color : colores) {
            System.out.println(color);
        }
    }
}
