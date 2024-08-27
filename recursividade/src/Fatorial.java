public class Fatorial {
	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("Fatorial Recursivo: " + fatorialRecursivo(num));
		System.out.println("Fatorial Iterativo: " + fatorialIterativo(num));
	}

	public static long fatorialRecursivo(int num) {
		if (num < 1)
			return 1;
		else
			return num * fatorialRecursivo(num - 1);
	}

	public static long fatorialIterativo(int num) {
		long aux = 1;
		for (int i = num; i > 1; i--) {
			aux *= i;
		}
		return aux;
	}
}
