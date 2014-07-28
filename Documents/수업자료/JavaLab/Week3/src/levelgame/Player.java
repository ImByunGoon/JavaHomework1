package levelgame;

public class Player {
	private GameLevel level;
	private int levelcount=1;
	public Player(){
		this.level = GameLevel1.getInstance();
	}
	public void upgradeLevel(){
		//레벨을 어떻게 올리나?
		level = level.upgradeLevel();
	}
	
	public GameLevel getGameLevel(){
		return this.level;
		/*
		GameLevel1 a = GameLevel1.getInstance();
		return a;
		*/
	}
	
	public void attack(){
				System.out.println(levelcount+"Start!");
				level.play();
				System.out.println(levelcount+"Ends!");
				levelcount++;
	}
}
