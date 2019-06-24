package model;

import java.util.List;

public class ItemPedido {
	private int codigo;
	private Pedido pedido;
	private Produto produto;
	
	public ItemPedido(int codigo,Pedido pedido,Produto produto) {
		this.codigo = codigo;
		this.pedido = pedido;
		this.produto = produto;
	}
	
}
