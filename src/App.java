import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura =new Scanner(System.in);
        System.out.println("Hello, World!");

        System.out.println("Introduce el primer número:");      
        System.out.println("Introduce el segundo número:");

        int numberOne;
        int numberTwo;
        int Resultado;
      
        numberOne= lectura.nextInt();
        numberTwo= lectura.nextInt();
        Resultado= numberOne + numberTwo;

        
        System.out.println("El numero ingresado es:"+numberOne);

        System.out.println("El numero ingresado es:"+numberTwo);

        System.out.println("El resultado de la suma es:"+Resultado);
        lectura.nextLine();






    System.out.println("Introduce un nombre");
    
    String nombre;

    nombre= lectura.nextLine();

    System.out.println("El nombre ingresado es" +nombre);

    lectura.close();

    




    
    }
}



