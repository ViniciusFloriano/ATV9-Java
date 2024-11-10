package HomeTheater;

public class SistemaDeVideo extends EquipamentoEletronico{

	private String marca = "LG";
	private String modelo = "LG 5000";
	private String tipo = "LED";
	private String resolucao = "4K";
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		if (marca.length() > 0){
			this.marca = marca;			
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		if (modelo.length() > 0) {
			this.modelo = modelo;			
		}
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		if (tipo.length()> 0 ) {
			this.tipo = tipo;			
		}
	}
	
	public String getResolucao() {
		return resolucao;
	}
	
	public void setResolucao(String resolucao) {
		if (resolucao.length() > 0) {
			this.resolucao = resolucao;			
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", resolucao=");
		builder.append(resolucao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
