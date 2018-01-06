package org.ottolini.java8.study.methodReference;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {
	
	public static void referenciarMetodoStatic() {
		System.out.println("Método Referido static");
	}
	
	public void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] nomes = {"MitoCode", "Mito", "Code"};
		
		//With anonymous class
//		Arrays.sort(nomes, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareToIgnoreCase(s2);
//			}	
//		});
		
	
		//With lambda expression
		//Arrays.sort(nomes, (s1, s2) -> s1.compareToIgnoreCase(s2));
		
		//With method reference
		Arrays.sort(nomes,String::compareToIgnoreCase);
		
		
		System.out.println(Arrays.toString(nomes));
	}
	
	public void referenciarMetodoInstanciaObjetoParticular() {
		System.out.println("Método Referido Instancia de objeto em particular");
	}
	
	public void referenciarConstrutor() {
		System.out.println("Método Referenciar Construtor");
	}

	public void operar() {
		Operacao op = ()->MeRefApp.referenciarMetodoStatic();
		op.saludar();
	}
	
	public static void main(String[] args) {
		MeRefApp app = new MeRefApp();
		//app.operar();
		//app.referenciarMetodoInstanciaObjetoArbitrario();
		app.referenciarMetodoInstanciaObjetoParticular();
		//Operacao op = app.
	}
}
