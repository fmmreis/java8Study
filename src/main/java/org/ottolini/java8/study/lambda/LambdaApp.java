package org.ottolini.java8.study.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
	
	public void ordenar() {
		List<String> list = new ArrayList<>();
		list.add("MitoCode");
		list.add("Code");
		list.add("Mito");
		
//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
		
//		Collections.sort(list, (String p1, String p2) -> p1.compareTo(p2));
		
		//Collections.sort(list, );
		
		
		for(String element : list) {
			System.out.println(element);
		}
	}
	
	public void calcular() {
//		Operacao operacao = new Operacao() {
//
//			@Override
//			public double calcularMedia(double n1, double n2) {
//				return (n1 + n2) / 2;
//			}
//		};
		
		//Tudo o que puder ser uma classe anónima pode usar lambda
		Operacao operacao = (double d1, double d2)->((d1+d2)/2);
		
		System.out.println(operacao.calcularMedia(2, 3));
	}
	
	
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		app.ordenar();
		app.calcular();
	}
}
