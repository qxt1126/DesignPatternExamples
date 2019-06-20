package BuilderPattern;

public class CorprationBusninessBuilder extends BusinessBuilder{
	public void buildBusinessName() {
		business.setBusinessName("WestLake Corp.");
    }

    public void buildBusinessType() {
    	business.setBusinessType("Restaurant");
    }

    public void buildDirector() {
    	business.setDirector("Ethan Qiu");
    }
}
