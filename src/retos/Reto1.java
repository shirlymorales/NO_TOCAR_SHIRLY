package retos;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        double gradosK=0;
        double gradosC=350; 
        double kgTorta;
        try (Scanner leer = new Scanner (System.in)){
            gradosK = ( gradosC + 213.5);
        System.out.println("350 grados centigrados convertidos a kelvin son : "+ gradosK);
        kgTorta = (0.13 * 10);
        System.out.println("La torta de vainilla necesita: "+ kgTorta + "kg de arina");
        }
        
    }
}

