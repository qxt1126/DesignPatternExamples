package FactoryPattern;

public class GetTaxBill {
	public TaxBill getTaxBill(String billType) {
		if (billType == null) {
			return null;
		}
		if (billType.equalsIgnoreCase("RESIDENCIALTAXBILL")) {
			return new ResidencialTaxBill();
		} else if (billType.equalsIgnoreCase("COMMERCIALTAXBILL")) {
			return new CommercialTaxBill();
		}
		return null;
	}
}
