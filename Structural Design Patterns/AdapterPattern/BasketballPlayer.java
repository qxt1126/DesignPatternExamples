package AdapterPattern;

public class BasketballPlayer implements AdvancedSportPlayer {
	
	@Override
	public void playBasketball(String playerName) {
		System.out.println(playerName + " can play basketball.");
	}

	@Override
	public void playFootball(String playerName) {
		// do nothing
	}
}
