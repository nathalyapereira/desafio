package ocp;

public class PagamentoMensalFranquia {
    
    public static void pagarPlano(PlanoDeSaude planoDeSaude,String escolhaFranquia , Cliente cliente) {
        double saldoAtual = cliente.getSaldo() - planoDeSaude.pagarPlano(cliente.getSaldo(), escolhaFranquia);

        if(saldoAtual < 0) {
            System.out.println("Saldo insuficiente");
            return;
        }
        cliente.setSaldo(saldoAtual);
    }
}
