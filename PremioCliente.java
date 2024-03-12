import java.util.Scanner;
/**
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */
public class PremioCliente {
    
    public static void main(String[] args) {
        char genero;
        int numeroBolita;
        String premio;
        
        System.out.print("Ingrese el género del cliente (H para hombre, M para mujer): ");
        try (Scanner scanner = new Scanner(System.in)) {
            genero = scanner.next().charAt(0);
            
            // Determinar premio según género
            switch (genero) {
                case 'H', 'h' -> {
                    System.out.print("Ingrese el número de la bolita que sacó el cliente: ");
                    numeroBolita = scanner.nextInt();
                    premio = switch (numeroBolita) {
                    case 1 -> "Desodorante";
                    case 2 -> "Six-Pack de cerveza";
                    case 3 -> "Camiseta";
                    case 4 -> "Pantaloneta";
                    case 5 -> "Sudadera";
                    default -> "Premio no válido";
                };
                }
                case 'M', 'm' -> {
                    System.out.print("Ingrese el número de la bolita que sacó la cliente: ");
                    numeroBolita = scanner.nextInt();
                    premio = switch (numeroBolita) {
                    case 1 -> "Loción";
                    case 2 -> "Bikini";
                    case 3 -> "Crema para la cara";
                    case 4 -> "Plancha para el cabello";
                    case 5 -> "Esmalte de uñas";
                    default -> "Premio no válido";
                };
                }
                default -> premio = "Género no válido";
            }
            
            // Mostrar premio correspondiente
            System.out.println("El premio para el cliente es: " + premio);
        }
    }
}
