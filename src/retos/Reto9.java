package retos;
import java.util.Scanner;
public class Reto9 {
    public static void main(String args[]){
		try(Scanner lectura = new Scanner(System.in)){
			int select = (int)(Math.random() * 2) + 1;
			int opcion,contador=0,juego=1,apostado=1;
			while (juego==1) {
			System.out.println("Ingrese la cantidad que quiere apostar en caso de ue ya jugara coloque la cantidad con la que terminó la ronda pasada: ");
			apostado=lectura.nextInt();
			System.out.println("Cara:1 ");
			System.out.println("Sello:2 ");
			opcion= lectura.nextInt();
	
			System.out.println("La computadora ya elijio ");
			switch ( select ){
				case 1:
					System.out.println("Cara");
					switch ( opcion ){
						case 1: System.out.println("Usted gana "+(apostado+500)); 
						break;
						case 2: System.out.println("Usted Pierde "+(apostado-500)); 
						break;
					}
				case 2:
					System.out.println("Sello");
					switch ( opcion ){
						case 1: System.out.println("Usted Pierde "+(apostado-500)); 
						break;
						case 2: System.out.println("Usted gana "+(apostado+500)); 
						break;

				}
				System.out.println("Desea volver a jugar?(1 para si, 2 para no) ");
				juego=lectura.nextInt();
				contador=contador+1;

		}
		}
		System.out.println("Usted jugó una cantidad de: "+contador+" veces");
		System.out.println("Usted terminó con un total de: "+apostado+" puntos");
        }
	}
}
