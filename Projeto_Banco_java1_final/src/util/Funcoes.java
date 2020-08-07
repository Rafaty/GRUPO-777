package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcoes {

	public static String formataData(Date data) {
		SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
		
		return formatado.format(data);

	}

}
