
public class OrganicDog extends Organic implements Walkable{

	public OrganicDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		hungerLevel++;
		thirstLevel++;
		boredomLevel++;
	}

	
}
