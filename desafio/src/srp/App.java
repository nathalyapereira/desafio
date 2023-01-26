package srp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class App {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
       
        int contador = 0;
        boolean resposta = true;
        Cliente cliente = criarClienteUI(contador);
        while(resposta == true){
            comprarProduto(cliente);
            System.out.println("Deseja realizar outra compra?\nDigite o número \n 1 - Sim\n 2 - Não");
            int outraCompra = scanner.nextInt();
            
            if (outraCompra == 2) {
                resposta = false;
            } 

            if(resposta == true){
                System.out.print("Com o mesmo Cliente?\nDigite o número \n 1 - Sim\n 2 - Não\n");
                int mesmoCliente = scanner.nextInt();
                if (mesmoCliente == 2) {
                    cliente = criarClienteUI(contador);
                }
            }
             
            contador++;
        }


        scanner.close();

        
    }

    public static Cliente criarClienteUI(int idAnterior) {



        System.out.println("Informe o seu nome Cliente:");

        String nomeCliente = scanner.next();
        System.out.println("Quanto você está disposto a gastar:");
        double dispostoGastar = scanner.nextDouble();
        
        
        
        return new Cliente(idAnterior+ 1,nomeCliente, dispostoGastar);

    }
    
    public static void comprarProduto(Cliente cliente) {
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(1, "Calça Jeans", 400.00));
        produtos.add(new Produto(2, "Cropped", 100.00));
        produtos.add(new Produto(3, "Calça de Shopping", 300));
        
        System.out.println("O que deseja comprar?");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);

            System.out.println(produto.getId() + " - " + produto.getNome() + " - " + produto.getPreco());


        }
        int produtoEscolhido = scanner.nextInt();
        Produto produtoSelecionado = produtos.get(produtoEscolhido - 1);
        System.out.print("Qual a quantidade?\n");
        int quantidade = scanner.nextInt();

        Compra compra = new Compra(produtoSelecionado, cliente, quantidade);

        CompraDAO compraDAO = new CompraDAO();
        compraDAO.realizarCompra(compra);






    }
    

}