import java.util.Scanner;

public class ContrasenaSegura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese contrasena numerica: ");
        int contrasena = entrada.nextInt();

        if (contrasena > 1000 && contrasena < 9999) {
            System.out.println("Contrasena valida");
        } else {
            System.out.println("Contrasena invalida");
        }

        entrada.close();
    }
}