package ObserverPattern;

public class OracleAlertSubscriber implements AlertObserver {
	private AlertObservable alertObservable;

	public OracleAlertSubscriber(AlertObservable alertObservable) {
		super();
		this.alertObservable = alertObservable;
		this.alertObservable.register(this);
	}

	public AlertObservable getAlertObservable() {
		return alertObservable;
	}

	public void setAlertObservable(AlertObservable alertObservable) {
		this.alertObservable = alertObservable;
	}

	@Override
	public void publish(Alert alert) {
	}
}
