package mmalkiew.example.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

	public static void sortAscPersonList(List<Person> listPerson)
	{
		Collections.sort(listPerson, new Comparator<Person>() {
			public int compare(Person firstPerson, Person secondPerson) 
			{
				return firstPerson.getPESEL().compareTo(secondPerson.getPESEL());
			};
		});
	}
	
	public static void sortAscPersonListWithLambda(List<Person> listPerson)
	{
		Collections.sort(listPerson, (Person p1, Person p2) -> p1.getPESEL().compareTo(p2.getPESEL()));
	}
	
	public static void sortAscPersonListByAgeWithLambda(List<Person> listPerson)
	{
		Collections.sort(listPerson, (Person p1, Person p2) -> Integer.toString(p1.getAge()).compareTo(Integer.toString(p2.getAge())));
	}
	
	public static void sortDescPersonListByAgeWithLambda(List<Person> listPerson)
	{
		Collections.sort(listPerson, (Person p1, Person p2) -> Integer.toString(p2.getAge()).compareTo(Integer.toString(p1.getAge())));
	}
}
