package basic;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona la base");
        var base = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona la altura");
        var altura = Integer.parseInt(consola.nextLine());
        var area = base * altura;
        System.out.println("area calculada : " + area);
    }
}
