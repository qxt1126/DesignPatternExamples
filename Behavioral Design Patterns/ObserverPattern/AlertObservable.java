package ObserverPattern;

public interface AlertObservable {
	public void register(AlertObserver observer);

	public void unregister(AlertObserver observer);

	public void notifyObservers(Alert alert);
}
