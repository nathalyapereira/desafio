package dip;

public class Lampada implements Dispositivo{
    private boolean ligado;

    @Override
    public boolean getLigado() {
        return ligado;
    }

    @Override
    public void setLigado(boolean ligado) {
        this.ligado = ligado;

        
    }

    @Override
    public void Acionar() {
        if (!this.ligado)
            this.Ligar();
        else
            this.Desligar();
    }

    @Override
    public void Ligar() {
        System.out.println("Lâmpada - Ligado!");
    }

    @Override
    public void Desligar() {
        System.out.println("Lâmpada - Desligado!");
    }
  
    
}
