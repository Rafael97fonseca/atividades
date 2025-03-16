package exercicio3;
import java.util.Scanner;
import java.util.arrays;
public class VerificarPermutacao {

public static boolean saoPermutacoes(int numero1, int numero2) {
        
        if (numero1 < 0 || numero2 < 0) {
            return false;
        }

        
        String strNumero1 = Integer.toString(numero1);
        String strNumero2 = Integer.toString(numero2);

        
        if (strNumero1.length() != strNumero2.length()) {
            return false;
        }

        
        char[] charArray1 = strNumero1.toCharArray();
        char[] charArray2 = strNumero2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

       
        return Arrays.equals(charArray1, charArray2);
    }
}
	
public VerificarPermutacao(){
		public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o primeiro número positivo: ");
	        int numero1 = scanner.nextInt();
	        System.out.print("Digite o segundo número positivo: ");
	        int numero2 = scanner.nextInt();
	        scanner.close();

	        
	        if (saoPermutacoes(numero1, numero2)) {
	            System.out.println(numero1 + " e " + numero2 + " são permutações um do outro.");
	        } else {
	            System.out.println(numero1 + " e " + numero2 + " não são permutações um do outro.");
	        }
	}

}
	
	



