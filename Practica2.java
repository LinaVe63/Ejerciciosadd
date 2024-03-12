/*
Calcule e imprima el salario semanal de un empleado a partir de sus horas semanales 
trabajadas y de su salario por hora
 */
package practica1;

import java.util.Scanner;

/*
* @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica2 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int salariosemana, salarioh, hsemanales; 
        
         
         System.out.println("Digite el /*n*/umero de horas semanales trabajadas: ");
         hsemanales = entrada.nextInt();
         System.out.println ("Digite el valor de su salario por hora: ");
         salarioh = entrada.nextInt();
         salariosemana = hsemanales * salarioh;
         System.out.println("Su salario semanal corresponde a: "+salariosemana);
        }
    }
