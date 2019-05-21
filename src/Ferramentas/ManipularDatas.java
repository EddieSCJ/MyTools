package Ferramentas;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManipularDatas {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static Calendar cal = Calendar.getInstance();

	/**
	 * @author Edcleidson 
	 * 
	 * Estrutura padrao
	 * 
	 *         String dataModificada; // Data que vai ser retornada na funcao Date
	 *         date = sdf.parse(data); // Transformando a string recebida numa date
	 *         e formatando ela com o padrao cal.setTime(date) //Adicionado a date para ser manipulada pela calendar
	 *         cal.add(Calendar.DAY/MONTH/YEAR/HOUR/MINUTE/SECOND) //Manipulando o cal
	 *         calendar date = cal.getTime(); // Atribuindo o que foi alterado para date
	 *         date dataModificada = sdf.format(date) //Transformando a date numa string
	 * 
	 *         return dataModificada // retornando a nova data
	 */

	public static String iniciarData() {
		String data;
		Date date = new Date();
		data = sdf.format(date);
		return data;
	}

	public static String adicionarAno(String data, int anos) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.YEAR, anos);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar ano(s): " + e);
			return data;
		}
	}
	
	public static String removerAno(String data, int anos) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.YEAR, -anos);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover ano(s): " + e);
			return data;
		}
	}

	public static String adicionarSemanaNoAno(String data, int semanas) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.WEEK_OF_YEAR, semanas);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar semana(s): " + e);
			return data;
		}
	}

	public static String removerSemanaNoAno(String data, int semanas) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.WEEK_OF_YEAR, -semanas);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar semana(s): " + e);
			return data;
		}
	}

	public static String adicionarSemanaNoMes(String data, int semanas) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.WEEK_OF_MONTH, semanas);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar semana(s): " + e);
			return data;
		}
	}

	public static String removerSemanaNoMes(String data, int semanas) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.WEEK_OF_MONTH, -semanas);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover semana(s): " + e);
			return data;
		}
	}

	public static String adicionarMes(String data, int meses) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.MONTH, meses);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar mês/meses: " + e);
			return data;
		}
	}

	public static String removerMes(String data, int meses) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.MONTH, -meses);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover mês/meses: " + e);
			return data;
		}
	}

	public static String adicionarDiaNoMes(String data, int diasAdicionados) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.DAY_OF_MONTH, diasAdicionados);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar dia(s): " + e);
			return data;
		}
	}

	public static String removerDiaDoMes(String data, int diasRemovidos) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.DAY_OF_MONTH, -diasRemovidos);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover dia(s): " + e);
			return data;
		}
	}

	public static String adicionarDiaNaSemana(String data, int diasAdicionados) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.DAY_OF_WEEK, diasAdicionados);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar dia(s): " + e);
			return data;
		}

	}

	public static String removerDiaDaSemana(String data, int diasRemovidos) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.DAY_OF_WEEK, -diasRemovidos);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover dia(s): " + e);
			return data;
		}
	}

	public static String adicionarDiaNoAno(String data, int diasAdicionados) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.DAY_OF_YEAR, diasAdicionados);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar dia(s): " + e);
			return data;
		}
	}

	public static String removerDiaDoAno(String data, int diasRemovidos) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.DAY_OF_YEAR, -diasRemovidos);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover dia(s): " + e);
			return data;
		}
	}

	public static String adicionarHoras(String data, int horas) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.HOUR, horas);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar hora(s): " + e);
			return data;
		}
	}

	public static String removerHoras(String data, int horas) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.HOUR, -horas);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover hora(s): " + e);
			return data;
		}
	}

	public static String adicionarMin(String data, int min) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.MINUTE, min);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar minuto(s): " + e);
			return data;
		}
	}

	public static String removerMin(String data, int min) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.MINUTE, -min);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover minuto(s): " + e);
			return data;
		}
	}

	public static String adicionarSegundo(String data, int segundo) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.SECOND, segundo);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao adicionar segundo(s): " + e);
			return data;
		}
	}

	public static String removerSegundo(String data, int segundo) {
		try {
			String dataModificada;
			Date date = sdf.parse(data);

			cal.setTime(date);
			cal.add(Calendar.SECOND, -segundo);
			date = cal.getTime();

			dataModificada = sdf.format(date);
			return dataModificada;

		} catch (Exception e) {
			System.out.println("Erro ao remover segundo(s): " + e);
			return data;
		}
	}

}
