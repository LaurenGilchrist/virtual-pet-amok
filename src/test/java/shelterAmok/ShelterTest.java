package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	Shelter shelter = new Shelter();

	 Shelter underTest;
	 Dog clifford;
	 Cat garfield;
	 RoboDog odie;
	 RoboCat sylvester;

	@Before
	public void setup() {
		underTest = new Shelter();
		clifford = new Dog("Clifford", 10, 10, 10, 10, 10, 10, "loves to play catch");
		garfield = new Cat("Garfield", 10, 10, 10, 10, 10, 10, "loves to nap and cuddle");
		odie = new RoboDog("Odie", 10, 10, 10, 10, "loves to wag his tail");
		sylvester = new RoboCat("Sylvester", 10, 10, 10, 10, "loves to purr");
		

	}

	@Test
	public void shouldBeAbleToAddPet() {
		Dog anyDog = new Dog("name", 10, 10, 10, 10, 10, 10, "description");
		shelter.addPet(anyDog);
		Collection<Pet> check = shelter.getAllPets();
		assertThat(check, contains(anyDog));

	}

	@Test
	public void shouldBeAbleToAddTwoDifferentPets() {
		Dog anyDog = new Dog("clifford", 10, 10, 10, 10, 10, 10, "description");
		RoboCat anyRoboCat = new RoboCat("sylvester", 10, 10, 10, 10, "description");
		shelter.addPet(anyDog);
		shelter.addPet(anyRoboCat);
		Collection<Pet> check = shelter.getAllPets();
		assertThat(check, containsInAnyOrder(anyRoboCat, anyDog));

	}

	@Test
	public void shouldBeAbleToARemovePetForAdoption() {
		shelter.addPet(clifford);
		shelter.addPet(garfield);
		shelter.remove(garfield);
		Collection<Pet> petsInShelter = shelter.getAllPets();
		assertThat(petsInShelter, containsInAnyOrder(clifford));
		
		
	}
	@Test
	public void shouldBeAbleToRemoveMultiplePetsForAdoption() {
		shelter.addPet(clifford);
		shelter.addPet(garfield);
		shelter.addPet(odie);
		shelter.addPet(sylvester);
		shelter.remove(clifford);
		shelter.remove(sylvester);
		Collection<Pet> petsInShelter = shelter.getAllPets();
		assertThat(petsInShelter, containsInAnyOrder(odie, garfield));
		
	}

	@Test
	public void shouldBeAbleToFeedAllOrganicPets() {
		shelter.addPet(clifford);
		shelter.addPet(garfield);
		shelter.feedOrganic();
		int check = clifford.getHunger();
		assertEquals(5, check);
		check = garfield.getHunger();
		assertEquals(5, check);
		
	}
	@Test
	public void shouldBeAbleToWaterAllOrganicPets() {
		shelter.addPet(clifford);
		shelter.addPet(garfield);
		shelter.waterOrganic();
		int check = clifford.getThirst();
		assertEquals(5, check);
			
	}
	@Test 
	public void shouldBeAbleToOilAllRoboPets() {
		shelter.addPet(odie);
		shelter.addPet(sylvester);
		shelter.oilRobo();
		int check = odie.getOilLevel();
		assertEquals(10, check);
		
	}@Test 
	public void shouldHaveTickIncreaseHungerThirstBoredomAndWasteInOrganicPets() {
		shelter.addPet(clifford);
		shelter.addPet(garfield);
		shelter.tick();
		int check = clifford.getHunger();
		assertEquals(15, check);
		check = garfield.getThirst();
		assertEquals(15, check);
		check = garfield.getBoredom();
		assertEquals(15, check);
		check = clifford.getWaste();
		assertEquals(15, check);
		
	}
	@Test
	public void shouldHaveTickDecreaseOilLevelInRoboPets() {
		shelter.addPet(odie);
		shelter.addPet(sylvester);
		shelter.tick();
		int check = odie.getOilLevel();
		assertEquals(5, check);
		check = sylvester.getOilLevel();
		assertEquals(5, check);
		

	}

}
