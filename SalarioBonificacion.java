import java.util.Scanner;

public class SalarioBonificacion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese salario: ");
        double salario = entrada.nextDouble();

        System.out.print("Ingrese anios de trabajo: ");
        int anios = entrada.nextInt();

        double bono;

        if (anios > 5 && salario < 2000) {
            bono = 500;
            System.out.println("Recibe bono completo");
        } else if (anios > 5 || salario < 2000) {
            bono = 250;
            System.out.println("Recibe bono menor");
        } else {
            bono = 0;
            System.out.println("No recibe bono");
        }

        System.out.println("Bono: " + bono);
        System.out.println("Salario final: " + (salario + bono));

        entrada.close();
    }
}