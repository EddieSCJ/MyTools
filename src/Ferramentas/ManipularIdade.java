package Ferramentas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManipularIdade {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formata as datas no padr�o desejado

	public static String Hoje() {
		Date hoje = new Date();
		String Hoje = sdf.format(hoje);
		return Hoje;
	}

	public static long Idade(String dataDeNascimento) {
		Date Hoje; // Vai receber a data atual
		Date calcDataDeNascimento; // Variavel de calculo da data de nascimento
		long idade;

		try {
			if(Integer.parseInt(dataDeNascimento.substring(0,2))<=31 && Integer.parseInt(dataDeNascimento.substring(0,2))>=1 &&
			Integer.parseInt(dataDeNascimento.substring(3,5))<=12 && Integer.parseInt(dataDeNascimento.substring(3,5))>=1) {
	
			Hoje = sdf.parse(Hoje()); // Hoje recebe a String resultante da fun��o e o parse converte para Date
			calcDataDeNascimento = sdf.parse(dataDeNascimento);
			idade = (Hoje.getTime() - calcDataDeNascimento.getTime()) / 84600000 / 365; // calcula a idade em anos

			}else {
				return -1;
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			idade =-1;
		}
		return idade;
	}

	public static long Idade(String dataDeNascimento, String dataAtual) {
		Date Hoje; // Vai receber a data atual
		Date calcDataDeNascimento; // Variavel de calculo da data de nascimento
		long idade;

		try {
			if(Integer.parseInt(dataDeNascimento.substring(0,2))<=31 && Integer.parseInt(dataDeNascimento.substring(0,2))>=1 &&
			Integer.parseInt(dataDeNascimento.substring(3,5))<=12 && Integer.parseInt(dataDeNascimento.substring(3,5))>=1) {
	
			Hoje = sdf.parse(dataAtual); // Hoje recebe a String resultante da fun��o e o parse converte para Date
			calcDataDeNascimento = sdf.parse(dataDeNascimento);
			idade = (Hoje.getTime() - calcDataDeNascimento.getTime()) / 84600000 / 365; // calcula a idade em anos

			}else {
				return -1;
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			idade =-1;
		}
		return idade;
	}
	
	
	public static boolean validarIdade(String dataDeNascimento) {
		long idade; // Idade a ser validade
		try {
			idade = Idade(dataDeNascimento); // inicia-se a idade
			if(idade>=0) { // se for valida returna true
				return true;
			} else { // senao retorna false
				return false;
			}
		}catch(Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			return false;
		}
	}

	public static boolean validarDataDeNascimento(String dataDeNascimento) {
		Date calcDataDeNascimento; // Data a ser comparada (Nascimento)
		Date Hoje; // Data atual a ser comparada
		
		try{
			if(Integer.parseInt(dataDeNascimento.substring(0,2))>31 || Integer.parseInt(dataDeNascimento.substring(0,2))<1) {
				return false;
			}
			if(Integer.parseInt(dataDeNascimento.substring(3,5))>12 || Integer.parseInt(dataDeNascimento.substring(3,5))<1) {
				return false;
			}
			Hoje = sdf.parse(Hoje()); // Transformando em date
			calcDataDeNascimento = sdf.parse(dataDeNascimento);  // Transformando em date
			
				if(Hoje.getTime()>=calcDataDeNascimento.getTime()) { // verifica se a data � anterior ou igual a atual
					return true; // retorna true se for
				} else { // caso contrario retorna false
					return false;
				}
		}catch (Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			return false;
		}
		
	}
	
	public static String mostrarIdade(String dataDeNascimento) {
		return "Idade: "+Idade(dataDeNascimento);
	}
	
	public static String mostrarDataDeNascimento(String dataDeNascimento) {
		return "Data de Nascimento: "+dataDeNascimento;
	}
	
	public static String mostrarDataAtual() {
		return "Data atual: "+Hoje();
	}

}
