
public abstract class VirtualPet {
	protected String name;
	private boolean isAlive;
	
	
	
	public VirtualPet(String name) {
		this.name = name;
		isAlive = true;
	}

	public abstract void play();
	
	public abstract String status();

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		return isAlive;
	}
	
	
	
}
