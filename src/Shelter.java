import java.util.ArrayList;

public class Shelter {

	private ArrayList<VirtualPet> pets;

	public Shelter() {
		pets = new ArrayList<VirtualPet>();
		RoboticDog roboDog = new RoboticDog("RoboMax");
		pets.add(roboDog);
		pets.add(new RoboticCat("RoboFuffy"));
		pets.add(new OrganicCat("OrganicFluffy"));
		pets.add(new OrganicDog("OrganicMax"));
	}
	
	public String showAllPets() {
		String output = "";
		for(VirtualPet pet:pets) {
			output += pet.status() + "\n";
		}
		return output;
	}
	
	public void addPet(VirtualPet pet) {
		pets.add(pet);
	}
	
	public void adoptPet(String name) throws Exception {
		
		VirtualPet petToRemove = findPetByName(name);
		pets.remove(petToRemove);
	}
	
	private VirtualPet findPetByName(String name) throws Exception {
		for(VirtualPet pet: pets) {
			if(pet.getName().equalsIgnoreCase(name)) {
				return pet;
			}
		}
		throw new Exception("Pet not found");
	}
	public boolean allPetsAlive() {
		for(VirtualPet pet: pets) {
			if(!pet.isAlive()) {
				return false;
			}
		}
		return true;
	}
}
