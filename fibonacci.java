/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class fibonacci{
    public static void main (String [] args){
        for (int i = 0; i < 25; i++) {
            System.out.print(sucesion(i) + " ");  
        }
    }

    public static int sucesion (int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return(sucesion(n-1) + sucesion(n-2));
        }
            
            
    }
}
