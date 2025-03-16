package exercicio7;

import java.util.Scanner;

public class InverterString {

	public InverterString() {
		public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite uma string: ");
	        String input = scanner.nextLine();

	        
	        scanner.close();

	        
	        String invertedString = inverterString(input);

	        
	        System.out.println("String invertida: " + invertedString);
	    }

	    
	    public static String inverterString(String input) {
	        StringBuilder inverted = new StringBuilder();
	        for (int i = input.length() - 1; i >= 0; i--) {
	            inverted.append(input.charAt(i));
	        }
	        return inverted.toString();
	    }
	}

}
