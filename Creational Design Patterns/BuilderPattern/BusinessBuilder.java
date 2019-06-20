package BuilderPattern;

public abstract class BusinessBuilder {
	protected Business business;

    public Business getBusiness() {
        return business;
    }

    public void createNewBusiness() {
    	business = new Business();
    }

    public abstract void buildBusinessName();
    public abstract void buildBusinessType();
    public abstract void buildDirector();
}
