package test;

public class AnnualSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int CarInsurance = 370+170;
		int HealthInsurancePlusCollege = 1400+170;
		int aptFees = 650;
		int perHour = 90 ;
		int interestRate = 16;
		int insource = perHour * 160 *(100-interestRate)/100 ;
		int trainFee = 150;
		int MonthlyFoodAndExpense = 500;
		int LoanPaymentMonthly = 800;
		int save = insource - (CarInsurance + HealthInsurancePlusCollege + aptFees + trainFee + MonthlyFoodAndExpense + LoanPaymentMonthly);

		System.out.print("Salary = "+ insource + " yearly Salary = " +insource * 12 +" Saved money = " + save + ", In year = " +  save *12);


	}

}
