package inheritance;

public class Dog extends PetAnimal {

	//Constructor
	public Dog() {
	}

	public Dog(String name) {
		setName(name);
	}
	
	public void walk() {
		System.out.println(" Dog name: " );
	}
	public String toString() {
		return ("Dog name:" + getName() + "ID" + getID());
	}
	public static void main(String[] args) {
		Dog dog = new Dog("Thor");
		System.out.println(dog);
		System.out.println("Dog name: " + dog.getName());
		dog.walk();
		dog.bark();
		System.out.println("My dog's age is: " + dog.getAge());
	
		PetAnimal pet = new PetAnimal();
		pet.setAge("10");
		pet.walk();
		System.out.println(pet);
	
		Kennel kennel = new Kennel();
		kennel.run();
	
	
	}

}
