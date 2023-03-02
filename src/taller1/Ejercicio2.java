import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double taller1, taller2, taller3, taller4, definitiva;

        System.out.println("calificacion final");
        System.out.print("Indica la nota del primer taller: ");
        taller1 = lectura.nextDouble();
        System.out.print("Indica la nota del segundo taller: ");
        taller2 = lectura.nextDouble();
        System.out.print("Indica la nota del tercer taller: ");
        taller3 = lectura.nextDouble();
        System.out.print("Indica la nota del taller: ");
        taller4 = lectura.nextDouble();

        definitiva = (taller1 + taller2 + taller3 + taller4) / 4;
        System.out.println("Nota 1: " + taller1);
        System.out.println("Nota 2: " + taller2);
        System.out.println("Nota 3: " + taller3);
        System.out.println("La nota final es de " + definitiva);

        if (definitiva >= 4.0 && definitiva <= 5.0) {
            System.out.println("Aprobaste con buenos resultados");
        } else {
            if (definitiva >= 3.0 && definitiva < 4.0) {
                System.out.println("paste raspando la asignatura ");
            } else {
                if (definitiva >= 0.0 && definitiva < 2.9) {
                    System.out.println("Reprobaste la asignatura");
                } else {
                    System.out.println("Error en las notas ingresadas");
                }

                lectura.close();

            }

        }
    }
}
