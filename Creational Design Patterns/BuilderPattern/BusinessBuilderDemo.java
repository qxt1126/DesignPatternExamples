package BuilderPattern;

public class BusinessBuilderDemo {

	public static void main(String[] args) {
		Client client = new Client();
		BusinessBuilder privateBusinessBuilder = new PrivateBusinessBuilder();
		BusinessBuilder corprationBusninessBuilder = new CorprationBusninessBuilder();

		client.setBusinessBuilder(privateBusinessBuilder);
		client.constructBusiness();

		Business business = client.getBusiness();

	}

}
