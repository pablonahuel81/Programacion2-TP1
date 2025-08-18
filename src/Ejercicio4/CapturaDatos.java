
package Ejercicio4;

import java.util.Scanner;

public class CapturaDatos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        String nombre;
       
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        
        edad = input.nextInt();
       
        System.out.println(nombre);
        
        System.out.println(edad);
        
         
        
    }
}
