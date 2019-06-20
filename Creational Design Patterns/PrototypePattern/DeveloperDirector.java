package PrototypePattern;

public class DeveloperDirector extends Director {
	
	public DeveloperDirector() {
		department = "Developing Group";
	}

	@Override
	public void directorInfo() {
		System.out.println("This is Developing Group.");
	}
}
