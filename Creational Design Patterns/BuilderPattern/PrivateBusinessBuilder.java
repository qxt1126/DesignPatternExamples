package BuilderPattern;

public class PrivateBusinessBuilder extends BusinessBuilder{
	public void buildBusinessName() {
		business.setBusinessName("WestLake restaurant");
    }

    public void buildBusinessType() {
    	business.setBusinessType("Restaurant");
    }

    public void buildDirector() {
    	business.setDirector("Xiaotao Qiu");
    }
}
