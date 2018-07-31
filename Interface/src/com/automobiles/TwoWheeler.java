package com.automobiles;


public class TwoWheeler implements Automobiles {

	int price = 0;
	String engineType = null;
	int lifeSpan = 0;
	String productType = null;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public void print() {
		System.out.println(this.getEngineType()+"\n"+this.getLifeSpan()+"\n"+
				""+this.getPrice()+"\n"+this.getProductType()+"\n");
		
	}

	
}
