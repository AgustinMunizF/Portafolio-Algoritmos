package main.java.Ejercicio2;

//codigo correjido
//agregamos una clase Rectangle
class Rectangle {
    int width;
    int height;
    int area() {
    int x = width * height;
    return x;
    }
    }
public class SomethingIsWrong {
    public static void main(String[] args) {
    Rectangle myRect = new Rectangle(); //Faltaba inicializar la variable myRect
    myRect.width = 40;
    myRect.height = 50;
    System.out.println("myRect's area is " + myRect.area());
    }
    }
    