import java.util.Random;
import java.util.Scanner;

public class pigLatinTranslator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sexyPig = true; 
		Scanner scanner = new Scanner(System.in);

		// Welcome
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();
		
		while (sexyPig) {

		// Line to be translated
		System.out.println("Enter a word to be translated: ");
		String userLine = scanner.next();
		userLine = userLine.toLowerCase();
 
		String output = pigString(userLine);
				
		System.out.println(output);
		System.out.println();
		
		System.out.println("Translate another line? (Y/N):");
			String userWord = scanner.next();
		System.out.println();

			if (userWord.equalsIgnoreCase("Y"))
			{sexyPig = true;}

			if (userWord.equalsIgnoreCase("N"))
			{sexyPig = false;}
		}
	}
		
	public static String pigString(String trans){
	String output;
	String lower = trans;
			// If word begins with a vowel
			if (lower.startsWith("a") || lower.startsWith("e") || lower.startsWith("i") || lower.startsWith("o")
					|| lower.startsWith("u")) {
				output = lower + "way";
			}

			// If word begins with a consonant
			else {
				int i = 0;
				for (i = 0; i < lower.length(); i++)
					{
					if (lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' || lower.charAt(i) == 'o'
							|| lower.charAt(i) == 'e')
						break;
					}
				String after = lower.substring(i);
				String before = lower.substring(0, i);
				output = after + before + "ay";
			}
	return output;
	
	}
}
