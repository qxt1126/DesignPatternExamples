package AdapterPattern;

public class AllAroundPlayer implements SportPlayer {
	SportAdapter sportAdapter;

	@Override
	public void play(String sportType, String playerName) {
 
		if (sportType.equalsIgnoreCase("Hockey")) {
			System.out.println(playerName + " can play Hockey.");
		}

		else if (sportType.equalsIgnoreCase("Basketball") || sportType.equalsIgnoreCase("Football")) {
			sportAdapter = new SportAdapter(sportType);
			sportAdapter.play(sportType, playerName);
		}

		else {
			System.out.println("Player " + playerName + " cannot play " + sportType + ".");
		}
	}

}
