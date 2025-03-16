

public class ContaCorrente {

	public ContaCorrente() {
		 private int numero;
		    private double saldo;
		    private boolean especial;
		    private double limite;
		    private ArrayList<Movimentacao> movimentacoes;

		    public ContaCorrente(int numero, double saldo, boolean especial, double limite){
		        this.numero = numero; 
		        this.saldo = saldo;
		        this.especial = especial;
		        this.limite = limite;
		        this.movimentacoes = new ArrayList<>();
		    }

		    public int getNumero() {
		        return numero;
		    }

		    public double getSaldo() {
		        return saldo;
		    }

		    public boolean isEspecial() {
		        return especial;
		    }

		    public double getLimite() {
		        return limite;
		    }

		    public void adicionarMovimentacao(Movimentacao movimentacao) {
		        movimentacoes.add(movimentacao);
		    }

		    public void depositar(double valor) {
		        saldo += valor;
		    }

		    public boolean sacar(double valor) {
		        if (saldo - valor >= -limite) {
		            saldo -= valor;
		            return true;
		        }
		        return false;
		    }

		    public void emitirSaldo() {
		        System.out.println("Saldo: " + saldo);
		    }

		    public void emitirExtrato() {
		        for (Movimentacao movimentacao : movimentacoes) {
		            System.out.println(movimentacao);
		        }
		    }
	}

}
