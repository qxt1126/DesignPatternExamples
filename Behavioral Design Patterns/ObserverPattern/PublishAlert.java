package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class PublishAlert implements AlertObservable {
	private List<AlertObserver> alertObservers = new ArrayList<AlertObserver>();

	public List<AlertObserver> getAlertObservers() {
		return alertObservers;
	}

	@Override
	public void register(AlertObserver observer) {
		getAlertObservers().add(observer);
	}

	@Override
	public void unregister(AlertObserver observer) {
		int index = getAlertObservers().indexOf(observer);
		getAlertObservers().remove(index);
	}

	@Override
	public void notifyObservers(Alert alert) {
		for (AlertObserver alertObserver : getAlertObservers()) {
			alertObserver.publish(alert);
		}
	}
}
