package shelterAmok;

public abstract class RoboPet extends Pet{

	protected int oilLevel;

	public int getOilLevel() {
		return oilLevel;
	}

	public void reduceOilLevel() {
		oilLevel -=5;
		
	}

	public void increaseOilLevel() {
		oilLevel +=5;
		
	}
	@Override
	public void play() {
		boredom -=5;
		this.reduceOilLevel();
		
	}

	public void tick() {
		oilLevel -=5;
		
	}
}