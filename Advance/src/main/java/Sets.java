import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        //Set no acepta valores repetidos
        Set<String> conjuntos = new TreeSet<>();
        conjuntos.add("uno");
        conjuntos.add("dos");
        conjuntos.add("tres");
        conjuntos.add("uno");

        conjuntos.forEach(System.out::println);
    }
}
