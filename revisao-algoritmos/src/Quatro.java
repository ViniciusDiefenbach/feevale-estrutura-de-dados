import java.util.ArrayList;
import java.util.Scanner;

public class Quatro {
	public static void main(String[] args) {
		int sequenciaCodigo = 1;
		ArrayList<TipoProduto> produtos = new ArrayList<TipoProduto>();
		Scanner terminal = new Scanner(System.in);
		boolean criarOutroProduto = true;

		do {
			System.out.print("Digite a descrição do produto: ");
			if (produtos.size() != 0)
				terminal.nextLine();
			String descricao = terminal.nextLine();
			System.out.print("Digite o preco do produto: ");
			double preco = terminal.nextDouble();
			System.out.print("Este produto está em promoção? (true/false): ");
			boolean promocao = terminal.nextBoolean();

			produtos.add(new TipoProduto(sequenciaCodigo++, descricao, preco, promocao));

			System.out.print("Você deseja criar outro produto? (true/false): ");
			criarOutroProduto = terminal.nextBoolean();
		} while (criarOutroProduto);

		System.out.println(produtos.toString());
		terminal.close();
	}
}

class TipoProduto {
	int codigo;
	String descricao;
	double preco;
	boolean promocao;

	public TipoProduto(int codigo, String descricao, double preco, boolean promocao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.promocao = promocao;
	}

	@Override
	public String toString() {
		return "Produto Nº. " + codigo + " - [descricao=" + descricao + ", preco=" + preco + ", promocao="
				+ promocao + "]";
	}

}