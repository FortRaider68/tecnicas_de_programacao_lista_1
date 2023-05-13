package questao13;

public abstract class TV {
	protected int canal;
	protected int volume;
	protected boolean ligada;
	protected boolean mute;
	
	public TV(){
		canal = 32;
		volume = 60;
		ligada = false;
		mute = false;
	}
	
	public boolean estaLigada() {
		return ligada;
	}

	public int getCanal() {
		return canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
	
}
