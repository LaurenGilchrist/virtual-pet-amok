package shelterAmok;

import java.util.Scanner;

public class VirtualPetAmokApp {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	Shelter shelter = new Shelter();
	
	Dog clifford = new Dog("Clifford", 10, 10, 10, 10, 10, 10, "loves to play catch");
	Cat garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "loves to nap and cuddle");
	RoboDog odie = new  RoboDog("Odie", 10, 10, 10, 10, "loves to wag his tail");
	RoboCat sylvester = new RoboCat("Sylvester", 10, 10, 10, 10, "loves to purr");
	
	shelter.addPet(clifford);
	shelter.addPet(garfield);
	shelter.addPet(odie);
	shelter.addPet(sylvester);
	
	shelter.showAllPets();
	
	
	
	
	
	
	
	
}
	
}
	
	
	
	
	
	
	


