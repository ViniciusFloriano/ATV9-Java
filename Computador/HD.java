package Computador;

public class HD {

	private String marca;
	private String modelo;
	private float capacidade;
	private int rpm;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	
	public int getRpm() {
		return rpm;
	}
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HD [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", rpm=");
		builder.append(rpm);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
