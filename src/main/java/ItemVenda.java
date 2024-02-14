public class ItemVenda {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemVenda(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return preco * quantidade;
    }
}
