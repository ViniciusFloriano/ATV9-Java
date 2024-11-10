package HomeTheater;

public class EquipamentoEletronico {

	private float tensao = 1;
	private float consumo = 2;
	
	public float getTensao() {
		return tensao;
	}
	
	public void setTensao(float tensao) {
		if (tensao > 0){
			this.tensao = tensao;
		}
	}
	
	public float getConsumo() {
		return consumo;
	}
	
	public void setConsumo(float consumo) {
		if (consumo > 0) {
			this.consumo = consumo;			
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico [tensao=");
		builder.append(tensao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
