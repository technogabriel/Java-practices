package excepciones;

public class Exceptions {

    public static void main(String[] args) {
        try {
        var cuenta = division(10,0);

        }catch (Exception e){
            System.out.println("ocurrio un error : " + e.getMessage());

        }
    }
    public static int division(int numerador, int denominador){
        var resultado = Aritmetica.division(10,0);
        System.out.println("el resultado es = " + resultado);
        return resultado;
    }

    public static class Aritmetica {
        public static int division(int num1, int num2){
            return num1/num2;
        }
    }
}
