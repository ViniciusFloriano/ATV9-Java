package HomeTheater;

public class EquipamentoEletronicoMain {
	public static void main(String[] args) {
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(100);
		ee.setTensao(220);
		System.out.println(ee);
		
		SistemaDeSom ss = new SistemaDeSom();
		ss.setConsumo(100);
		ss.setTensao(220);
		ss.setMarca("Sony");
		ss.setModelo("52");
		ss.setPotencia(2000);
		System.out.println(ss);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setConsumo(100);
		sv.setTensao(220);
		sv.setMarca("LG");
		sv.setModelo("LG 578");
		sv.setTipo("Amoled");
		sv.setResolucao("4K Ultrawide");
		System.out.println(sv);
		
		HomeTheater ht = new HomeTheater();
		ht.som.setConsumo(100);
		ht.som.setTensao(220);
		ht.som.setMarca("Sony");
		ht.som.setModelo("52");
		ht.som.setPotencia(2000);
		
		ht.video.setConsumo(100);
		ht.video.setTensao(220);
		ht.video.setMarca("LG");
		ht.video.setModelo("LG 578");
		ht.video.setTipo("Amoled");
		ht.video.setResolucao("4K Ultrawide");
		
		System.out.println(ht);
	}
}
