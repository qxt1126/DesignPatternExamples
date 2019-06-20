package MVCPattern;

public class MVCPatternDemo {
	public static void main(String[] args) {

		Director model = retriveStudentFromDatabase();

		DirectorView view = new DirectorView();

		DirectorController controller = new DirectorController(model, view);

		controller.updateView();

		controller.setDirectorName("Ethan");

		controller.updateView();
	}

	private static Director retriveStudentFromDatabase() {
		Director director = new Director();
		director.setName("Ethan Qiu");
		director.setID("1");
		return director;
	}
}
