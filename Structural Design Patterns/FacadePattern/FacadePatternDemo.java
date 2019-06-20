package FacadePattern;

public class FacadePatternDemo {

	public static void main(String[] args) {
		TravelPackageFacade travelPackageFacade = new TravelPackageFacadeImpl();
		travelPackageFacade.book();
	}

}
