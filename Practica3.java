/*
Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen 
Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres. 
 */
package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica3 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int guillermo, juan, luis, suma; 
        
         System.out.println("Digite el /*N*/ de dolares que tiene Guillermo: ");
         guillermo = entrada.nextInt();
         
         luis = guillermo/2; 
         juan = guillermo+luis;
         
         suma = guillermo+juan+luis;
                  
         System.out.println("La cantidad que tiene Luis es: "+luis);
         System.out.println("La cantidad que tiene Juan es: "+juan);
         System.out.println("La cantidad de dinero que tienen los tre es: "+suma);
    }
}
