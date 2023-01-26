package ocp;

import java.util.Scanner;

public class App {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String clienteNome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double clienteSaldo = scanner.nextDouble();

        System.out.println("Qual plano deseja escolher?\nDigite o número \n 1 - Plano de Saúde Individual\n 2 - Plano de Saúde Família");
        int escolhaPlanos = scanner.nextInt();

        System.out.println("Qual franquia deseja escolher?\nDigite  \n - UniMedicos\n - HappyMedicos");
        String escolhaFranquia = scanner.next();
        Cliente cliente = new Cliente(clienteNome, clienteSaldo);

        if(escolhaPlanos == 1){
            PagamentoMensalFranquia.pagarPlano(new PlanoIndividual(),escolhaFranquia, cliente);
        } else if(escolhaPlanos == 2){
            PagamentoMensalFranquia.pagarPlano(new PlanoFamilia(),escolhaFranquia, cliente);
            
            
        }

        System.out.println("Saldo restante: " + cliente.getSaldo());

        

        scanner.close();
    }

}
