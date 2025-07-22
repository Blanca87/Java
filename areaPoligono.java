import java.util.Scanner;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class areaPoligono {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String poligono;
        String respuesta;

        double base;
        double altura;
        double diagonalMayor;
        double diagonalMenor;
        double baseMayor;
        double baseMenor;
        double resultado;
        int lados;
        double longitud;
        double apotema;

        System.out.print("¿De que polígono quieres calcular el area?: ");
        poligono = in.nextLine();

        switch (poligono) {
            case "triangulo":
                System.out.print("Introduce la base: ");
                base = in.nextDouble();

                System.out.print("Introduce la altura: ");
                altura = in.nextDouble();

                resultado = (base * altura)/ 2;
                System.out.println("El area del triangulo es "+ resultado);
                break;
        
            case "cuadrado":
                System.out.print("Introduce la base:");
                base = in.nextDouble();

                System.out.print("Introduce la altura: ");
                altura = in.nextDouble();

                resultado = base * altura;
                System.out.println("El area del cuadrado es "+ resultado);
                break;
                
            case "rectangulo":
                System.out.print("Introduce la base:");
                base = in.nextDouble();

                System.out.print("Introduce la altura: ");
                altura = in.nextDouble();

                resultado = base * altura;
                System.out.println("El area del rectangulo es "+ resultado);
                break;

            case "rombo":
                System.out.print("Introduce la diagonal mayor: ");
                diagonalMayor = in.nextDouble();

                System.out.print("introduce la diagonal menor: ");
                diagonalMenor = in.nextDouble();

                resultado = diagonalMayor * diagonalMenor / 2;
                System.out.println("El area del rombo es " + resultado);
                break;

            case "romboide":
                System.out.print("Introduce la base: ");
                base = in.nextDouble();
                
                System.out.print("Introduce la altura: ");
                altura = in.nextDouble();

                resultado = base * altura;
                System.out.println("El area del romboide es " + resultado);
                break;

            case "trapecio":
                System.out.print("Introduce la base mayor: ");
                baseMayor = in.nextDouble();

                System.out.print("Introduce la base menor: ");
                baseMenor = in.nextDouble();

                System.out.print("Introduce la altura: ");
                altura = in.nextDouble();

                resultado = (baseMayor + baseMenor) * altura / 2;
                System.out.println("El area del trapecio es " + resultado);
                break;

            case "poligono regular":
                System.out.print("Introduce el numero de lados: ");
                lados = in.nextInt();

                System.out.print("Introduce la longitud de los lados: ");
                longitud = in.nextDouble();

                in.nextLine(); //Limpiar buffer

                System.out.print("¿Sabes el apotema o la distancia del centro al vertice(radio)?: ");
                respuesta = in.nextLine();

                if (respuesta.equals("apotema")) {
                    System.out.print("Introduce el apotema: ");
                    apotema = in.nextDouble();
                    resultado = lados * longitud * apotema / 2;
                    System.out.println("EL area del poligono regular es: " + resultado);

                }else if(respuesta.equals("radio")){
                    System.out.print("Introduce la longitud: ");
                    double radio = in.nextDouble();
                    double mitadLado = longitud / 2;
                    apotema = Math.sqrt(Math.pow(radio, 2) - Math.pow(mitadLado, 2));
                    resultado = (lados * longitud * apotema) / 2;
                    System.out.println("EL area del poligono regular es: " + resultado);
                }
                break;

            default:
                System.out.println("Poligono no reconocido");
                break;
        }
        in.close();
    }
}