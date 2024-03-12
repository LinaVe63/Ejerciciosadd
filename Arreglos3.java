
import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
*/

public class Arreglos3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int elementos;
        
        System.out.println("Digite la cantidad de elementos que va a tener el array: ");
        elementos = entrada.nextInt();
        char[] letras = new char[elementos];
        
        System.out.println("Digite las letras del array: ");
        for (int i=0;i<elementos; i++){   
        letras[i] = entrada.next().charAt(0);
        }
        
        System.out.println("Las letras del array son: ");
         for (char i=0;i<elementos; i++){   
        System.out.println(letras[i]+ " ");
        }
    }
}
