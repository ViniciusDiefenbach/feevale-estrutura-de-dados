import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cinco {
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Pão", 3.2));
		produtos.add(new Produto("Leite", 2.5));
		produtos.add(new Produto("Manteiga", 1.99));
		produtos.add(new Produto("Iogurte", 2.1));
		produtos.add(new Produto("Mel", 7.5));

		boolean inserirNovoProduto = true;
		Scanner terminal = new Scanner(System.in);

		do {
			System.out.print("Deseja inserir um novo produto no caixa? (true/false): ");
			inserirNovoProduto = terminal.nextBoolean();
			if (inserirNovoProduto) {
				System.out.print("Digite a descrição do produto: ");
				if (produtos.size() != 0)
					terminal.nextLine();
				String descricao = terminal.nextLine();
				System.out.print("Digite o preço do produto: ");
				double preco = terminal.nextDouble();
				produtos.add(new Produto(descricao, preco));
			}
		} while (inserirNovoProduto);

		System.out.println(produtos);
		System.out.println("Produto com maior preco: "
				+ produtos.stream().max((o1, o2) -> o1.getPreco() > o2.getPreco() ? 1 : -1));
		System.out.println("Produto com menor preco: "
				+ produtos.stream().min((o1, o2) -> o1.getPreco() > o2.getPreco() ? 1 : -1));
		double total = produtos.stream().map(Produto::getPreco).reduce(0.00, (acc, p) -> acc + p);
		System.out.println("Preço total do caixa: R$" + total);
		System.out.printf("Média dos preços dos produtos comprados: R$%.2f\n", total/produtos.size());

		terminal.close();
	}
}

class Produto {
	private String descricao;
	private double preco;

	public Produto(String descricao, double preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", preco=R$" + String.format("%.2f", preco) + "]";
	}
}