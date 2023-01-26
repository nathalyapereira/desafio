package ocp;

public class PlanoFamilia implements PlanoDeSaude {

    @Override
    public double pagarPlano(double valor, String franquia) {
        double valorDoPlano = 0;

        if (franquia.equals("UniMedicos")) {
            valorDoPlano = 1250;
           
        } else if (franquia.equals("HappyMedicos")) {
            valorDoPlano = 1200;
        
        }
        return valorDoPlano;
    }

}
