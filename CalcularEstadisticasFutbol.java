
public class CalcularEstadisticasFutbol {
    
    public static void main(String[] args) {
        double[][][] equipos = new double[10][22][2];
        double pesoTotal = 0, edadTotal = 0;
        int equiposConPesoMayor75 = 0, equiposConEdadMenor18 = 0;

        // Capturar datos de los equipos
        for (int equipo = 0; equipo < 10; equipo++) {
            for (int jugador = 0; jugador < 22; jugador++) {
                // Simulando la captura de datos de peso y edad
                double peso = Math.random() * 100 + 50; 
                int edad = (int) (Math.random() * 20 + 18); 
                equipos[equipo][jugador][0] = peso;
                equipos[equipo][jugador][1] = edad;
            }
        }

        // Calcular promedio de cada equipo y promedio de toda la liga
        for (int equipo = 0; equipo < 10; equipo++) {
            double pesoEquipo = 0, edadEquipo = 0;
            for (int jugador = 0; jugador < 22; jugador++) {
                pesoEquipo += equipos[equipo][jugador][0];
                edadEquipo += equipos[equipo][jugador][1];
            }
            double pesoPromedioEquipo = pesoEquipo / 22;
            double edadPromedioEquipo = edadEquipo / 22;

            pesoTotal += pesoEquipo;
            edadTotal += edadEquipo;

            if (pesoPromedioEquipo > 75) {
                equiposConPesoMayor75++;
            }
            if (edadPromedioEquipo < 18) {
                equiposConEdadMenor18++;
            }

            System.out.println("Equipo " + (equipo + 1) + " - Peso Promedio: " + pesoPromedioEquipo +
                    " kg, Edad Promedio: " + edadPromedioEquipo + " años");
        }

        double pesoPromedioLiga = pesoTotal / (10 * 22);
        double edadPromedioLiga = edadTotal / (10 * 22);

        // Resultados
        System.out.println("Peso Promedio Liga: " + pesoPromedioLiga + " kg, Edad Promedio Liga: " +
                edadPromedioLiga + " años");
        System.out.println("Número de equipos con peso promedio mayor de 75 kg: " + equiposConPesoMayor75);
        System.out.println("Número de equipos con edad promedio menor de 18 años: " + equiposConEdadMenor18);
    }
}