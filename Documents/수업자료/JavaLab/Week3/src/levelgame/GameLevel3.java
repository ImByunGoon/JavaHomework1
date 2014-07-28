package levelgame;

public class GameLevel3 extends GameLevel{


	public int level = 3;
	private static GameLevel3 gamelevel3 = new GameLevel3();
	private GameLevel3(){
		
	}
	
	public static GameLevel3 getInstance(){
		
		if(gamelevel3== null)
			gamelevel3 = new GameLevel3();
		return gamelevel3;
	}
	
	@Override
	public void simpleAttack() {
		// TODO Auto-generated method stub		
		System.out.println("Get my punch!");
	}

	@Override
	public void turnAttack() {
		// TODO Auto-generated method stub
		System.out.println("돌려차기 실패...");
	}

	@Override
	public void flyingAttack() {
		// TODO Auto-generated method stub
		System.out.println("나비처럼 날아 벌처럼 쏜다!");
	}

	@Override
	public GameLevel upgradeLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
