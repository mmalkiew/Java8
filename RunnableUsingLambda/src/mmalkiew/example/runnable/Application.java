package mmalkiew.example.runnable;

public class Application {

	public static void main(String[] args) {
		new Thread( () -> System.out.println("Lambda expression works!!") ).start();

	}

}
