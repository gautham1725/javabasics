package com.methodOverloadingExamples;

public class CelciusFarh {
      double celcius;
      double fahreheit;
	public double getCelcius() {
		return celcius;
	}
	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}
	public double getFahreheit() {
		return fahreheit;
	}
	public void setFahreheit(double fahreheit) {
		this.fahreheit = fahreheit;
	}
      
      public void celcius() {
    	  double celcius= (double)( 5.0 / 9.0 * ( fahreheit - 32 ) );
    	  System.out.println(celcius);
      }
      
      public void fahreheit() {
    	  double celcius= (double)( 9.0 / 5.0 * ( fahreheit + 32 ) );
    	  System.out.println(celcius);
      }
      
      public static void main() {
    	  CelciusFarh v1 = new CelciusFarh();
    	  v1.setCelcius(90.0);
    	  v1.setFahreheit(120.0);
    	  v1.celcius();
    	  v1.fahreheit();
      }
      
}
