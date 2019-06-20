package AbstractFactoryPattern;

import FactoryPattern.CommercialTaxBill;

public class CommercialFactory extends AbstractTaxBill {

	@Override
	public TaxBill getTaxBill(String billType) {
		if (billType.equalsIgnoreCase("COMMERCIALTAXBILL")) {
			return (TaxBill) new CommercialTaxBill();
		}
		return null;
	}

}
