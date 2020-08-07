package controles;

import java.util.Scanner;

public class ControleLogin {

	public static void solicitaLogin() {

		Scanner leitor = new Scanner(System.in);

		System.out.print("|Entre com o seu cpf: ");
		String cpf = leitor.nextLine();

		ControlePrincipal.imprimiLinhaPontilhada();
		System.out.print("|Entre com a sua senha: ");
		String senha = leitor.nextLine();

		leitor.close();

	}
}
