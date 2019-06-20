package AdapterPattern;

public class FootballPlayer implements AdvancedSportPlayer{
	
	@Override
	public void playBasketball(String playerName) {
		// do nothing
	}

	@Override
	public void playFootball(String playerName) {
		System.out.println(playerName + " can play football.");
	}
}
