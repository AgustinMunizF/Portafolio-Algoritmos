package main.java.Ejercicio5;

public class Contador implements IContador {
    final int MAX_CONT = 50;
    int contador = 1;
    int incremento = 1;

    public void mostrarContadorWhile(){
        while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador = contador + incremento;
        }
        contador = 1;//Reiniciar contador 
    }
    
    public void mostrarContadorDoWhile(){
        do {
            System.out.println(contador);
            contador = contador + incremento;
        } while (contador <= MAX_CONT);
        contador = 1;//Reiniciar contador 
    }
    
    public void mostrarContadorFor(){
        for (contador = 1; contador <= MAX_CONT; contador += incremento) {
            System.out.println(contador);
        };
        contador = 1;//Reiniciar contador 
    }
    
}
