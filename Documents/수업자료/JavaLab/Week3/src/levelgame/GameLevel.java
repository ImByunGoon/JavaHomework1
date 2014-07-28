package levelgame;

public abstract class GameLevel {
	
	
	public abstract void simpleAttack();
	
	public abstract void turnAttack();
	
	public abstract void flyingAttack();
	
	public abstract GameLevel upgradeLevel();
	
	public void play(){
		simpleAttack();
		turnAttack();
		flyingAttack();
		
	}
}
