package main.java.Ejercicio3;

public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "LA ruta, Nos aporto Otro Paso naturaL.";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                palindrome.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome =
            new String(charArray);
        System.out.println(reversePalindrome);
    }
}

//El punto final aparce al principio de la cadena, y la coma cerca del final.Las letras mayúsculas y minúsculas se mantienen en su lugar.