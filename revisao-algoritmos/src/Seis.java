
public class Seis {
	public static void main(String[] args) {
		int[] vetor = { 1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95 };
		int num = 35;

		System.out.println("Busca Sequencial: " + buscaSequencial(vetor, num));
		System.out.println("Busca Binaria: " + buscaBinaria(vetor, num));
	}

	private static int buscaBinaria(int[] vetor, int num) {
		int inicio = 0;
		int fim = vetor.length;
		while (fim > inicio) {
			int meio = (inicio + fim) / 2;
			if (num == vetor[meio])
				return meio;
			else if (num > vetor[meio])
				inicio = meio + 1;
			else
				fim = meio - 1;
		}
		return -1;
	}

	private static int buscaSequencial(int[] vetor, int num) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num)
				return i;
		}
		return -1;
	}
}
