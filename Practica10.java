/*
 * Dadas las edades y estaturas de 5 alumnos, mostrar la edad y la estatura media, 
   la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden mas de 
   1.75
 */

package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
*/

public class Practica10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaEdad = 0, conteoMayor18 = 0, conteoMayor175 = 0;
        double sumaEstatura = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite la edad del alumno " + i + ": ");
            int edad = entrada.nextInt();
            sumaEdad += edad;

            System.out.println("Digite la estatura del alumno " + i + ": ");
            double estatura = entrada.nextDouble();
            sumaEstatura += estatura;

            if (edad > 18) {
                conteoMayor18++;
            }

            if (estatura > 1.75) {
                conteoMayor175++;
            }
        }

        double mediaEdad = (double) sumaEdad / 5;
        double mediaEstatura = sumaEstatura / 5;

        System.out.println("La edad promedio es: " + mediaEdad);
        System.out.println("La estatura promedio es: " + mediaEstatura);
        System.out.println("Cantidad de alumnos mayores a 18: " + conteoMayor18);
        System.out.println("Cantidad de alumnos con más de 1.75 de estatura: " + conteoMayor175);
    }
}