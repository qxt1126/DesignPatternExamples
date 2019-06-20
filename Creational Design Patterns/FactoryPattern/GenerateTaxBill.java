package FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateTaxBill {

	public static void main(String[] args) throws IOException {
		GetTaxBill taxFactory = new GetTaxBill();

		System.out.print("Enter the type of tax for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String taxType = br.readLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());

		TaxBill tb = taxFactory.getTaxBill(taxType);
		// call getRate() method and calculateBill()method of DomesticPaln.

		System.out.print("Bill amount for " + taxType + " of  " + units
				+ " units is: ");
		tb.getRate();
		tb.calculateBill(units);

	}

}
