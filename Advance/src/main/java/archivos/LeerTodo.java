package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var miArchivo = "prueba.txt";
        try{
            //leer todas las lineas del archivo:
            List<String> lineas = Files.readAllLines(Paths.get(miArchivo));
            System.out.println("contenido del archivo : ");
            lineas.forEach(System.out::println);

        }catch (Exception e ){
            System.out.println("Error al leer el archivo " + e.getMessage());
            e.printStackTrace();
        }

    }
}
