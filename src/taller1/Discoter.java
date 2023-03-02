import java.util.Scanner;

public class Discoter {
    public static void main(String[] args) {
int numero;
Scanner lectura =new Scanner(System.in);
System.out.println("Ingrese el numero");
numero= lectura.nextInt();
if (numero>0){
   System.out.println("el numero es positivo");

} 
else if (numero<0){
   System.out.println("el numero es negativo");

}
else{
   System.out.println("el numero es neutro");

}
lectura.close();

 }

    }

