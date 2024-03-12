package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num, sumaPosi = 0, conteoPosi = 0, sumaNeg = 0, conteoNeg = 0, conteoCeros = 0;
        double mediaPosi = 0, mediaNeg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite un numero");
            num = entrada.nextInt();

            if (num == 0){
                conteoCeros++;
            }
            else if (num > 0) {
                sumaPosi += num;
                conteoPosi++;
            } 
            else { 
                sumaNeg += num;
                conteoNeg++;
            }
        }

        if (conteoPosi == 0) {
            System.out.println("No se puede sacar la media de los numeros positivos");
        } 
        else {
            mediaPosi = (double) sumaPosi / conteoPosi;
            System.out.println("Media de los numeros positivos: " + mediaPosi);
        }

        if (conteoNeg == 0) {
            System.out.println("No se puede sacar la media de los numeros negativos");
        } 
        else {
            mediaNeg = (double) sumaNeg / conteoNeg;
            System.out.println("Media de los numeros negativos: " + mediaNeg);
        }

        System.out.println("Cantidad de ceros: " + conteoCeros);
    }
}