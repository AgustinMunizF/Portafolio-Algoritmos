package main.java.Ejercicio4;

public class ValueOfDemo {
    public static void main(String[] args) {
    // this program requires two
    // arguments on the command line
    if (args.length == 3) {
    // convert strings to numbers
    float a = (Float.valueOf (args[0])).floatValue();
    float b = (Float.valueOf(args[1])).floatValue();
    // do some arithmetic
    System.out.println("a + b = " +
    (a + b));
    System.out.println("a - b = " +
    (a - b));
    System.out.println("a * b = " +
    (a * b));
    System.out.println("a / b = " +
    (a / b));
    System.out.println("a % b = " +
    (a % b));
    } else {
    System.out.println("This program " +
    "requires two command-line arguments.");
    }
    }
}
  //Para que la linea de comando fuesen solo enteros positivos abria que cambiar el tipo de dato de float a int
  //y cambiar el metodo Float.valueOf por Integer.valueOf