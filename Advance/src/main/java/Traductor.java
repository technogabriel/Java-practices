public interface Traductor {
    void traducir();

    default void iniciarTraductor(){
        System.out.println("Iniciando traductor... ");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Hello everybody");
    }
}

class Frances implements Traductor{
    @Override
    public void traducir() {
        System.out.println("uh lala...");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor en frances ...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor clase1 = new Ingles();
        clase1.iniciarTraductor();
        clase1.traducir();

        Traductor clase2 = new Frances();
        clase2.iniciarTraductor();
        clase2.traducir();
    }
}
