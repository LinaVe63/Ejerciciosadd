/*
EJERCICIO DE LEER UN NUMERO Y MOSTRAR SU CUADRADO, REPETIR EL PROCESO 
HASTA QUE SE INTRODUZCA UN NUMERO NEGATIVO
*/

package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica5 {
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        double num = 0, exponente = 2;
        double resultado; 
    
        System.out.println("Digite un numero para obtener su cuadrado");
        
        if (num <0){
        System.out.println("Digite un numero mayor a 0");
        }
        
        num = entrada.nextDouble(); 
        resultado = Math.pow(num, exponente);
        
        while (num >=0) {
        System.out.println("El cuadrado del numero digitado es: "+resultado);
        System.out.println("Digite otro numero");
        num = entrada.nextDouble(); 
        resultado = Math.pow(num, exponente);
        if (num <0){
        System.out.println("Digite un numero mayor a 0");
        }
        }

    }

}
