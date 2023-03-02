import java.util.Scanner;
public class Actividad {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        System.out.println("ingresa un numero");
        int num1;
        num1 = lectura.nextInt();
        System.out.println("ingresa otro numero");
        int num2;
        num2 = lectura.nextInt();

        if (num1>num2) {
            System.out.println("La suma de los dos números ingresados es de: " + (num1 + num2));
        } else if (num1<num2) {
            System.out.println("La resta de los números ingresados es de: " + (num2 - num1));
        }else{
            System.out.println("La multiplicación de ambos números es de: " + (num1*num2));
        }
        lectura.close();
    }     
    
}