
public class Tres {
	public static void main(String[] args) {
		CalculadoraDeTamanhoDeArquivo.valor = 10.0;
	}

}

class CalculadoraDeTamanhoDeArquivo {
	int indexTamanhoAtual;
	double valor;

	public CalculadoraDeTamanhoDeArquivo(double valor, Tamanhos tamanhoAtual) {
		this.indexTamanhoAtual = getIndexDeTamanhos(tamanhoAtual);
		this.valor = valor;
	}

	public double getValorEm(Tamanhos tamanhoDesejado) {
		int indexTamanhoDesejado = getIndexDeTamanhos(tamanhoDesejado);
		int quantidadeOperacoes = Math.abs(indexTamanhoDesejado - this.indexTamanhoAtual);
		
		for(int i = 0; i < quantidadeOperacoes; i++) {
			if (indexTamanhoDesejado > indexTamanhoDesejado) {
				this.valor *= 1024;
			}
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