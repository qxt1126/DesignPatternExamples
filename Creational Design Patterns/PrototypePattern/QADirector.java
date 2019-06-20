package PrototypePattern;

public class QADirector extends Director {
	
	public QADirector() {
		department = "QA team";
	}

	@Override
	public void directorInfo() {
		System.out.println("This is QA team.");
	}
}
