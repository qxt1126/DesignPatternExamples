package PrototypePattern;

import java.util.Hashtable;

public class DirectorCache {
	private static Hashtable<String, Director> directorMap = new Hashtable<String, Director>();

	public static Director getDirector(String directorName) {
		Director cachedDirector = directorMap.get(directorName);
		return (Director) cachedDirector.clone();
	}

	// for each Director run database query and create Director
	// directorMap.put(directorKey, director);
	// for example, we are adding three shapes

	public static void loadCache() {
		HRDirector hRDirector = new HRDirector();
		hRDirector.setName("Peter");
		directorMap.put(hRDirector.getName(), hRDirector);

		DeveloperDirector developerDirector = new DeveloperDirector();
		developerDirector.setName("Jack");
		directorMap.put(developerDirector.getName(), developerDirector);

	}
}
