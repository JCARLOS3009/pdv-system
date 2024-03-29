public class Vendedor {
    // Atributos da classe
    private String nome;
    private int idade;
    private String endereco;
    private double salario;
    private double comissao;

    // Construtor da classe
    public Vendedor(String nome, int idade, String endereco, double salario, double comissao) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.salario = salario;
        this.comissao = comissao;
    }

    // Métodos de acesso (getters) e modificação (setters) dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Método para imprimir os detalhes do vendedor
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
        System.out.println("Comissão: " + comissao);
    }

    // Método para calcular o bônus do vendedor
    public double calcularBonus(double valorVendas) {
        // Exemplo simples: 10% do valor total das vendas como bônus
        return valorVendas * 0.10;
    }
}
