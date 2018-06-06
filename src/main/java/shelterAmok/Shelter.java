package shelterAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Shelter {

	Map<String, Pet> pets = new HashMap<>();

	public void addPet(Pet anyPet) {
		pets.put(anyPet.getName(), anyPet);

	}

	public Collection<Pet> getAllPets() {
		return pets.values();

	}

	public void remove(Pet anyPet) {
		pets.remove(anyPet.getName());
	}
	public void adopt(Pet anyPet) {
		pets.remove(anyPet.getName(), anyPet);
	}
	public Pet findPet(String petName) {
		return pets.get(petName);

	}

	public void feedOrganic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
	}

	public void waterOrganic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();

			}
		}

	}

	public void oilRobo() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboPet) {
				((RoboPet) pet).getOilLevel();
			}
		}
	}
	public void emptyLitterBox() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Cat) {
				((Cat)pet).clean();
				
			}
		}
	}
	public void cleanAllCages() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Dog)	{
				((Dog)pet).clean();
			}
		}
	}
	
	public void walkDogs() {
		for (Pet pet : pets.values()) {
			if (pet instanceof WalkDogs) {
				((WalkDogs)pet).walk();
				
			}
		}
	}
	
	public void playWithOnePet() {
		for (Pet pet : pets.values()) {
			pet.play();
			}
		}
		


	public void tick() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).tick();
			} else {
				((RoboPet)pet).tick();
				
			}
		}
	}
	public void checkOrganicHealth() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				if(((OrganicPet) pet).getWaste() > 20) {
					pet.reduceHealth();
				}else if(((OrganicPet)pet).getHunger() <= 0) {
					pet.reduceHealth();
				}else if(((OrganicPet)pet).getThirst() <= 0) {
					pet.reduceHealth();
					
				}
				
			}
			
		}
		}
		
	public void checkRoboHealth() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboPet) {
				if(((RoboPet)pet).getOilLevel() <= 0) {
					pet.reduceHealth();
				}
			}
		}
	}

	public void showAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if(pet instanceof OrganicPet) {
				System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription() 
				+ " Hunger level: " + ((OrganicPet)pet).getHunger() + " Thirst level: " +
				((OrganicPet)pet).getThirst() + " Waste level: " + ((OrganicPet)pet).getWaste());
				
			}
		}
		
	}
	public void showAllPets() {
		for (Pet pet : pets.values()) {
			if(pet instanceof OrganicPet) {
				System.out.println("Name: " + pet.getName() + " " + pet.getDescription() + ". Hunger:  " 
			+ ((OrganicPet)pet).getHunger() + " Thirst: " + ((OrganicPet)pet).getThirst() + " Boredom: "
			+ ((OrganicPet)pet).getBoredom() + " Waste in cage: " 
			+ ((OrganicPet)pet).getWaste() + " Health: " + ((OrganicPet)pet).getHealth() + " Happiness: "
			+((OrganicPet)pet).getHappiness());
			} else if 
				(pet instanceof RoboPet) {
					System.out.println("Name: " + pet.getName() + " " + pet.getDescription() + ". Boredom: "
						+((RoboPet)pet).getBoredom() +	" Health: " + ((RoboPet)pet).getHealth() + " Happiness: " 
						+ ((RoboPet)pet).getHappiness() + " OilLevel: " + ((RoboPet)pet).getOilLevel());
				}
				
			}
	}
}


					
					
					
					