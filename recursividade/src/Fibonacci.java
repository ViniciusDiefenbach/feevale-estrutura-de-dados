
public class Fibonacci {
	public static void main(String[] args) {
		int num = 50;
		
		System.out.println("Fibonacci Recursivo: " + fibonacciRecursivo(num));
		System.out.println("Fibonacci Iterativo: " + fibonacciIterativo(num));
	}

	public static long fibonacciRecursivo(int num) {
		if (num == 1 || num == 2)
			return 1;
		else
			return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
	}

	public static long fibonacciIterativo(int num) {
		long x = 1;
		long y = 1;
		for (int i = 2; i < num; i++) {
			x += y;
			y = x-y;
		}
		return x;
	}
}
