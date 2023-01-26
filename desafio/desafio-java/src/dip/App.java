package dip;

public class App {

    public static void main(String[] args) {
        Interruptor interruptor = new Interruptor();
        System.out.println("Ligando..."+ interruptor.getLigado());

        Ventilador ventilador = new Ventilador();
        interruptor.AcionarDispositivo(ventilador);

        Lampada lampada = new Lampada();
        interruptor.AcionarDispositivo(lampada);



    }
    
}
