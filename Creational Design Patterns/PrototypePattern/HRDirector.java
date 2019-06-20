package PrototypePattern;

public class HRDirector extends Director {
	
	public HRDirector() {
		department = "HumanResource";
	}

	@Override
	public void directorInfo() {
		System.out.println("This is HR Director.");
	}
}
