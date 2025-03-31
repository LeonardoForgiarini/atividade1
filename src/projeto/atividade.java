package projeto;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class atividade {
	public static void contaTempo(int dia, int mes, int ano) {
		Calendar Hoje = new GregorianCalendar();
		Calendar Futuro = new GregorianCalendar(ano, mes - 1, dia);

		if (Futuro.before(Hoje)) {
			System.out.println("A data informada já passou.");
			return;
		}

		int diasFaltando = 0;
		while (Hoje.before(Futuro)) {
			Hoje.add(Calendar.DAY_OF_MONTH, 1);
			diasFaltando++;
		}

		System.out.println("Faltam " + diasFaltando + " dias para a data " + dia + "/" + mes + "/" + ano);
	}

	public static void main(String[] args) {
		contaTempo(21, 10, 2035); // Exemplo (meu aniversário de 30 anos)
	}
}
