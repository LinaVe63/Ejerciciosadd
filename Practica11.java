/*
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa 
   para gestionar las facturas. En cada factura figura: el codigo del articulo, 
   la cantidad vendida en litros, y el precio por litro. Se pide de 5 facturas 
   introducidas: Facturación total, cantidad en litros vendidos del articulo 1 y 
   cuántas facturas se emitieron de mas de $600.
 */

package practica1;

import java.util.Scanner;

/*
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Practica11 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        int codArticulo, cantidadVentaLitros, litrosArticulo1 = 0, conteoMayor600 = 0;
        double precioLitro, importeFactura, facturacionTotal = 0;
        
        // Bucle para ingresar los datos de las facturas
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura " + i);
            
            // Lectura de datos de la factura
            System.out.println("Digite el codigo del articulo: ");
            codArticulo = entrada.nextInt();
    
            System.out.println("Digite la cantidad vendida en litros: ");
            cantidadVentaLitros = entrada.nextInt();
    
            System.out.println("Digite el precio por litro: ");
            precioLitro = entrada.nextDouble();  
            
            // Cálculo del importe de la factura y actualización de la facturación total
            importeFactura = cantidadVentaLitros * precioLitro; 
            facturacionTotal += importeFactura; 
            
            // Verificación si el código del artículo es 1
            if(codArticulo == 1){
                litrosArticulo1 += cantidadVentaLitros; 
            }
            
            // Verificación si el importe de la factura es mayor a $600
            if (importeFactura > 600){
                conteoMayor600 ++; 
            }
        }
        
        // Impresión de resultados
        System.out.println("Facturación total: " +facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: " +litrosArticulo1);
        System.out.println("Cantidad de facturas emitidas de más de $600: " +conteoMayor600);
    }
}