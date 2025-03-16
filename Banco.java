import java.util.ArrayList;

public class Banco {

	public Banco() {
		private ArrayList<ContaCorrente> contas;

	    public Banco() {
	        contas = new ArrayList<>();
	    }

	    public void criarConta(int numero, double saldo, boolean especial, double limite) {
	        ContaCorrente novaConta = new ContaCorrente(numero, saldo, especial, limite);
	        contas.add(novaConta);
	    }

	    public void excluirConta(int numero) {
	        ContaCorrente conta = encontrarConta(numero);
	        if (conta != null) {
	            contas.remove(conta);
	        }
	    }

	    public boolean realizarTransferencia(int numeroOrigem, int numeroDestino, double valor) {
	        ContaCorrente origem = encontrarConta(numeroOrigem);
	        ContaCorrente destino = encontrarConta(numeroDestino);

	        if (origem != null && destino != null) {
	            if (origem.sacar(valor)) {
	                destino.depositar(valor);
	                return true;
	            }
	        }

	        return false;
	    }

	    private ContaCorrente encontrarConta(int numero) {
	        for (ContaCorrente conta : contas) {
	            if (conta.getNumero() == numero) {
	                return conta;
	            }
	        }
	        return null;
	    }
	}

}
