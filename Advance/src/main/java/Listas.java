import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("sabado");
        miLista.add("Domingo");

//        for(Object elemento : miLista){
//            System.out.println("Dia de la Semana : " + elemento);
//        }
        //Funciones Lambda
//        miLista.forEach(elemento -> {
//            System.out.println("Elemento -> " + elemento);
//        });
        //Funciones Lambda v2:
//        miLista.forEach(System.out::println);
        //V3
        List<String> nombres = Arrays.asList("Pedro", "Pepe", "Manolo");
        System.out.println("\nnombres: ");
        nombres.forEach(System.out::println);
    }
}
