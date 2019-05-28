package Ferramentas;

import java.util.ArrayList;
import java.util.Iterator;

public class Algorithms {

	public static void quickSortInt(ArrayList<Integer> arrayList, int iniVet, int fimVet) {
		int i = iniVet;
		int j = fimVet - 1;
		int chave = arrayList.get((iniVet + fimVet) / 2);

		while (i <= j) {
			while (arrayList.get(i) < chave) {
				i++;
			}
			while (arrayList.get(j) > chave) {
				j--;
			}
			if (i <= j) {
				int aux = arrayList.get(i);
				arrayList.set(i,arrayList.get(j));
				arrayList.set(j, aux);
				i++;
				j--;
			}
		}
		if (i < fimVet) {
			quickSortInt(arrayList, i, fimVet);
		}
		if (j > iniVet) {
			quickSortInt(arrayList, iniVet, j + 1);
		}
	}
	
	public static void quickSortDouble(ArrayList<Double> arrayList, int iniVet, int fimVet) {
		int i = iniVet;
		int j = fimVet - 1;
		double chave = arrayList.get((iniVet + fimVet) / 2);

		while (i <= j) {
			while (arrayList.get(i) < chave) {
				i++;
			}
			while (arrayList.get(j) > chave) {
				j--;
			}
			if (i <= j) {
				double aux = arrayList.get(i);
				arrayList.set(i,arrayList.get(j));
				arrayList.set(j, aux);
				i++;
				j--;
			}
		}
		if (i < fimVet) {
			quickSortDouble(arrayList, i, fimVet);
		}
		if (j > iniVet) {
			quickSortDouble(arrayList, iniVet, j + 1);
		}
	}

	public static void quickSortString(ArrayList<String> arrayList, int iniVet, int fimVet) {
		
		int i = iniVet;
		int j = fimVet - 1;
		String chave = arrayList.get((iniVet + fimVet) / 2);

		while (i <= j) {
			while (arrayList.get(i).compareToIgnoreCase(chave)<0) {
				i++;
			}
			while (arrayList.get(j).compareToIgnoreCase(chave)>0) {
				j--;
			}
			if (i <= j) {
				String aux = arrayList.get(i);
				arrayList.set(i,arrayList.get(j));
				arrayList.set(j, aux);
				i++;
				j--;
			}
		}
		if (i < fimVet) {
			quickSortString(arrayList, i, fimVet);
		}
		if (j > iniVet) {
			quickSortString(arrayList, iniVet, j + 1);
		}
	}

	public static void quickSortChar(ArrayList<Character> arrayList, int iniVet, int fimVet) {
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.set(i, arrayList.get(i).toUpperCase(arrayList.get(i)));
		}
		
		
		int i = iniVet;
		int j = fimVet - 1;
		char chave = arrayList.get((iniVet + fimVet) / 2);

		while (i <= j) {
			while (arrayList.get(i)<chave) {
				i++;
			}
			while (arrayList.get(j)>chave) {
				j--;
			}
			if (i <= j) {
				char aux = arrayList.get(i);
				arrayList.set(i,arrayList.get(j));
				arrayList.set(j, aux);
				i++;
				j--;
			}
		}
		if (i < fimVet) {
			quickSortChar(arrayList, i, fimVet);
		}
		if (j > iniVet) {
			quickSortChar(arrayList, iniVet, j + 1);
		}
	}
	
	public static int[] MMInt (ArrayList<Integer> arrayList){
			int maior=0;
			int menor =0;
			for (int i = 0; i < arrayList.size(); i++) {
				if(arrayList.get(i) > arrayList.get(maior)) {
					maior = i;
				}
				if(arrayList.get(i) < arrayList.get(menor)) {
					menor = i;
				}
			}
			int v[]= {arrayList.get(menor), arrayList.get(maior)};
			
			return v;
			
		
	}
	
	public static double[] MMDouble (ArrayList<Double> arrayList){
		int maior=0;
		int menor =0;
		for (int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i) > arrayList.get(maior)) {
				maior = i;
			}
			if(arrayList.get(i) < arrayList.get(menor)) {
				menor = i;
			}
		}
		double v[]= {arrayList.get(menor), arrayList.get(maior)};
		
		return v;
		
	
}
	
	public static String[] MMString (ArrayList<String> arrayList){
		
		int maior=0;
		int menor =0;
		for (int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).compareToIgnoreCase(arrayList.get(maior))>0) {
				maior = i;
			}
			if(arrayList.get(i).compareToIgnoreCase(arrayList.get(menor))<0) {
				menor = i;
			}
		}
		String v[]= {arrayList.get(menor), arrayList.get(maior)};
		
		return v;
	
}
	
	public static char[] MMChar (ArrayList<Character> arrayList){
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.set(i, arrayList.get(i).toUpperCase(arrayList.get(i)));
		}
		int maior=0;
		int menor =0;
		for (int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i) > arrayList.get(maior)) {
				maior = i;
			}
			if(arrayList.get(i)<arrayList.get(menor)) {
				menor = i;
			}
		}
		char v[]= {arrayList.get(menor), arrayList.get(maior)};
		
		return v;
		
	
}


}
