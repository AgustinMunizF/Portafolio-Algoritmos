package main.java.Ejercico1;

public class MarcaPasos {
    short presionSanguinea; // 2 bytes
    short frecuenciaCardiaca; // 2 bytes
    short nivelAzucarSangre; // 2 bytes
    int maximaFuerzaExpuesto; // 4 bytes
    float minimoTiempoLatidos; // 4 bytes
    float bateriaRestante; // 4 bytes
    char[] codigoFabricante = new char[8]; // 16 bytes: 8 elementos de 2 bytes cada uno
}

//Un objeto de la clase MarcaPasos ocupara 2+2+2+4+4+4+16 bytes = 34 bytes o tambien 272 bits