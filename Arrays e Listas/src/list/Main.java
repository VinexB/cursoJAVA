package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//List s� aceita tipos wrapper, n�o aceita tipos primitivos
		/*ArrayList � o tipo que tem melhor otimiza��o
		 *tendo em si o melhor do List e do Vetor
		 *Outra observa��o � que o List n�o pode ser instanciado, sendo necess�rio declarar o tipo 
		 */
		List <String> list = new ArrayList<>();
		
		list.add("bob");
		list.add("alex");
		list.add("Anna");
		list.add("Maria");
		list.add(2, "Marcos");
		
	
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		//remove da lista por posi��o ou char
		list.remove(1);
		//fun��o lambda ou predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		//localiza a posi��o na lista
		System.out.println("Index of Bob: " + list.indexOf("bob"));
		
		System.out.println("----------------");
		//filtrar a lista
		//necessario declarar nova lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		//encontra a posi��o de um certo elemento seguindo determinado crit�rio
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.printf(name);
		
		
		
		
	}

}
