package isp;

public class Pinguin implements Aves{

    @Override
    public String Localizacao() {
        return "Pinguin - Localizada a partir da longitude e latitude";
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando...");
    }

  
    
}
