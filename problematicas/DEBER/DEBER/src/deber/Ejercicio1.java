/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreJugador;
        String Posicion;
        String CadenaFinal = "";
        String totalEdades = "";
        int salir;
        int edad;
        int contador = 0;
        int sumaEdades = 0;
        boolean bandera = true;
        double sumaEstaturas = 0.0;
        double estatura;
        double promedioEdad;
        double promedioEstatura;
        CadenaFinal = String.format("%s%s\n", CadenaFinal,
               "Listado de Jugadores");
        do {
            System.out.println("Ingrese el nombre del jugador");
            nombreJugador = entrada.nextLine();
            System.out.println("Cual es la posición que juega en el campo?");
            Posicion = entrada.nextLine();
            System.out.println("Cual es la edad del jugador?");
            edad = entrada.nextInt();
            System.out.println("Cuale es la estatura del jugador?");
            estatura = entrada.nextDouble();
            sumaEstaturas = sumaEstaturas + estatura;
            sumaEdades = sumaEdades + edad;
            contador = contador + 1;
            CadenaFinal = String.format("%s%d. %s - %s-, edad %d, estatura "
                    + "%.2f\n",
                    CadenaFinal, contador, nombreJugador,
                    Posicion, edad, estatura);
            totalEdades = String.format("%s%d\n", totalEdades, edad);
            entrada.nextLine();
            System.out.println("Si no hay mas jugadores que añadir escriba "
                    + "cualquier numero mayor a 1");
            salir = entrada.nextInt();
            entrada.nextLine();
            if (salir > 0) {
                bandera = false;
            }
        } while (bandera);
        promedioEdad = (double) sumaEdades / contador;
        promedioEstatura = sumaEstaturas / contador;
        CadenaFinal = String.format("%sListado de Edades\n%s"
                + "Promedio de edades: %.2f\nPromedio de estaturas: %.2f\n",
                CadenaFinal, totalEdades, promedioEdad, promedioEstatura);
        System.out.printf("%s\n", CadenaFinal);
    }

}
