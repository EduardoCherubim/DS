package prjCarro;

public class Carro {
	private String modelo;
	private String fabricante;
	private int anoFabricacao;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}
}
