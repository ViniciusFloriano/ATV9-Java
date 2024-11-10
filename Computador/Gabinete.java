package Computador;

public class Gabinete {

	private String modelo;
	private String tipo;
	private int baias;
	protected PlacaMae placaMae;
	
	public Gabinete() {
		placaMae = new PlacaMae();
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getBaias() {
		return baias;
	}
	
	public void setBaias(int baias) {
		this.baias = baias;
	}
	
	public PlacaMae getPlacaMae() {
		return placaMae;
	}
	
	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gabinete [modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", baias=");
		builder.append(baias);
		builder.append(", placaMae=");
		builder.append(placaMae);
		builder.append("]");
		return builder.toString();
	}
	
}
