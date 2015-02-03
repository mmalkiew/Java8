package mmalkiew.example.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		List languages = Arrays.asList("Java", "Scala", "C", "C++", "Smaltalk");
		
		System.out.println("Languages which starts with J :");
		filter(languages, (str)->((String) str).startsWith("J"));
		
		System.out.println("Languages which starts with S :");
		filter(languages, (str) -> ((String) str).startsWith("S"));
		
		System.out.println("Print all languages: ");
		filter(languages, (str) -> true);
		

	}
	
	public static void filter(List<String> list, Predicate condition) {
		for(String position:list) {
			if(condition.test(position)) {
				System.out.println(position + " ");
			}
		}
	}

}
