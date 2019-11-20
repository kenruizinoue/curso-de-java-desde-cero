package modulo3;

public class Archivo02OperadoresAsignacion {
    public static void main(String[] args) {
        // operador =
        int nivel = 5;
        System.out.println("Nivel:" + nivel);

        // nivel = 6
        nivel = nivel + 1;
        System.out.println("Nivel: " + nivel);

        // nivel = 16
        nivel = nivel + 10;
        System.out.println("Nivel: " + nivel);

        // operador +=
        int puntos = 5;
        puntos += 7;
        System.out.println("Cantidad puntos: " + puntos);

        // operador -=
        puntos -= 12;
        System.out.println("Cantidad puntos: " + puntos);

        // operador *=
        puntos += 2;
        puntos *= 100;
        System.out.println("Cantidad puntos: " + puntos);

        // operador /=
        puntos /= 4;
        System.out.println("Cantidad puntos: " + puntos);
    }
}
