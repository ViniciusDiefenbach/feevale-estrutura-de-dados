
public class Um {
	private final static int NUMERO_DE_CARACTERES = 256;

	public static void main(String[] args) {
		for (int i = 0; i < NUMERO_DE_CARACTERES; i += 1) {
//			if (i >= 'A' && i <= 'Z' || i >= 'a' && i <= 'z')
			System.out.printf("%d => %c\n", i, i);
		}
	}
}
