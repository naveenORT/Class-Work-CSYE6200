package inheritance;

public class PetAnimal {

	private int id;
	private static int idCounter = 0; //a static counter
	private int age = 1;
	private String name;
	
	// static code block
	static{
		System.out.println("Setting idCounter");
		idCounter = 10;
	}

	public PetAnimal() {
	name ="unknown";
	id = idCounter++;  // assign & advance by 1
	}

	public int getAge() {
		return age;
	}

	public void setAge(String str) {
		age = Integer.valueOf(str);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getID()
	{
		return id;
	}  
	void bark() {
			System.out.println("bark");
	}

	void walk() {
		System.out.println(" We are walking");
	}









}
