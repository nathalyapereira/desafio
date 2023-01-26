package dip;

public class Interruptor {
    private Dispositivo dispositivo;

    public Interruptor() {

    }

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;

    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    

    public void AcionarDispositivo() {
        if(dispositivo != null){
            dispositivo.Acionar();
        }else{
            System.out.println("Dispositivo null");

        }
    }


}
