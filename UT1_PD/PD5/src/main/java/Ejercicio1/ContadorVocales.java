package main.java.Ejercicio1;     

public class ContadorVocales {
    enum TipoLetra {
        VOCAL, CONSONANTE, OTRO;
    }
    
    public static void main(String[] args) {
        String frase = "Las manzanas son rojas al igual que las rosas.";
        
        int vocales = contarLetras(frase, TipoLetra.VOCAL);
        
        System.out.println("La frase tiene " + vocales + " vocales.");
    }
    
    private static int contarLetras(String frase, TipoLetra tipo) {
        int conteo = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toUpperCase(frase.charAt(i));
            TipoLetra tipoLetra = determinarTipoLetra(letra);
            if (tipoLetra == tipo) {
                conteo++;
            }
        }
        return conteo;
    }
    
    private static TipoLetra determinarTipoLetra(char letra) {
        if (Character.isLetter(letra)) {
            switch (letra) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    return TipoLetra.VOCAL;
                default:
                    return TipoLetra.CONSONANTE;
            }
        } else {
            return TipoLetra.OTRO;
        }
    }
}
