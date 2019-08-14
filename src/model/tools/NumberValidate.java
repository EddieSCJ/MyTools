package model.tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberValidate {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int validatingInteger() {
		int num = 0;
		try {
			num = Integer.parseInt(br.readLine());
			while (num < 0) {
				System.out.print("Enter a valid number (n>=0): ");
				num = Integer.parseInt(br.readLine());
			}
			return num;
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: "+e.getMessage());
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Enter a valid number (n>=0): ");
					num = Integer.parseInt(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Error: "+e.getMessage());
					System.out.println();
					repete = true;
				}
			}
			return num;

		}

	}
	
	public static int validatingInteger(int num) {
		try {
			
			while (num < 0) {
				System.out.print("Enter a valid number (n>=0): ");
				num = Integer.parseInt(br.readLine());
			}
			return num;
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: "+e.getMessage());
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Enter a valid number (n>=0): ");
					num = Integer.parseInt(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Error: "+e.getMessage());
					System.out.println();
					repete = true;
				}
			}
			return num;

		}

	}

	public static double validatingDouble() {
		double num = 0;

		try {
			num = Double.parseDouble(br.readLine());
			if (num < 0) {
				while (num < 0) {
					System.out.print("Enter a valid number (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
				}
				return num;
			} else {
				return num;
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: "+e.getMessage());
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Enter a valid number (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Error: "+e.getMessage());
					System.out.println();
					repete=true;
				}
			}
			return num;
		}

	}

	public static double validatingDouble(double num) {
		try {
			if (num < 0) {
				while (num < 0) {
					System.out.print("Enter a valid number (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
				}
				return num;
			} else {
				return num;
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error: "+e.getMessage());
			System.out.println();
			boolean repete = true;
			while (repete) {
				try {
					System.out.print("Enter a valid number (n>=0.0): ");
					num = Double.parseDouble(br.readLine());
					if (num >= 0) {
						repete = false;
					} else {
						repete = true;
					}
				} catch (Exception ex) {
					System.out.println();
					System.out.println("Error: "+e.getMessage());
					System.out.println();
					repete=true;
				}
			}
			return num;
		}

	}


}
