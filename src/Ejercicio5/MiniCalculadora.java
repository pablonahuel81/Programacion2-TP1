
package Ejercicio5;

import java.util.Scanner;


public class MiniCalculadora {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
    
    int num1;
    
    System.out.println("Ingrese el primer numero: ");
    
    num1 = input.nextInt();
    
    int num2;
    
    System.out.println("Ingrese el segundo numero: ");
    
    num2 = input.nextInt();
    
    int suma = num1 + num2;
    
    int resta = num1 - num2;
    
    int multiplicacion = num1 * num2;
    
    double division = num1 / num2;
    
    division = (double) num1 / num2;
    
    System.out.println("El resultado de la suma es: " + suma);
    System.out.println("El resultado de la resta es: " + resta);
    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    System.out.println("El resultado de la división es: " + division);
          
    }
      
    
}
