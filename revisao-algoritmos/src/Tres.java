import java.util.Scanner;

public class Tres {
	public static void main(String[] args) {
		Tamanhos tamanhoUsadoTerminal = Tamanhos.MB;
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite quantos MB seu arquivo possui: ");
		CalculadoraTamanhos c = new CalculadoraTamanhos(terminal.nextDouble(), tamanhoUsadoTerminal);
		System.out.printf("Tamanho do arquivo em B: %f\n", c.getValorEm(Tamanhos.B));
		System.out.printf("Tamanho do arquivo em KB: %f\n", c.getValorEm(Tamanhos.KB));
		System.out.printf("Tamanho do arquivo em MB: %f\n", c.getValorEm(Tamanhos.MB));
		System.out.printf("Tamanho do arquivo em GB: %f\n", c.getValorEm(Tamanhos.GB));
		System.out.printf("Tamanho do arquivo em TB: %f\n", c.getValorEm(Tamanhos.TB));
		
		terminal.close();
	}
}

class CalculadoraTamanhos {
	int indexTamanhoAtual;
	double valor;

	public CalculadoraTamanhos(double valor, Tamanhos tamanhoAtual) {
		this.indexTamanhoAtual = getIndexDeTamanhos(tamanhoAtual);
		this.valor = valor;
	}

	public double getValorEm(Tamanhos tamanhoDesejado) {
		int indexTamanhoDesejado = getIndexDeTamanhos(tamanhoDesejado);
		int quantidadeOperacoes = Math.abs(indexTamanhoDesejado - this.indexTamanhoAtual);
		
		for(int i = 0; i < quantidadeOperacoes; i++) {
			if (this.indexTamanhoAtual > indexTamanhoDesejado) {
				this.valor /= 1024;
			} else if (this.indexTamanhoAtual < indexTamanhoDesejado) 
				this.valor *= 1024;
		}
		
		this.indexTamanhoAtual = indexTamanhoDesejado;
		return this.valor;
	}

	private int getIndexDeTamanhos(Tamanhos entrada) {
		Tamanhos[] vetor = Tamanhos.values();
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] == entrada)
				return i;
		}
		return 0;
	}
}

enum Tamanhos {
	B, KB, MB, GB, TB
}