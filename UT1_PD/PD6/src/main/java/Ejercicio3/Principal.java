package main.java.Ejercicio3;
import java.io.*;

public class Principal {
    public static void transformarTextoT9(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\UCU\\ALGORITMOS\\UT1\\PD6\\src\\main\\java\\Ejercicio3\\salida.txt"))) {
            int c;
            while ((c = br.read()) != -1) {
                char caracter = Character.toUpperCase((char) c);
                if (caracter >= 'A' && caracter <= 'C') {
                    bw.write('2');
                } else if (caracter >= 'D' && caracter <= 'F') {
                    bw.write('3');
                } else if (caracter >= 'G' && caracter <= 'I') {
                    bw.write('4');
                } else if (caracter >= 'J' && caracter <= 'L') {
                    bw.write('5');
                } else if (caracter >= 'M' && caracter <= 'O') {
                    bw.write('6');
                } else if (caracter >= 'P' && caracter <= 'S') {
                    bw.write('7');
                } else if (caracter >= 'T' && caracter <= 'V') {
                    bw.write('8');
                } else if (caracter >= 'W' && caracter <= 'Z') {
                    bw.write('9');
                } else if (caracter == ' ') {
                    bw.write('0');
                } else if (caracter == '.') {
                    bw.write('1');
                } else {
                    bw.write(caracter);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
    public static void transformarT9Texto(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\UCU\\ALGORITMOS\\UT1\\PD6\\src\\main\\java\\Ejercicio3\\salida2.txt"))) {
            String line = br.readLine();
            if (line != null) {
                for (int i = line.length() - 1; i >= 0; i--) {
                    char caracter = Character.toUpperCase(line.charAt(i));
                    if (caracter >= 'A' && caracter <= 'C') {
                        bw.write('2');
                    } else if (caracter >= 'D' && caracter <= 'F') {
                        bw.write('3');
                    } else if (caracter >= 'G' && caracter <= 'I') {
                        bw.write('4');
                    } else if (caracter >= 'J' && caracter <= 'L') {
                        bw.write('5');
                    } else if (caracter >= 'M' && caracter <= 'O') {
                        bw.write('6');
                    } else if (caracter >= 'P' && caracter <= 'S') {
                        bw.write('7');
                    } else if (caracter >= 'T' && caracter <= 'V') {
                        bw.write('8');
                    } else if (caracter >= 'W' && caracter <= 'Z') {
                        bw.write('9');
                    } else if (caracter == ' ') {
                        bw.write('0');
                    } else if (caracter == '.') {
                        bw.write('1');
                    } else {
                        bw.write(caracter);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
    

    public static void main(String[] args) {
        transformarTextoT9("D:\\UCU\\ALGORITMOS\\UT1\\PD6\\src\\main\\java\\Ejercicio3\\entrada.txt");
        transformarT9Texto("D:\\UCU\\ALGORITMOS\\UT1\\PD6\\src\\main\\java\\Ejercicio3\\entrada.txt");
    }
}