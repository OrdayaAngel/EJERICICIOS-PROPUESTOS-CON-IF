import java.util.Scanner;

public class DescuentoCliente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese monto de compra: ");
        double monto = entrada.nextDouble();

        System.out.print("Ingrese tipo de cliente: ");
        String cliente = entrada.next();

        double descuento;

        if (monto > 500 && cliente.equalsIgnoreCase("VIP")) {
            descuento = monto * 0.20;
        } else if (monto > 500) {
            descuento = monto * 0.10;
        } else {
            descuento = 0;
        }

        double total = monto - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);

        entrada.close();
    }
}
