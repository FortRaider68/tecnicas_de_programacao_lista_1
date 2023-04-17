
public class CalculoJurosCompostos {

	public static float jurosCompostos(float capitalInicial, float taxaDeJuros, int periodos) {
		return (float) (capitalInicial * Math.pow((1 + taxaDeJuros) , periodos));
	}	
	
	public static void main(String[] args) {
		float montante = jurosCompostos(1000.0f, 0.05f, 3);
		System.out.println(montante);
	}

}
