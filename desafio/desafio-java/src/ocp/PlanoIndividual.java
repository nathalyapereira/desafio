package ocp;

public class PlanoIndividual implements PlanoDeSaude {

    @Override
    public double pagarPlano(double valor, String franquia) {
        double valorDoPlano= 0;

        if(franquia.equals("UniMedicos")){
            valorDoPlano = 450.0;
            
        }else if(franquia.equals("HappyMedicos")){
            valorDoPlano = 400.0;
            

        }
        return valorDoPlano;
        
        
    }

    
}
