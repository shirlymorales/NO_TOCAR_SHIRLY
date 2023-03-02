package retos;
import java.util.Scanner;

public class Reto4 {
    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Juego piedra-papel-tijera");
        
 
        int seleccionCompu = (int)(Math.random() * 3) + 1;
        System.out.println("La computadora ya escogio...");
 
        System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
        int seleccionUsuario = lectura.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( seleccionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Usted gana!"); break;
                   case 3: System.out.println("La computadora gana!"); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("La computadora gana!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Usted gana!"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Usted gana!"); break;
                   case 2: System.out.println("La computadora gana!"); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
        }
 lectura.close();

    }
}

