import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un anio: ");
        int anio = entrada.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El anio es bisiesto");
        } else {
            System.out.println("El anio no es bisiesto");
        }

        entrada.close();
    }
}