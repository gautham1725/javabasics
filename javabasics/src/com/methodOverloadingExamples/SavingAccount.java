package com.methodOverloadingExamples;

public class SavingAccount  {
	 
	static double annualinterestrate;
	double savingsbalance;
	
	public SavingAccount(double savingsbal ) {
		this.savingsbalance=savingsbal;
	}

	public void calculateMonthlyInterest() {
		double interest = ((savingsbalance*(annualinterestrate/100.0))/12) ;
		savingsbalance= savingsbalance + interest;
	}
		public static void modifyInterestRate(int newValue) {
			annualinterestrate  = newValue;
		}
		
		public void showbalance() {
			System.out.println("balance ="+savingsbalance);
		}
		
		public static void main(String[] args) {
			SavingAccount s1 = new SavingAccount(2000);
			SavingAccount s2 = new SavingAccount(4000);
			
			SavingAccount.modifyInterestRate(4);
			s1.showbalance();
			s2.showbalance();
			
			s1.calculateMonthlyInterest();
			s2.calculateMonthlyInterest();
			s1.showbalance();
			s2.showbalance();
			
			SavingAccount.modifyInterestRate(5);
			
			s1.calculateMonthlyInterest();
			s2.calculateMonthlyInterest();
			s1.showbalance();
			s2.showbalance(); 
			
		}
	}

