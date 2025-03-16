package exercicio8;

public class CriptografiaCesar {

	public CriptografiaCesar() {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("Digite a mensagem a ser criptografada: ");
	        String mensagem = scanner.nextLine();
	        
	        
	        System.out.print("Digite o valor de K (inteiro positivo): ");
	        int k = scanner.nextInt();
	        
	        
	        if (k <= 0) {
	            System.out.println("O valor de K deve ser um inteiro positivo.");
	            return;
	        }
	        
	        
	        String mensagemCriptografada = criptografarCesar(mensagem, k);
	        System.out.println("Mensagem criptografada: " + mensagemCriptografada);
	        
	        scanner.close();
	    }
		
		public static String criptografarCesar(String mensagem, int k) {
	        StringBuilder resultado = new StringBuilder();
	        
	        
	        mensagem = mensagem.toUpperCase().replaceAll(" ", "");
	        
	        for (int i = 0; i < mensagem.length(); i++) {
	            char caractere = mensagem.charAt(i);
	            
	            if (caractere >= 'A' && caractere <= 'Z') {
	                
	                char novoCaractere = (char) (((caractere - 'A' + k) % 26) + 'A');
	                resultado.append(novoCaractere);
	            } else {
	                
	                resultado.append(caractere);
	            }
	        }
	        
	        return resultado.toString();
	    }
	}
	
}
