package srp;

public class Compra {
    private Produto produto;
    private Cliente cliente;
    private int quantidadeProduto;

    public Compra(Produto produto, Cliente cliente, int quantidadeProduto) {
        this.produto = produto;
        this.cliente = cliente;
        this.quantidadeProduto = quantidadeProduto;
    }
    
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    


    
}
