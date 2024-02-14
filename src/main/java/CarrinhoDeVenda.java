import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeVenda {
    private List<ItemVenda> itens;

    public CarrinhoDeVenda() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public void removerItem(ItemVenda item) {
        itens.remove(item);
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.getTotal();
        }
        return total;
    }

    public void limpar() {
        itens.clear();
    }
}
