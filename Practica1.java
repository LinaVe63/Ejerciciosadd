/*
combinacion sout + Tab para System.out.println
*/

// manera de incluir solo una linea 

/*
manera de incluir mas de una linea
*/

/*
EJERCICIO DE SUMA
*/

package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calf1, calf2, calf3, resultado;

        System.out.println("Digite la primera calificacion: ");
        calf1 = entrada.nextDouble();
        System.out.println("Digite la segunda calificacion: ");
        calf2 = entrada.nextDouble();
        System.out.println("Digite la tercera calificacion: ");
        calf3 = entrada.nextDouble();
        
        resultado = calf1 + calf2 + calf3;
        System.out.println("El resultado de la suma es: "+resultado);

    }
    
}
