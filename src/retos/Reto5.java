package retos;
import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        String iniciales;
    
    
        System.out.println("Este programa pide nombre y apellidos y después devuelve las iniciales.");
        System.out.print("Nombre: ");
        nombre = lectura.nextLine();
        System.out.print("Primer apellido: ");
        apellido1 = lectura.nextLine();
        System.out.print("Segundo apellido: ");
        apellido2 = lectura.nextLine();
    
    
        iniciales = nombre.substring(0,1)+apellido1.substring(0,1)+apellido2.substring(0,1);
    
    
        System.out.println("Las iniciales son: " +iniciales);   
        
        
        lectura.close();


      }
      
    }
