package org.ottolini.java8.study.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionApp {
	
	private List<String> lista;
	
	public void preencherLista() {
		lista = new ArrayList<>();
		lista.add("MitoCode");
		lista.add("Mito");
		lista.add("Code");
		lista.add("MitoCode");
	}
	
	public void usarForEach() {
		lista.forEach(x -> System.out.println(x));
	}

	public void usarRemoveIf() {
		lista.removeIf(x -> x.equalsIgnoreCase("MitoCode"));
	}
	
	public void usarSort() {
		lista.sort((x,y) -> x.compareTo(y));
	}
	
	public static void main(String[] args) {
		CollectionApp app = new CollectionApp();
		app.preencherLista();
		//app.usarRemoveIf();
		app.usarSort();
		app.usarForEach();
	}
}
