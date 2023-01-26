package isp;

public class Aguia implements AvesQueVoam{

    @Override
    public String Localizacao() {
    return "Aguia - Localizada na partir da longitude e latitude";
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando...");
    }

    @Override
    public String voar() {
        return "Aguia - Voando a partir da altitude";

    }

    
    
    
    
}
