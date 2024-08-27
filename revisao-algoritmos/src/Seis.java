
public class Seis {
	public static void main(String[] args) {
		int[] vetor = { 1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95 };
		int numeroDesejado = 35;

		System.out.println("Busca Sequencial: " + buscaSequencial(vetor, numeroDesejado));
		System.out.println("Busca Sequencial: " + buscaBinaria(vetor, numeroDesejado));
	}

	private static int buscaSequencial(int[] vetor, int numeroDesejado) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroDesejado)
				return i + 1;
		}
		return -1;
	}

	private static int buscaBinaria(int[] vetor, int numeroDesejado) {
		int inicio = 0;
		int fim = vetor.length;
		while (fim > inicio) {
			int meio = (inicio + fim) / 2;
			if (numeroDesejado == vetor[meio])
				return meio + 1;
			else {
				if (numeroDesejado > vetor[meio])
					inicio = meio + 1;
				else
					fim = meio - 1;
			}
		}
		return -1;
	}
}
