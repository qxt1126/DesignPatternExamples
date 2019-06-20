package BuilderPattern;

public class Client {
	private BusinessBuilder businessBuilder;

    public void setBusinessBuilder(BusinessBuilder bb) {
    	businessBuilder = bb;
    }

    public Business getBusiness() {
        return businessBuilder.getBusiness();
    }

    public void constructBusiness() {
    	businessBuilder.createNewBusiness();
    	businessBuilder.buildBusinessName();
    	businessBuilder.buildBusinessType();
    	businessBuilder.buildDirector();
    }
}
