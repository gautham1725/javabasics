package com.invoice;

public class Invoice {
	
	String partNumber ;
	String partDescription;
	int quantityPurchased;
	double price;
	double amount;
	
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantityPurchased() {
		return quantityPurchased;
	}
	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void getInvoiceAmount() {
		
		double amount1=(double) quantityPurchased*price;
		this.amount=amount1;
		//return amount;
	}
		public static void main(String[] args) {
			
			Invoice i1=new Invoice();
			i1.setPartDescription("Bisciuts");
			i1.setPartNumber("23");
			i1.setQuantityPurchased(5);
			i1.setPrice(10.00);
			
			i1.getInvoiceAmount();
			
			System.out.println("partdescription "+i1.getPartDescription());
			System.out.println("partNumber "+i1.getPartNumber());
			System.out.println("quanity "+i1.getQuantityPurchased());
			System.out.println("price "+ i1.amount);
		}
}
