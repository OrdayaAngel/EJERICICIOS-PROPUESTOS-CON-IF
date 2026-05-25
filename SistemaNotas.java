import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        double nota3 = entrada.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 11) {
            System.out.println("Aprobado");
        } else if (promedio < 11 && promedio > 8) {
            System.out.println("Recuperacion");
        } else {
            System.out.println("Desaprobado");
        }

        entrada.close();
    }
}
