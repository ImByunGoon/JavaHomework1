package levelgame;

public class GameLevel2 extends GameLevel {

	public int level = 2;
	private static GameLevel2 gamelevel2 = new GameLevel2();
	private GameLevel2(){
		
	}
	
	public static GameLevel2 getInstance(){
		
		if(gamelevel2== null)
			gamelevel2 = new GameLevel2();
		return gamelevel2;
	}
	@Override
	public void simpleAttack() {
		// TODO Auto-generated method stub
		
		System.out.println("Get my punch!");
	}

	@Override
	public void turnAttack() {
		// TODO Auto-generated method stub
		System.out.println("돌려차기를 받아라!");
	}

	@Override
	public void flyingAttack() {
		// TODO Auto-generated method stub
		System.out.println("failed......");
	}

	public GameLevel upgradeLevel() {
		// TODO Auto-generated method stub
		return GameLevel3.getInstance();
	}

}
