package mmalkiew.example.lambda;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String PESEL;
	
	public Person(String firstName, String lastName, int age, String PESEL)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.PESEL = PESEL;
	}
	
	public void printName() {
		System.out.println("First name: " + firstName +" " + 
				"Last name: " + lastName +" " +
				"Age: " + age +" " +
				"PESEL: " + PESEL);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPESEL() {
		return PESEL;
	}
	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}
}
