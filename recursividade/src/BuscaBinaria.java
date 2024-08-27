import java.util.Arrays;

public class BuscaBinaria {
	public static void main(String[] args) {
		int[] vetor = { 1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95 };
		int num = 95;

		System.out.println("Busca Binaria Recursiva #1: " + buscaBinariaRecursiva(vetor, num));
		System.out.println("Busca Binaria Recursiva #2: " + buscaBinariaRecursiva(vetor, num, 0, vetor.length));
		System.out.println("Busca Binaria Iterativa: " + buscaBinariaIterativa(vetor, num));
	}

	public static int buscaBinariaRecursiva(int[] vetor, int num) {
		if (vetor.length >= 1) {
			int meio = vetor.length / 2;
			if (vetor[meio] == num)
				return meio;
			else if (num > vetor[meio]) {
				int aux = buscaBinariaRecursiva(Arrays.copyOfRange(vetor, meio + 1, vetor.length), num);
				if (aux != -1) {
					return meio + 1 + aux;
				}
			} else
				return buscaBinariaRecursiva(Arrays.copyOfRange(vetor, 0, meio), num);
		}
		return -1;
	}
	
	public static int buscaBinariaRecursiva(int[] vetor, int num, int inicio, int fim) {
		if (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			if (vetor[meio] == num)
				return meio;
			else if (num > vetor[meio])
				return buscaBinariaRecursiva(vetor, num, meio + 1, fim);
			else
				return buscaBinariaRecursiva(vetor, num, inicio, meio - 1);
		}
		return -1;
	}

	public static int buscaBinariaIterativa(int[] vetor, int num) {
		int inicio = 0;
		int fim = vetor.length;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			if (vetor[meio] == num)
				return meio;
			else if (num > vetor[meio])
				inicio = meio + 1;
			else
				fim = meio - 1;
		}
		return -1;
	}
}
