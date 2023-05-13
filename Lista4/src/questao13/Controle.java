package questao13;

public class Controle extends TV {
	
	public void diminuirVolume() {
		if(volume > 0)
			volume--;
	}
	
	public void aumentarVolume() {
		if(volume < 100)
			volume++;
	}
	
	public void power() {
		ligada = !ligada;
	}
	
	public void canalUp(){
		if(canal < 32) {
			canal++;
		}
	}
	
	public void canalDown(){
		if(canal < 0) {
			canal--;
		}
	}
	
	public void mute() {
		mute = !mute;
	}
	
}
