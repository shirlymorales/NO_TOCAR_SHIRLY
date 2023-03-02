import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
    double numberOne, numberTwo, total, total1, total2;
       int op;
       
       Scanner lectura =new Scanner(System.in);
       System.out.println("Ingrese el numero");
       numberOne= lectura.nextInt();
       System.out.println("Introduce el segundo número:");
       numberTwo= lectura.nextInt();

System.out.println("1.Suma 2.Resta 3.Multiplicacion 4.Division 5.Potenciacion 6.Radicacion");
op= lectura.nextInt();
switch (op) {
    case 1:
        total = numberOne + numberTwo;
        System.out.println("la suma entre" + numberOne + "y" + numberTwo + "es" + total);
        break;
    

    case 2:
        total = numberOne - numberTwo;
        System.out.println("la resta entre" + numberOne + "y" + numberTwo + "es" + total);
        break;
        
    case 3:
    total = numberOne * numberTwo;
    System.out.println("la Multiplicacion entre" + numberOne + "y" + numberTwo + "es" + total);
    
    break;
    case 4:
    total = numberOne / numberTwo;
    System.out.println("la Division entre" + numberOne + "y" + numberTwo + "es" + total);
    break; 

    case 5:
    Double pot;
    pot = Math.pow(numberOne, numberTwo);
    System.out.println("escogiste la operaion de poteciacion");
    System.out.println("el total de la potenciacion es de " + pot);
    break; 

    case 6:
    total1 = Math.sqrt(numberOne);
    total2 = Math.sqrt(numberTwo);
    System.out.println("el resultado de la radicacion del numero uno es: " + total1 + "el resultado de la radicacion del numero dos es: " + total2);
    break;
    

    default:
    System.out.println("la opcion seleccionada no es valida");
}
lectura.close();
}
    
}


