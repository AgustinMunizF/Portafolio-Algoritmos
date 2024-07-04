package main.java.Ejercicio2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Principal {
    public static void leerEntradaArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            int enteroLeido = Integer.parseInt(br.readLine());
            float numeroPuntoFlotante = Float.parseFloat(br.readLine());
            String cadenaLeida = br.readLine();

            System.out.println("El entero leído es: " + enteroLeido);
            System.out.println("El número de punto flotante es: " + numeroPuntoFlotante);
            System.out.println("La cadena leída es: " + cadenaLeida);
            System.out.println("¡Hola " + cadenaLeida + "! La suma de " + enteroLeido + " y " + numeroPuntoFlotante + " es " + (enteroLeido + numeroPuntoFlotante) + ".");
            System.out.println("La división entera de " + numeroPuntoFlotante + " y " + enteroLeido + " es " + (int) (numeroPuntoFlotante / enteroLeido) + " y su resto es " + (numeroPuntoFlotante % enteroLeido) + ".");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        leerEntradaArchivo("D:\\UCU\\ALGORITMOS\\UT1\\PD6\\src\\main\\java\\Ejercico2\\entrada.txt");
    }
}