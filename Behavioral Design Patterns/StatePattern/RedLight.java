package StatePattern;

public class RedLight implements Reciever {
	@Override
	public void on() {
		System.out.println("Swithcing on red light");
	}

	@Override
	public void off() {
		System.out.println("Swithcing off red light");
	}
}
