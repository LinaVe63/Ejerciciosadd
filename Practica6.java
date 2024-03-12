
/*
EJERCICIO DE LEER NUMEROS HASTA QUE SE INTRODUZCA UN 0. PARA CADA UNO INDICAR
SI ES PAR O IMPAR
*/

package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num;
    
        System.out.println("Digite un numero");
        num = entrada.nextInt();
                
        while (num != 0) { // Cambié !0 por != 0 para verificar si num es diferente de 0
            if (num % 2 == 0) { // Utiliza % para obtener el residuo de la división y == para comparar
                System.out.println("El numero digitado es par");
            } else {
                System.out.println("El numero digitado es impar");
            }
            System.out.println("Digite otro numero o 0 para salir");
            num = entrada.nextInt(); // Lee otro número dentro del ciclo
        }
        
        System.out.println("Programa terminado.");
    }
}

