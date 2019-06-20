package AbstractFactoryPattern;

public class ResidencialTaxBill implements TaxBill {

	@Override
	public void getRate() {
		double rate = 5.50;
	}
	
}
