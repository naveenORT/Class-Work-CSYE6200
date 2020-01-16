package inheritance;
import java.util.HashMap;
public class Hash {

	private HashMap<String, PetAnimal> myMap = new HashMap<String, PetAnimal>();
	
	public Hash() {

		PetAnimal pet1 = new Dog("Thor");
		PetAnimal pet2 = new Dog("Fenja");
		
		myMap.put(pet1.getName(), pet1);
		myMap.put(pet2.getName(), pet2);
	
	
		if (myMap.containsKey("Fenja"))
				System.out.println("We found Feja:" + myMap.get("Fenja"));
	
	
	
	}

	public static void main(String[] args) {

		new Hash();
	}

}
