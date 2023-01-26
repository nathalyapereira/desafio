package srp;

import java.util.ArrayList;
import java.util.List;

public class CompraDAO {
    private List<Compra> compras =  new ArrayList<>();

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public void realizarCompra(Compra compra) {
        compras.add(compra);
    }



    
}
