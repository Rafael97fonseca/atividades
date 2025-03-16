
public class Movimentacao {

	public Movimentacao() {
		private String descricao;
	    private double valor;
	    private boolean credito;

	    public Movimentacao(String descricao, double valor, boolean credito) {
	        this.descricao = descricao;
	        this.valor = valor;
	        this.credito = credito;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public boolean isCredito() {
	        return credito;
	    }

	    @Override
	    public String toString() {
	        return "Descrição: " + descricao + ", Valor: " + valor + (credito ? " (Crédito)" : " (Débito)");
	    }
	}

}
