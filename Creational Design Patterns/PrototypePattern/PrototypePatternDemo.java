package PrototypePattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		DirectorCache.loadCache();

		Director clonedDirector = (Director) DirectorCache.getDirector("Peter");
		System.out.println("Director : " + clonedDirector.getDepartment());

		Director clonedDirector2 = (Director) DirectorCache.getDirector("Jack");
		System.out.println("Shape : " + clonedDirector2.getDepartment());

	}

}
