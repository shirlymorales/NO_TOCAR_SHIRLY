import java.util.Scanner;
public class Cajaregistradora {
    public static void main(String[] args) throws Exception {

        int precio, cantidad;
        Scanner lectura= new Scanner(System.in);

        for (int x = 1; x <= 5; x++) {
            System.out.println("Digite el precio del producto");

            precio = lectura.nextInt();

            System.out.println("Digite la cantidad del producto");

            cantidad = lectura.nextInt();
            int subtotal = precio * cantidad;
            System.out.println("El precio es " + precio);
        }

     

        
        lectura.close();

    }
    
}
