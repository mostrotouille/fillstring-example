package mx.com.mostrotouille.example.fillstring;

public class FillstringApplication {
	public static String fillString(String value, char fillCharacter, int maximumLength, boolean left) {
		if (value != null) {
			final StringBuilder result = new StringBuilder();
			result.append(!left ? value : "");

			if (value.length() < maximumLength) {
				for (int i = 0; i < (maximumLength - value.length()); i++) {
					result.append(fillCharacter);
				}
			}

			result.append(left ? value : "");

			return result.toString();
		}

		return null;
	}

	public static void main(String[] ar) {
		String value = "Hello, world!";
		char fillCharacter = '*';
		int maximumLength = 21;
		boolean left = true;

		System.out.println(fillString(value, fillCharacter, maximumLength, left));
	}
}