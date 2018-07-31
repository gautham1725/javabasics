package com.automobiles;

public class Honda extends TwoWheeler {
	
	public static void main(String args[]) {
		
		TwoWheeler unicorn=new TwoWheeler();
		unicorn.setEngineType("unicorn");
		unicorn.setLifeSpan(12);
		unicorn.setPrice(65000);
		unicorn.setProductType("df");
		
		TwoWheeler cbr =new TwoWheeler();
		cbr.setEngineType("cbr");
		cbr.setLifeSpan(12);
		cbr.setPrice(65000);
		cbr.setProductType("df");
		
		unicorn.print();
		cbr.print();
	}
	
}
