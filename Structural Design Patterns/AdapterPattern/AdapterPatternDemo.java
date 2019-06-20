package AdapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AllAroundPlayer allroundPlayer = new AllAroundPlayer();

		allroundPlayer.play("Basketball", "Ethan");
		allroundPlayer.play("Football", "Ethan");
		allroundPlayer.play("Hockey", "Ethan");
		allroundPlayer.play("Baseball", "Ethan");
	}
}
