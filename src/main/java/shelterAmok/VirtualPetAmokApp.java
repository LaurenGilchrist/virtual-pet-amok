package shelterAmok;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetAmokApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Shelter shelter = new Shelter();

		Dog clifford = new Dog("Clifford", 10, 10, 10, 10, 10, 10, "loves to play catch");
		Cat garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "loves to nap and cuddle");
		RoboDog odie = new RoboDog("Odie", 10, 10, 10, 10, "loves to wag his tail");
		RoboCat sylvester = new RoboCat("Sylvester", 10, 10, 10, 10, "loves to purr");

		shelter.addPet(clifford);
		shelter.addPet(garfield);
		shelter.addPet(odie);
		shelter.addPet(sylvester);

		System.out.println("Welcome to Luna's Looney Animal Kingdom!");
		System.out.println("Here are our organic and robotic pets at the Animal Kingdom");
		System.out.println();
		shelter.showAllPets();
		shelter.tick();
		// Collection<Pet> pets = shelter.getAllPets();

		String choice = "";
		do {
			System.out.println();
			System.out.println("What would you like to do today?");
			System.out.println("1. Feed the organic pets");
			System.out.println("2. Water the organic pets");
			System.out.println("3. Play with the pets");
			System.out.println("4. Adopt a pet");
			System.out.println("5. Admit a pet");
			System.out.println("6. Walk all dogs");
			System.out.println("7. Clean the dog cages");
			System.out.println("8. Clean the shelter litterbox");
			System.out.println("9. Oil robotic pets");
			System.out.println("10. exit");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("How much food do you want to give the organic pets?");
				input.nextLine();
				shelter.showAllOrganicPets();
				shelter.feedOrganic();
				System.out.println("You feed us " + ((OrganicPet) clifford).getHunger() + "  cups of dry food!");

			} else if (choice.equals("2")) {
				System.out.println("How much water will you give the pets?");
				input.nextLine();
				shelter.showAllOrganicPets();
				shelter.waterOrganic();
				System.out.println("You gave me " + ((OrganicPet) garfield).getThirst() + " cups of water!");

			} else if (choice.equals("3")) {
				shelter.playWithOnePet();
				System.out.println("What pet would you like to play with?");
				String petName = input.nextLine();
				System.out.println("What would you like to do");
				input.nextLine();
				System.out.println("That was fun!!");

			} else if (choice.equals("4")) {
				System.out.println("You have decided on adopting a pet");
				System.out.println();
				System.out.println("Which pet have you chosen to adopt?");
				System.out.println();
				shelter.showAllPets();
				String petName = input.nextLine();
				shelter.findPet(petName);
				System.out.println();
				shelter.adopt(shelter.findPet(petName));
				System.out.println("Congrats on your new pet");

			} else if (choice.equals("5")) {
				System.out.println("You have chosen to admit a pet");
				System.out.println("What type of animal will you be admitting today");
				System.out.println("Dog | Cat | RoboDog | RoboCat");
				String petName = input.nextLine();

				if (choice.equals("Dog")) {
					System.out.println("Enter the name of the dog:");
					petName = input.nextLine();
					System.out.println();
					System.out.println("Enter a description of the pet" + petName);
					String description = input.nextLine();
					System.out.println();
					shelter.addPet(new Dog(petName, 10, 10, 10, 10, 10, 10, description));
				}
				if (choice.equals("Cat"));
				{
					System.out.println("Enter the name of the cat:");
					petName = input.nextLine();
					System.out.println();
					System.out.println("Enter a description of the pet" + petName);
					String description = input.nextLine();
					System.out.println();
					shelter.addPet(new Cat(petName, 10, 10, 10, 10, 10, 10, description));

				}
				if (choice.equals("RoboDog"));
				{
					System.out.println("Enter the name of the robitic dog");
					petName = input.nextLine();
					System.out.println();
					System.out.println("Enter a description of the pet" + petName);
					String description = input.nextLine();
					System.out.println();
					shelter.addPet(new RoboDog(petName, 10, 10, 10, 10, description));

				}
				if (choice.equals("RoboCat"));
				{
					System.out.println("Enter the name of the robitic dog");
					petName = input.nextLine();
					System.out.println();
					System.out.println("Enter a description of the pet" + petName);
					String description = input.nextLine();
					System.out.println();
					shelter.addPet(new RoboCat(petName, 10, 10, 10, 10, description));

				}

				{
					System.out.println("Thank you for entrusting us to take care of your pet");
					shelter.showAllPets();
				}
				{

				}

			} else if (choice.equals("6")) {
				shelter.walkDogs();
				System.out.println("You choose to walk the dogs today.");
				System.out.println();
				System.out.println("The dogs loved their walk!!");
				System.out.println("Thank you, we appreciate it!");

			} else if (choice.equals("7")) {
				System.out.println("You have chosen to clean the dog cages");
				System.out.println();
				shelter.cleanAllCages();
				System.out.println("Thank you for cleaning the stinky cages!");

			} else if (choice.equals("8")) {
				System.out.println("You have chosen to clean the cat litter boxes");
				System.out.println();
				shelter.emptyLitterBox();
				System.out.println("Thanks for taking on a stinky job!");

			} else if (choice.equals("9")) {
				System.out.println("You have chosen oil the robotic pets");
				System.out.println();
				shelter.oilRobo();
				System.out.println();

			} else if (choice.equals("10")) {
				System.out.println("Thank you for visiting today!");
				System.out.println("Come back soon!");

			} else {
				System.out.println("Please choose again");
			}

			shelter.showAllPets();
			shelter.tick();
			System.out.println();

		} while (!choice.equals("10"));
		input.close();
	}
}
