import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Map<Object, String> map = new HashMap<>();
        map.put("nombre", "Juan");
        map.put("apellido", "Perez");
        map.put("email", "jp@gmail.com");
        map.put("edad", "30");
        System.out.println("Valores del mapa: ");
        map.entrySet().forEach(System.out::println);

        //Iterando sobres los elementos del mapa por separado:
        System.out.println("\nIterando sobre los elementos del mapa por separado: ");
        map.forEach((k, v) -> System.out.println("Llave: " + k + ", Valor: " + v));
    }
}
