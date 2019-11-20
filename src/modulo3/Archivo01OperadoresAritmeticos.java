package modulo3;

public class Archivo01OperadoresAritmeticos {
    public static void main(String[] args) {
        // operador +
        int precioManzana = 1;
        System.out.println("Precio manzana: " + precioManzana);

        int precioNaranja = 2;

        int precioTotal = precioManzana + precioNaranja;
        System.out.println("Precio total: " + precioTotal);

        // operador -
        int precioMelon = 5;
        int descuento = 1;

        int precioConDescuento = precioMelon - descuento;
        System.out.println("Precio con descuento $" + precioConDescuento);

        // operador *
        int precioSandia = 5;
        int cantidadSandia = 3;

        int precioFinal = precioSandia * cantidadSandia;
        System.out.println("Precio final $" + precioFinal);

        // operador /
        int precioPizza =20;
        int personas = 3;

        int precioPorPersona = precioPizza / personas;
        System.out.println("Precio por persona $" + precioPorPersona);

        double precioPizza2 = 10;
        double personas2 = 4;

        double precioPorPersona2 = precioPizza2 / personas2;
        System.out.println("Precio por persona 2 $" + precioPorPersona2);
    }
}
