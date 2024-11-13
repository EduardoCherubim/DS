package model;

public class Pedido {

	private int idPedido;
	private String ProdutoPedido;
	private int qtdeProduto;
	private String clientePedido;
	private int dataPedido;
	private int dataEntrega;
	private double valorEntrega;
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getProdutoPedido() {
		return ProdutoPedido;
	}
	public void setProdutoPedido(String produtoPedido) {
		ProdutoPedido = produtoPedido;
	}
	public int getQtdeProduto() {
		return qtdeProduto;
	}
	public void setQtdeProduto(int qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}
	public String getClientePedido() {
		return clientePedido;
	}
	public void setClientePedido(String clientePedido) {
		this.clientePedido = clientePedido;
	}
	public int getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(int dataPedido) {
		this.dataPedido = dataPedido;
	}
	public int getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(int dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public double getValorEntrega() {
		return valorEntrega;
	}
	public void setValorEntrega(double valorEntrega) {
		this.valorEntrega = valorEntrega;
	}
	
}