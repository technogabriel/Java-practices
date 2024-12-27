package basic;

public class CiclosV2 {

    public static void main(String[] args) {
        final var Max = 5;
        var acum_suma = 0;

        for (var i = 0; i <= Max; i++) {
            System.out.println("suma a realizar : " + acum_suma + " + " + i);
            acum_suma += i;
            System.out.println("suma parcial : " + acum_suma);
        }
        System.out.println("suma  de los numeros : "  + acum_suma);
    }
}
