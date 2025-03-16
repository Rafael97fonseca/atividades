package prova2;

public abstract class Produto {

	public Produto() {
		protected String nome;
	    protected int categoria;
	    protected String descricao;
	    protected double preco;

	    public Produto(String nome, int categoria, String descricao, double preco) {
	        this.nome = nome;
	        this.categoria = categoria;
	        this.descricao = descricao;
	        this.preco = preco;
	}

}

	public abstract void mostrarProduto();

    public String getNome() {
        return nome;
    }
}


class Sapato extends Produto {
    private String tamanho;

    public Sapato(String nome, String descricao, double preco, String tamanho) {
        super(nome, Categorias.SAPATO, descricao, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: SAPATO");
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Tamanho: " + tamanho);
    }
}

class RoupaMasculina extends Produto {
    private String tamanho;

    public RoupaMasculina(String nome, String descricao, double preco, String tamanho) {
        super(nome, Categorias.ROUPA_MASCULINA, descricao, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: ROUPA MASCULINA");
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Tamanho: " + tamanho);
    }
}

class RoupaFeminina extends Produto {
    private String tamanho;

    public RoupaFeminina(String nome, String descricao, double preco, String tamanho) {
        super(nome, Categorias.ROUPA_FEMININA, descricao, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: ROUPA FEMININA");
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Tamanho: " + tamanho);
    }
}
	
