	package classes;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String cor;
	
	public Veiculo(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	@Override
	public String toString() {
		return getMarca()+": "+getModelo()+" "+getCor();
	}
}
