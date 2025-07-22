import java.util.Scanner;
/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class anagrama {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String palabra1 palabra2;
        
        System.out.print("Introduce una palabra: ");
        palabra1 = in.nextLine();
        System.out.print("Introduce otra palabra: ");
        palabra2 = in.nextLine();
        
        in.close();
        
        boolean resultado = sonAnagramas(palabra1, palabra2);
        System.out.println(resultado);

    }
    public static boolean sonAnagramas(String palabra1, String palabra2){
        
        boolean esAnagrama = true;

        if (palabra1.equals(palabra2)){
            esAnagrama = false;
        }
        else if (palabra1.length() != palabra2.length()){
            esAnagrama = false;
        }
        else{
            int[] letrasRepetidas = new int[256];

            for(int i = 0; i < palabra1.length(); i++){
                char c = palabra1.charAt(i);
                letrasRepetidas[c]++;
            }
            for(int i = 0; i < palabra2.length(); i++){
                char c = palabra2.charAt(i);
                letrasRepetidas[c]--;

                if(letrasRepetidas[c] < 0){
                    esAnagrama = false;
                }
            }

            if(esAnagrama){
                /* Otra opcion
                 *  for (int i = 0; i < contador.length; i++) {
                        int count = contador[i];
                        // Codigo que usa count
                    }
                 */
                for (int count : letrasRepetidas){ //Bucle for-each
                    if (count != 0){
                        esAnagrama = false;
                    }
                }
            }
        }

        return esAnagrama;
    }
}
