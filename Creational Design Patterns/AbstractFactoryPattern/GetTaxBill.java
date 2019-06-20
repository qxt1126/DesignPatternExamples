package AbstractFactoryPattern;

public class GetTaxBill {
	public static AbstractTaxBill getFactory(boolean residencial){   
	      if(residencial){
	         return new ResidencialFactory();         
	      }else{
	         return new CommercialFactory();
	      }
	   }
}
