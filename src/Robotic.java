
public abstract class Robotic extends VirtualPet {
	

	protected int batteryLevel;
	protected int durability;
	
		public Robotic(String name) {
		super(name);
		batteryLevel = 10;
		durability = 10;
	}
	
	
	@Override
	public void play() {
		batteryLevel--;
		durability--;
	}
	public void giveCharge() {
		batteryLevel = 10;
	}
	public void repair() {
		durability = 10;
	}
	@Override
	public String status() {
		return name 
				+ " type: "+ this.getClass().getName() 
				+ " -battery level: " + batteryLevel 
				+ " -durability: " + durability;
	}


	@Override
	public void tick() {
		batteryLevel--;
		durability--;
	}
	
	
	
}
