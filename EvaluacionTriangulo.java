import java.util.Scanner;

public class EvaluacionTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese lado 1: ");
        int lado1 = entrada.nextInt();

        System.out.print("Ingrese lado 2: ");
        int lado2 = entrada.nextInt();

        System.out.print("Ingrese lado 3: ");
        int lado3 = entrada.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Si forman un triangulo");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triangulo equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triangulo isosceles");
            } else {
                System.out.println("Es un triangulo escaleno");
            }

        } else {
            System.out.println("No forman un triangulo");
        }

        entrada.close();
    }
}
