/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios servicios = new Servicios();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean band = true;
        
        while (band) {            
            System.out.println("Menu principal");
            System.out.println("1. Crear persona");
            System.out.println("2. Mostar listado de persona");
            System.out.println("3. Buscar persona");
            System.out.println("4. Calcular si es mayor de edad");
            System.out.println("5. Calcular IMC");
            System.out.println("6. Salir");
            int resp = leer.nextInt();
            
            switch(resp){
                case 1:
                    servicios.crearPersona();
                    break;
                case 2:
                    servicios.mostrarPersonas();
                    break;
                case 3:                    
                    servicios.buscarPersona();
                    break;
                case 4:
                    servicios.mayordeEdad();
                    break;
                case 5:
                    servicios.calcularIMC();
                    break;
                case 6:
                    System.out.println("Salio del programa");
                    band = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
                
        
    }
    
}
