import java.io.InputStreamReader;
import java.util.Scanner;
//Hi David! -From Thomas
public class App {
	
	private Scanner input;
	private Shelter myShelter;
	
	
	public static void main(String[] args) {
		
		App myApp = new App(); //Hello World
		myApp.gameLoop();
	}
	public void gameLoop() {
		System.out.println("Welcome to Virtual Pet Game");
		input = new Scanner(System.in);
		myShelter = new Shelter();
		// Hi From Mario 
		
		
		while(myShelter.allPetsAlive()) {
			System.out.println(myShelter.showAllPets());
			showMainMenu();
			int selection = input.nextInt();
			input.nextLine();
			switch(selection) {
			case 1:
				System.out.println("Enter the name of the pet you wish to adopt");
				String petToAdopt = input.nextLine();
				try {
					myShelter.adoptPet(petToAdopt);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 2:
				addPet();
				break;
			
			case 3:
				myShelter.feedAllOrganicPets();
				break;	
			}
			myShelter.tickAllPets();
		}
	}
	public void showMainMenu() {
		System.out.println("Press 1. To adopt a pet");
		System.out.println("Press 2. To admit a pet");
		System.out.println("Press 3. To feed organic pets");
		System.out.println("Press 5. To exit");
	}
	public void addPet() {
		System.out.println("Enter the name of the pet you wish to admit");
		String petName = input.nextLine();
		System.out.println("Is the pet Robotic? Y or N");
		boolean isRobotic;
		if(input.nextLine().toLowerCase().contains("y")) {
			isRobotic = true;
		}
		else {
			isRobotic = false;
		}
		boolean isDog;
		System.out.println("Is the pet a dog? Y or N");
		if(input.nextLine().toLowerCase().contains("y")) {
			isDog = true;
		}
		else {
			isDog = false;
		}
		myShelter.addPet(makePet(petName,isRobotic,isDog));
	}
	
	public VirtualPet makePet(String name, boolean isRobotic, boolean isDog) {
		if(isRobotic && isDog) {
			return new RoboticDog(name);
		}
		if(isRobotic && !isDog) {
			return new RoboticCat(name);
		}
		if(!isRobotic && isDog) {
			return new OrganicDog(name);
		}
		
		return new OrganicCat(name);
		
	}
	
}
