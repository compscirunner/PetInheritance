
public abstract class Organic extends VirtualPet {

	protected int hungerLevel;
	protected int thirstLevel;
	protected int boredomLevel;
	
	public Organic(String name) {
		super(name);
		hungerLevel =0;
		thirstLevel =0;
		boredomLevel =0;
	}

	
	
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		hungerLevel++;
		thirstLevel++;
		boredomLevel = 0;
	}
	public void giveFood() {
		hungerLevel = 0;
	}
	
	public void giveWater() {
		thirstLevel = 0;
	}




	@Override
	public String status() {
		return name 
				+ " type: " + this.getClass().getName() 
				+" hunger: "+ hungerLevel
				+" thirst: " + thirstLevel
				+" boredom: " + boredomLevel;
	}




	
	
	
}
