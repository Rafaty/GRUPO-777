package main;

import java.util.Scanner;

import controles.ControlePrincipal;
import visual.TelaLogin;

public class SistemaInterno {

	public static void main(String[] args) {

		ControlePrincipal.imprimeCabecalho();
		ControlePrincipal.perguntaLogin();

		Scanner scan = new Scanner(System.in);

		int escolha = scan.nextInt();

		if (escolha == 1) {
			TelaLogin.main(args);
		}

		ControlePrincipal.imprimeRodape();

		scan.close();

	}

}
