package jogadores;

import jogo.Coordenadas;

public interface Jogador {
	public Coordenadas avancar(int celulas);
	public Coordenadas retroceder(int celulas);
}
