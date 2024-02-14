public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Vendedor
        Vendedor vendedor1 = new Vendedor("João", 30, "Rua A, 123", 2500.0, 30000.0);

        // Chamando métodos para mostrar detalhes e calcular bônus
        vendedor1.mostrarDetalhes();
        double bonus = vendedor1.calcularBonus(5000.0);
        System.out.println("Bônus: " + bonus);
    }
}
