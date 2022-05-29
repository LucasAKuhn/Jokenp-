package Jogo;

public class Play {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador("Player 1 K", "028.279.100-04");	
		Jogador j2 = new Jogador("Player 2", "000.222.333-05");
		
		String play1 = j1.jogar(Jogadas.PAPEL);
		String play2 = j2.jogar(Jogadas.PAPEL);
		
		if(play1 == "PEDRA" && play2 == "PAPEL" ) {
			System.out.println("O vencedor é " + j2.nome);
		} else if(play1 == "PEDRA" && play2 == "PEDRA") {
			System.out.println("Empate");
			
		} else if(play1 == "PEDRA" && play2 == "TESOURA") {
			System.out.println("O vencedor é " + j1.nome);
			
		} else if(play1 == "PAPEL" && play2 == "PAPEL") {
			System.out.println("Empate");
			
		} else if(play1 == "PAPEL" && play2 == "PEDRA") {
			System.out.println("O vencedor é " + j1.nome);
		
		}else if(play1 == "PAPEL" && play2 == "TESOURA") {
			System.out.println("O vencedor é " + j2.nome);
		
		}else if(play1 == "TESOURA" && play2 == "TESOURA") {
			System.out.println("Empate");
		
		}else if(play1 == "TESOURA" && play2 == "PAPEL") {
			System.out.println("O vencedor é " + j1.nome);
			
		}else if(play1 == "TESOURA" && play2 == "PEDRA") {
			System.out.println("O vencedor é " + j2.nome);
		}else {
			System.out.println("Valores não encontrados");
		}	
		
	}
	
}
