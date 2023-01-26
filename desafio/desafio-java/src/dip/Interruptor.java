package dip;

public class Interruptor {
    private boolean ligado;

    
    public Interruptor() {
        this.ligado = true;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void Acionar() {
        if (!this.ligado)
            this.Ligar();
        else
            this.Desligar();
    }

    public void Ligar() {
        System.out.println("Ligado!");
    }

    public void Desligar() {
        System.out.println("Desligado!");
    }



    public void AcionarDispositivo(Dispositivo dispositivo) {
        dispositivo.setLigado(dispositivo.getLigado());
    }
    
}
