package Jogo.model;

public class Jogador {

	public String nome;
	public String cpf;

	public Jogador(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String jogar(Jogadas jogada) {
		if (jogada == jogada.PAPEL) {
			return "PAPEL";
		} else if (jogada == jogada.PEDRA) {
			return "PEDRA";
		} else if (jogada == jogada.TESOURA) {
			return "TESOURA";
		}

		return null;
	}
}
