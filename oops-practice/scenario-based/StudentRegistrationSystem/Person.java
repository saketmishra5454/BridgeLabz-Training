package StudentRegistrationSystem;

public class Person {
	private String id;
	private String name;
	
	public Person(String name, String id) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

}
