package dip;

public class App {

    public static void main(String[] args) {
        Interruptor interruptor = new Interruptor();

        Ventilador ventilador = new Ventilador();
        interruptor.setDispositivo(ventilador);
        interruptor.AcionarDispositivo();

        Lampada lampada = new Lampada();
        interruptor.setDispositivo(lampada);
        interruptor.AcionarDispositivo();



    }
    
}
