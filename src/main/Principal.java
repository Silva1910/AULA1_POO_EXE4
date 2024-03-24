package main;

import model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		p.setNome("cura logica");
		p.setPreco(10);
		p.setQtdEstoque(10);
		
		if (p.verificarProdutoDisponivel("cura logica") == true) {
			System.out.println("produto disponivel");
		}else {
		System.out.println("produto não esta disponivel");
		
	}

}
}