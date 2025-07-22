import java.util.Scanner;
/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int numero;

        System.out.print("Introduce un número: ");
        numero = in.nextInt();
        in.close();

        if (esPrimo(numero)){
            System.out.println("\n" + numero + " es primo");
        }else {
            System.out.println("\n"+ numero + " no es primo");
        }
        System.out.println("\nNuemros primos entre el 1 y el 100\n");
        for (int i = 0; i <= 100; i++) {
            if (esPrimo(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean esPrimo(int numero){
        boolean numPrimo = true;

        if(numero == 2 || numero == 3 || numero == 5 || numero == 7){
            numPrimo = true;
        }
        else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0|| numero % 7 == 0){
            numPrimo = false;
        }
        for(int i = 3; i * i <= numero; i += 2){
            if(numero % i == 0){
                return false;
            }
        }

        return numPrimo;
    }
}
