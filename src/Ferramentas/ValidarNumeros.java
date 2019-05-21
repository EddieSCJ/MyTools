package Ferramentas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ValidarNumeros {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int validarInteiro() {
		int num = 0;
		try {
			num = Integer.parseInt(br.readLine());
			while (num < 0) {
				System.out.print("Informe um número válido (n>=0): ");
				num = Integer.parseInt(br.readLine());
			}
			return num;
		} catch (Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Informe um número válido (n>=0): ");
					num = Integer.parseInt(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Erro: "+e);
					System.out.println();
					repete = true;
				}
			}
			return num;

		}

	}
	
	public static int validarInteiro(int num) {
		try {
			
			while (num < 0) {
				System.out.print("Informe um número válido (n>=0): ");
				num = Integer.parseInt(br.readLine());
			}
			return num;
		} catch (Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Informe um número válido (n>=0): ");
					num = Integer.parseInt(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Erro: "+e);
					System.out.println();
					repete = true;
				}
			}
			return num;

		}

	}

	public static double validarDouble() {
		double num = 0;

		try {
			num = Double.parseDouble(br.readLine());
			if (num < 0) {
				while (num < 0) {
					System.out.print("Informe um número válido (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
				}
				return num;
			} else {
				return num;
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Informe um número válido (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Erro: "+e);
					System.out.println();
					repete=true;
				}
			}
			return num;
		}

	}

	public static double validarDouble(double num) {
		try {
			if (num < 0) {
				while (num < 0) {
					System.out.print("Informe um número válido (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
				}
				return num;
			} else {
				return num;
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("Erro: "+e);
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Informe um número válido (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Erro: "+e);
					System.out.println();
					repete=true;
				}
			}
			return num;
		}

	}

}
