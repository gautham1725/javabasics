package com.basic;

public class Invoice {
	
	String partnumber ;
	String partdescription ;
	int quantity ;
	double price ;
	
	
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public String getPartdescription() {
		return partdescription;
	}
	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
		this.quantity = 0;
	}
		else {
			this.quantity = quantity;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0.0) {
			this.price=0.0;
		}else {
			this.price = price ;
		}
		}
	public double getInvoiceAmount() {
		return price*quantity;
		
		
	}
	
	
		public static void main(String[] args)
		{
			Invoice invoice1= new Invoice();
			invoice1.setQuantity(2);
			invoice1.setPrice(100);
			invoice1.setPartdescription("bolt");
			
			System.out.println(invoice1.getInvoiceAmount());
			
			
			
			
		}

	}
	
	
	

