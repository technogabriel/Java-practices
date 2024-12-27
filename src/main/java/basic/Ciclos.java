package basic;

public class Ciclos {

    public static void main(String[] args) {
        var contador = 1;
        final var max_value = 5;
        while (contador <= max_value) {
            System.out.println("contador = " + contador);
            contador++;
        }
    }
}
