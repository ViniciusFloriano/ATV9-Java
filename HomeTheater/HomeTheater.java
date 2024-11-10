package HomeTheater;

public class HomeTheater {

	protected SistemaDeSom som;
	protected SistemaDeVideo video;
	
	public HomeTheater() {
		som = new SistemaDeSom();
		video = new SistemaDeVideo();
	}
	
	public SistemaDeSom getSom() {
		return som;
	}
	
	public void setSom(SistemaDeSom som) {
		this.som = som;
	}
	
	public SistemaDeVideo getVideo() {
		return video;
	}
	
	public void setVideo(SistemaDeVideo video) {
		this.video = video;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeTheater [som=");
		builder.append(som);
		builder.append(", video=");
		builder.append(video);
		builder.append("]");
		return builder.toString();
	}
	
}
