package main.java.Ejercicio4;

//Codigo correjido
public class Alumno {
    private String nombre;
    public Alumno () {
        nombre = "";  //a) antes daba el error de NullPointerException ya que nombre se inicializaba como un null, ahora lo cambie para que empieze siendo un string vacio
    }
    public String getNombreAdmiracion() {
        return nombre.concat("!");
        }
    public static void main (String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
            }

    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) { //b) Los strings empiezan en la posicion 0, por lo que el for debe empezar en 0 en vez de en 1 y tambien el indice debe ser menor a la longitud del string, no menor o igual
        if (cadena.charAt(i) != ' ') {
        res++;
        }
        }
        return res;
        }
    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 };
        int idx = 7;      //c) el indice no puede ser 8 ya que los indices del array van de 0 a 7 en este caso, por lo que lo cambie a 7
        return vector[idx];  
        }
    public static char getPrimerCaracter(String palabra) {
        String string[] = {"a", "b", "c", "d", "e"} ;    //d) el array se inicializaba con tamaño 5 pero no tenia nada adentro lo que provocaba un NullPointerException, ahora lo cambie para que tenga 5 elementos
        return (string[0].charAt(0));     //antes estaba en el indice 1 lo que nos devolvia el segundo elemento del array, ahora lo cambie a 0 para que devuelva el primer elemento
        }
    public static String paraAString(int a) {
        Object x1 = Integer.valueOf(a);  
        return x1.toString();  //e) no se puede pasar de integer a string a menos que se use el metodo toString(), por lo que lo cambie para que devuelva el valor de x1 como string
        }
    }                   
            
                    

