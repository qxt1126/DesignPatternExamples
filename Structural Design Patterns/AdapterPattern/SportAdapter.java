package AdapterPattern;

public class SportAdapter implements SportPlayer {
	AdvancedSportPlayer advancedSportPlayer;

	public SportAdapter(String sportType) {

		if (sportType.equalsIgnoreCase("Basketball")) {
			advancedSportPlayer = new BasketballPlayer();

		} else if (sportType.equalsIgnoreCase("Football")) {
			advancedSportPlayer = new FootballPlayer();
		}
	}

	@Override
	public void play(String sportType, String playerName) {

		if (sportType.equalsIgnoreCase("Basketball")) {
			advancedSportPlayer.playBasketball(playerName);
		} else if (sportType.equalsIgnoreCase("Football")) {
			advancedSportPlayer.playFootball(playerName);
		}
	}

}
