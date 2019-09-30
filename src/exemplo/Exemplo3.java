package exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo3 {

	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(1, "Marco");
			
		
		for ( String x1 : list){
			System.out.println(x1);
		}
		
		list.removeIf(x1 -> x1.charAt(0) == 'M' );
		
		System.out.println(list.size());
		System.out.println("--------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("--------------------");
		
		List<String> result = list.stream().filter(x1 -> x1.charAt(0) == 'A').collect(Collectors.toList());
		for ( String x1 : result){
			System.out.println(x1);
		}
		System.out.println("--------------------");
		
		String name = list.stream().filter(x1 -> x1.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		/*for (String obj : vect){
			System.out.println(obj);
		}*/

	}

}
