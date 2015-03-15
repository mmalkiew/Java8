package mmalkiew.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) 
	{
		Person firstPerson = new Person("Jan", "Kowalski", 25, "12345678901");
		Person secondPerson = new Person("Adam", "Nowak", 36, "09876543210");
		List<Person> personList = new ArrayList<Person>();
		personList.add(firstPerson);
		personList.add(secondPerson);
		
		LambdaComparator.sortAscPersonList(personList);
		System.out.println("===== Without Lambda: Sort ASC PESEL =====");
		for(Person p:personList)
		{
			p.printName();
		}
		
		System.out.println("===== With Lambda: Sort ASC PESEL =====");
		LambdaComparator.sortAscPersonListWithLambda(personList);
		for(Person p:personList)
		{
			p.printName();
		}
		
		System.out.println("===== With Lambda: Sort ASC Age =====");
		LambdaComparator.sortAscPersonListWithLambda(personList);
		for(Person p:personList)
		{
			p.printName();
		}
		
		System.out.println("===== With Lambda: Sort DESC Age =====");
		LambdaComparator.sortDescPersonListByAgeWithLambda(personList);
		for(Person p:personList)
		{
			p.printName();
		}
		
		// NOWA ZMIANA
	}

}
