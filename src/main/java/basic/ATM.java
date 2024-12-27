package basic;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        System.out.println("*** Cajero Automatico ***");
        var salir = false;
        var saldo = 1000.00;
        var consola = new Scanner(System.in);
        while (!salir){
            System.out.println("""
                     1. Consultar saldo
                     2. Retirar efectivo
                     3. Depositar efectivo
                     4. Salir
                     Escoje una opcion: \s""");
            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    var retiro = Double.parseDouble(consola.nextLine());
                    if (retiro > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= retiro;
                        System.out.println("Saldo restante: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    var deposito = Double.parseDouble(consola.nextLine());
                    saldo += deposito;
                    System.out.println("Saldo actualizado: " + saldo);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
