/*
 * Realizar un juego para adivinar un número. Para ello generar un numero aleatorio
entre 0 - 100, y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun 
sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta y 
mostrar el número de intentos
 */
package practica1;


import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica7 {
    
        public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num, aleatorio, contador = 0;
        
        aleatorio = (int) (Math.random()*100); //Generar num aleaotrio entre 0-100
                
        do { 
            System.out.println("Digite un numero entre 1 y 100");
            num = entrada.nextInt();
            
            if (aleatorio > num) { 
                System.out.println("Digite un numero mayor");
            } else {
                System.out.println("Digite un numero menor");
            }
            contador++;
            
            }while(num != aleatorio);
        
          System.out.println("Adivinaste el numero en: "+contador+" intentos");
        }
}
