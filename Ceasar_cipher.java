import java.util.*;
public class Ceasar_cipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Plain text: ");
		String text = sc.nextLine();
		
		System.out.print("Enter number of shift: ");
		int shift = sc.nextInt();
		
		char[] chars = text.toCharArray();
		
		System.out.print("Ciphertext: ");
		for(char c : chars) {
			c += shift;
			System.out.print(c);
		}

	}

}
