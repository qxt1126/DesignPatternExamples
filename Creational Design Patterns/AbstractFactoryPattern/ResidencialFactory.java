package AbstractFactoryPattern;

import FactoryPattern.ResidencialTaxBill;

public class ResidencialFactory extends AbstractTaxBill {

	@Override
	public TaxBill getTaxBill(String billType) {
		if (billType.equalsIgnoreCase("RESIDENCIALTAXBILL")) {
			return (TaxBill) new ResidencialTaxBill();
		}
		return null;
	}

}
