package SingletonPattern;

public class SimpleSingleton {
	private static SimpleSingleton instance;

	private SimpleSingleton() {
		System.out.println("Singleton(): Initializing Instance");
	}

	public static synchronized SimpleSingleton getInstance() {

		if (instance == null)
			instance = new SimpleSingleton();

		return instance;
	}

	public void doSomething()
	{
		System.out.println("doSomething(): Singleton does something!");
	}
}
