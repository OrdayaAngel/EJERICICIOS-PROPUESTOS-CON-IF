import java.util.Scanner;

public class CategoriaEdad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese edad: ");
        int edad = entrada.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Categoria: Nino");
        }

        if (edad >= 13 && edad <= 17) {
            System.out.println("Categoria: Adolescente");
        }

        if (edad >= 18 && edad <= 64) {
            System.out.println("Categoria: Adulto");
        }

        if (edad >= 65) {
            System.out.println("Categoria: Adulto mayor");
        }

        if (edad < 0) {
            System.out.println("Edad invalida");
        }

        entrada.close();
    }
}