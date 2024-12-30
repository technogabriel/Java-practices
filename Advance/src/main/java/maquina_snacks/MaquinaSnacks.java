package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        //crear la lista de productos de tipo snacks:
        List<Snack>productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks *** ");
        Snacks.mostrarSnacks(); // Mostrar inventario

        while(!salir){
            try{
                var opcion = mostarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);

            }catch (Exception e ){
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                System.out.println(); // imprime salto de linea con cada iteracion
            }
        }
    }

    private static int mostarMenu(Scanner consola){
        System.out.println("""
                Selecciona una opcion:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo Snack
                4. Salir
                Elige una opcion: \n""");
        //Leo y retorno la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack>productos){
        var salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Gracias por tu compra");
                salir = true;
            }
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack>productos){
        System.out.println("Selecciona el snack que deseas comprar (id) : ");
        var idSnack = Integer.parseInt(consola.nextLine());
        //validar que el snack exista en la lista de snacks:
        var isSnack = false;
        for(var snack : Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()){
                //agregamos a la lista de productos:
                productos.add(snack);
                System.out.println("Snack agregado: " + snack);
                isSnack = true;
                break;
            }
        }
        if(!isSnack){
            System.out.println("Snack no encontrado : " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack>productos){
        var ticket = "*** Ticket de Venta *** ";
        var total = 0.0;
        for(var producto : productos){
            ticket += "\n\t- " + producto.getNombre() + " $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal: $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola){
        System.out.print("Ingresa el nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa el precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Snack agregado ");
        Snacks.mostrarSnacks();
    }
}
