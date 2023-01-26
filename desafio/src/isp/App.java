package isp;

public class App {
    
    public static void main(String[] args) {
        Aguia aguia = new Aguia();
        Pinguin pinguin = new Pinguin();
	
        System.out.println(aguia.Localizacao());
        System.out.println(aguia.voar());
        System.out.println(pinguin.Localizacao());
    }
}
