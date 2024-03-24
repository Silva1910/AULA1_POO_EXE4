package model;

public class Produto {

	private String nome;
	private float preco;
	private int qtdEstoque;

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if (preco <= 0) {
			System.out.println("o preço não ser zero e nem menor que zero");
		} else {
			this.preco = preco;
		}

	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < getQtdEstoque() || qtdEstoque <=0 ) {
			System.out.println("a quantidade de estoque não pode ser negativa ou igual a zero");
		} else {
			this.qtdEstoque = qtdEstoque;
		}
	}

	public boolean verificarProdutoDisponivel(String nome) {
		if (getQtdEstoque() > 0) {
			return true;
		}
		return false;
	}

	public double totalValorEstoque() {
		double x = getQtdEstoque() * getPreco();
		return x;
	}

}
