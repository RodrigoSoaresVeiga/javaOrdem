package javaOrdem;
import java.util.*;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$ " + preco;
    }
}

public class OrdemProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); 
            produtos.add(new Produto(nome, preco));
        }

        produtos.sort((p1, p2) -> Double.compare(p2.preco, p1.preco));

        System.out.println("\nProdutos ordenados do mais caro para o mais barato:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        scanner.close();
    }
}
