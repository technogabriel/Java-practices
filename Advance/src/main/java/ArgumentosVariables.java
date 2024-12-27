public class ArgumentosVariables {

    public static void main(String[] args) {
       // imprimirNumeros(1,2,3,4);
        variosParametros("pepe", 1,2,3,4,5);
    }

    static void variosParametros(String nombre, int... numeros ){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    static void imprimirNumeros(int... numeros){
        for (int i = 0; i< numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
