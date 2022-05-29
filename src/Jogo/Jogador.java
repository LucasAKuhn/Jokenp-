package Jogo;

public class Jogador {
	
	String nome;
	String cpf;
	
	Jogador(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	String jogar(Jogadas jogada) {
		if(jogada == jogada.PAPEL) {
			return "PAPEL";
		} else if(jogada == jogada.PEDRA ) {
			return "PEDRA";
		} else if(jogada == jogada.TESOURA ) {
			return "TESOURA";
		}
		
		return null;
	}
}
