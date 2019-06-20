package AbstractFactoryPattern;

public class CommercialTaxBill implements TaxBill {

	@Override
	public void getRate() {
		double rate = 7.50;
	}
	
}
