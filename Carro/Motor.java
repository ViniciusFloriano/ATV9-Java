package Carro;

public class Motor {

	private String marca;
	private float potencia;
	private int cilindros;
	private String combustivel;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public float getPotencia() {
		return potencia;
	}
	
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	public int getCilindros() {
		return cilindros;
	}
	
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [marca=");
		builder.append(marca);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
