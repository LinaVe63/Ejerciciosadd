/*
 * Pedir 10 numeros y mostrar al final si se ha introducido algun numero negativo
 */
package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Ejercicio12 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        boolean hayNegativos = false; 
        
        for (int i = 1; i <= 10; i++) { 
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            
            if (num < 0) {
                hayNegativos = true; 
            }
        }
        
        
        if (hayNegativos) { 
            System.out.println("Se ha introducido al menos un número negativo.");
        } else {
            System.out.println("No se ha introducido ningún número negativo.");
        }
    }
}