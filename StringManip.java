import java.util.Scanner;
public class StringManip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String text = "";
		String firstWord = "";
		String otherWords = "";
		StringBuffer outText = new StringBuffer();
		
		System.out.print("Enter some text: ");
		text = keyboard.nextLine();
		
		
		firstWord = text.substring(0, text.indexOf(' '));
		otherWords = text.substring(text.indexOf(' '), text.length());
		otherWords = otherWords.trim();
		otherWords = otherWords.replace(otherWords.charAt(0), Character.toUpperCase(otherWords.charAt(0)));
		outText.append(otherWords + " " + firstWord);
		
		
		System.out.print(outText);
		
		
		
		
	}

}
