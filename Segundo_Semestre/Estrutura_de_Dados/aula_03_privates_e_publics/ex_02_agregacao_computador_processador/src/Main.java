public class Main {
    public static void main(String[] args) {
        Processador p1 = new Processador();
        Computador c1 = new Computador();
        Computador c2 = new Computador();

        p1.setModelo("Intel");
        p1.setNumNucleos(6);

        c1.setTipo("Desktop");
        c1.setMemoriaRAM(16);
        c1.setProcessador(p1);

        c2.setTipo("Desktop");
        c2.setMemoriaRAM(16);

        c1.ligar();
        //c2.ligar();
    }
}