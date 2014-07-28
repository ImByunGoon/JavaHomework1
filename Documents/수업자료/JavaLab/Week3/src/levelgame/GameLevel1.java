package levelgame;

public class GameLevel1 extends GameLevel{
	public int level = 1;
	private static GameLevel1 gamelevel1 = new GameLevel1();
	
	private GameLevel1(){
		
	}
	
	public static GameLevel1 getInstance(){
		
		if(gamelevel1== null)
			gamelevel1 = new GameLevel1();
		return gamelevel1;
	}
	@Override
	public void simpleAttack() {
		// TODO Auto-generated method stub
		System.out.println("Get my punch!");
	}

	@Override
	public void turnAttack() {
		// TODO Auto-generated method stub
		System.out.println("돌려차기실패 ....");
	}

	@Override
	public void flyingAttack() {
		// TODO Auto-generated method stub		
		System.out.println("failed...");
	}

	
	public GameLevel upgradeLevel() {
		// TODO Auto-generated method stub
		return GameLevel2.getInstance();
	}

	

}
