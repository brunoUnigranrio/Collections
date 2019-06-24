package control;

import java.util.List;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Programa {

	public static void main(String[] args) {
		Produto produto = new Produto(0, null);
		Pedido pedido = new Pedido(0,null);
		Pedido pedido2 = new Pedido(1,null);
		List<Pedido> pedidosdeProdutos = null;
		pedidosdeProdutos.add(pedido);
		pedidosdeProdutos.add(pedido2);
		
		Produto produto2 = new Produto(3,pedidosdeProdutos);
		
		ItemPedido itemPedido = new ItemPedido(12,pedido, produto);

	}

}
