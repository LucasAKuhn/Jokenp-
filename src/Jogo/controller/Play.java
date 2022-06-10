package Jogo.controller;

import java.util.Scanner;

import Jogo.exception.ErroDigitacao;
import Jogo.model.Jogadas;
import Jogo.model.Jogador;

public class Play {

	public static void main(String[] args) {
		System.out.println("Ola player 1. Digite seu nome:");
		Scanner nome1 = new Scanner(System.in);
		String name1 = nome1.nextLine();

		System.out.println("Digite seu CPF sem pontuação:");
		Scanner cpf1 = new Scanner(System.in);
		String CPF1 = cpf1.nextLine();

		Jogador j1 = new Jogador(name1, CPF1);

		// System.out.println(j1.nome);
		if (ValidarCPF.isCPF(CPF1) == true)
			System.out.printf("%s\n", "Player1: " + j1.nome, ValidarCPF.imprimeCPF(CPF1));
		else
			try {
				geraErroCPF();
			} catch (ErroDigitacao e) {
				System.out.println(e.getMessage());
			}

		System.out.println("Ola player 2. Digite seu nome:");
		Scanner nome2 = new Scanner(System.in);
		String name2 = nome2.nextLine();

		System.out.println("Digite seu CPF sem pontuação:");
		Scanner cpf2 = new Scanner(System.in);
		String CPF2 = cpf2.nextLine();

		Jogador j2 = new Jogador(name2, CPF2);

		if (ValidarCPF.isCPF(CPF2) == true)
			System.out.printf("%s\n", "Player2: " + j2.nome, ValidarCPF.imprimeCPF(CPF2));
		else
			try {
				geraErroCPF();
			} catch (ErroDigitacao e) {
				System.out.println(e.getMessage());
			}

		System.out.print("Jogadores, bem-vindo ao jogo Jokenpô!" + "\nDigite 1, 2 ou 3, e escolha sua jogada:"
				+ "\n1 = Pedra" + "\n2 = Papel" + "\n3 = Tesoura \n");

		System.out.println("Jogador 1:");

		Scanner entrada = new Scanner(System.in);

		String play1 = null;
		String play2 = null;
//
		switch (entrada.nextInt()) {
//		case 1:
//			play1 = j1.jogar(Jogadas.PEDRA);
//			break;
//		case 2:
//			play1 = j1.jogar(Jogadas.PAPEL);
//			break;
//		case 3:
//			play1 = j1.jogar(Jogadas.TESOURA);
//			break;
//		default:
//			try {
//				geraErro1();
//			} catch (ErroDigitacao e) {
//				System.out.println(e.getMessage());
//			}
		}

		System.out.println("Jogador 2:");

		switch (entrada.nextInt()) {
		case 1:
			play2 = j2.jogar(Jogadas.PEDRA);
			break;
		case 2:
			play2 = j2.jogar(Jogadas.PAPEL);
			break;
		case 3:
			play2 = j2.jogar(Jogadas.TESOURA);
			break;
		default:
			try {
				geraErro1();
			} catch (ErroDigitacao e) {
				System.out.println(e.getMessage());
			}
		}

		if (play1 == "PEDRA" && play2 == "PAPEL") {
			System.out.println("O vencedor é " + j2.nome);
		} else if (play1 == "PEDRA" && play2 == "PEDRA") {
			System.out.println("Empate");

		} else if (play1 == "PEDRA" && play2 == "TESOURA") {
			System.out.println("O vencedor é " + j1.nome);

		} else if (play1 == "PAPEL" && play2 == "PAPEL") {
			System.out.println("Empate");

		} else if (play1 == "PAPEL" && play2 == "PEDRA") {
			System.out.println("O vencedor é " + j1.nome);

		} else if (play1 == "PAPEL" && play2 == "TESOURA") {
			System.out.println("O vencedor é " + j2.nome);

		} else if (play1 == "TESOURA" && play2 == "TESOURA") {
			System.out.println("Empate");

		} else if (play1 == "TESOURA" && play2 == "PAPEL") {
			System.out.println("O vencedor é " + j1.nome);

		} else if (play1 == "TESOURA" && play2 == "PEDRA") {
			System.out.println("O vencedor é " + j2.nome);
		} else {
			System.out.println("Valores não encontrados");
		}
		entrada.close();
	}

	static void geraErro1() {
		throw new RuntimeException("Valor não corresponde a nenhuma jogada. Favor, digite '1, 2 ou 3'! ");
	}

	static void geraErroCPF() {
		throw new RuntimeException("CPF não corresponde a um CPF verdadeiro ");
	}

}
