package model;

import java.util.List;

public class Pedido {
	private int codigo;
	private List<Produto> produtos;
	
	public Pedido(int codigo,List<Produto> produtos){
		this.codigo= codigo;
		this.produtos= produtos;
	}
}
