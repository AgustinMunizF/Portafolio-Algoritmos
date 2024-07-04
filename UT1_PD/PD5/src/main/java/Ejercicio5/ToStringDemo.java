package main.java.Ejercicio5;

public class ToStringDemo {
    public static void main(String[] args) {
    double d = 888.51;
    String s = Double.toString(d);
    int dot = s.indexOf('.');
    System.out.println(dot + " digits " +
    "before decimal point.");
    System.out.println( (s.length() - dot - 1) +
    " digits after decimal point.");
    }
    }

/* La salida de este programa es:
    3 digits before decimal point.
    2 digits after decimal point.
 
    El codigo lo que hace es contar la cantidad de digitos antes y despues del punto decimal de un numero 
    tipo float. Esto lo haze mediante la conversion de un numero tipo double a un string y luego contando
    la cantidad de digitos antes y despues del punto decimal con un s.indexOf('.') que devuelve la posicion
    del punto decimal en el string.
 */
