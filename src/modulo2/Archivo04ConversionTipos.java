package modulo2;

public class Archivo04ConversionTipos {
    public static void main(String[] args) {
        // 3 formas de convertir tipos de variables
        // 1 natural
        // 2 casting
        // 3 metodo

        // int a double, natural
        int precioNaranjaInt = 5;
        double precioNaranjaDouble = precioNaranjaInt;
        System.out.println("Precio naranja:" + precioNaranjaDouble);

        // double a int, casting
        double precioManzanaDouble = 5.5;
        int precioManzanaInt = (int) precioManzanaDouble;
        System.out.println("Precio manzana:" + precioManzanaInt);

        // int a String, metodo
        int precioBananaInt = 2;
        String precioBananaString = String.valueOf(precioBananaInt);
        System.out.println("Precio banana: " + precioBananaString);

        // double a String, metodo
        double precioPeraDouble = 4.5;
        String precioPeraString = String.valueOf(precioPeraDouble);
        System.out.println("Precio pera: " + precioPeraString);

        // String a int, metodo
        String precioMelonString = "5.5";
        int precioMelonInt = Integer.parseInt(precioMelonString);
        System.out.println("Precio melon: " + precioMelonInt);

        // String a double, metodo
        String precioUvaString = "5";
        double precioUvaDouble = Double.parseDouble(precioUvaString);
        System.out.println("Precio de uva: " + precioUvaDouble);
    }
}
