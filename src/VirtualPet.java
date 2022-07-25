
public abstract class VirtualPet {
	protected String name;
	private boolean isAlive;
	

	//i was here
	public VirtualPet(String name) {
		this.name = name;
		isAlive = true;
	}

	public abstract void play();
	
	public abstract String status();

	public abstract void tick();

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		return isAlive;
	}
	
	
	
}
