package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Galletas", 50.0));
        snacks.add(new Snack("Chocolate", 120.0));
    }
    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var invetarioSnacks ="";
        for(var snack : snacks){
            invetarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(invetarioSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
