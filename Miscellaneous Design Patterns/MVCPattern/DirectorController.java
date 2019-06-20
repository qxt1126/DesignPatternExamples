package MVCPattern;

public class DirectorController {
	private Director model;
	private DirectorView view;

	public DirectorController(Director model, DirectorView view) {
		this.model = model;
		this.view = view;
	}

	public void setDirectorName(String name) {
		model.setName(name);
	}

	public String getDirectorName() {
		return model.getName();
	}

	public void setDirectorID(String ID) {
		model.setID(ID);
	}

	public String getDirectorID() {
		return model.getID();
	}

	public void updateView() {
		view.printDirectorDetails(model.getName(), model.getID());
	}
}
