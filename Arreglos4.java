import java.util.Scanner;

/*
  Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo 
  orden introducido
 */

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
*/

public class Arreglos4 {
    
public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        int[] numeros = new int[5];

        System.out.println("Digite los numeros del arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("Los numeros del arreglo son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }  
}