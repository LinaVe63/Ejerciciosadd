import java.util.Scanner;

public class ContarBebes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N, contadorM = 0, contadorF = 0;
            char sexo;
            System.out.print("Ingrese la cantidad de nacimientos (N): ");
            N = scanner.nextInt();
            int i = 1;
            do {
                boolean sexoValido;
                do {
                    System.out.print("Ingrese el nombre del bebé " + i + ": ");
                    scanner.next();
                    System.out.print("Ingrese el sexo del bebé (M para masculino, F para femenino): ");
                    sexo = scanner.next().charAt(0);
                    sexoValido = sexo == 'F' || sexo == 'M';
                } while (!sexoValido);
                
                if (sexo == 'M') {
                    contadorM++;
                } else {
                    contadorF++;
                }
                i++;
            } while (i <= N);
            System.out.println("Cantidad de bebés masculinos: " + contadorM);
            System.out.println("Cantidad de bebés femeninos: " + contadorF);
        }
    }
}