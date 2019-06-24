package model;

import java.util.List;

public class Produto {
	private int codigo;
	private List<Pedido> pedidos;
	
	public Produto(int codigo, List<Pedido> pedidos) {
		this.codigo = codigo;
		this.pedidos = pedidos;
	}
}
