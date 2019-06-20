package AbstractFactoryPattern;

public abstract class AbstractTaxBill {
	abstract TaxBill getTaxBill(String billType);
}
