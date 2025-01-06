package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {

    public static void main(String[] args) {
        var miArchivo = "prueba.txt";
        var archivo = new File(miArchivo);
        try{
            System.out.println("contenido del archivo : ");
            var entrada = new BufferedReader(new FileReader(archivo));
            //leemos linea a linea el archivo
            var linea = entrada.readLine();
            //leemos todas las lineas:
            while(linea != null){
                System.out.println(linea);
                //antes de terminar el ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            //cerrar el arhivo
            entrada.close();
        }catch (Exception e ){
            System.out.println("Error al leer el archivo " + e.getMessage());
            e.printStackTrace();
        }
    }
}
