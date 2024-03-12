/*
if es un condicional simple 
if else es un condicional doble 
switch es un condicional multiple
 */

/*
EJERCICIO DE SOLICITAR UN NUMERO Y ARROJAR RESULTADO DE RAIZ CUADRADA
*/

package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num;
        double raiz;
    
        System.out.println("Digite un numero para obtener su raiz");
        num = entrada.nextDouble(); 
        
        raiz = Math.sqrt(num);
        System.out.println("La raiz es: "+raiz);
    
    }
        
}
        

