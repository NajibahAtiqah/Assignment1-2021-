package Assignment_1;

public class Finance {
	private double otherExpenses, eventExpenses, sponsorShip, fee;
	private int participant;
	private double totalDonation;
	private double totalFundCollected;
	
	public Finance(double otherExpenses,double eventExpenses, double sponsorShip,double fee, int participant) {
		this.otherExpenses = otherExpenses;
		this.eventExpenses = eventExpenses;
		this.sponsorShip = sponsorShip;
		this.fee = fee;
		this.participant =  participant;
	}
	
	public double calTotalDonation(double fee, int participant, double sponsorShip) {//3 arguments
		totalDonation = (fee*participant)+sponsorShip;
		return totalDonation;
	}
	public double calTotalFundCollected(double fee, int participant) {//2 argument
		totalFundCollected = fee*participant;
		return totalFundCollected;
	}
	
	public double calTotalMonthlyExpense(double otherExpense) {//1 argument
		return otherExpense*30;
	}
	
	public double calTotalExpense() {//no argument
		return otherExpenses+eventExpenses;
		
	}
	
	public double calTotalBalance() {
		return calTotalDonation(fee, participant, sponsorShip)-calTotalExpense();
	}
	
	public void FinancialSatement() {
		System.out.println("-----------------------CAHAYA CANCER ASSOCIATION FINANCIAL STATEMENT---------------------");
		System.out.printf("%-20s       : RM%.2f%n", "Total Fund Collected from Event", calTotalFundCollected(fee, participant));
		System.out.printf("%-20s                  : RM%.2f%n", "Total Sponsorship", sponsorShip);
		System.out.printf("%-20s: RM%.2f%n", "Total Other Expense (bill, food, ads) ", otherExpenses);
		System.out.printf("%-20s                  : RM%.2f%n", "Total Event Expense", eventExpenses);
		System.out.printf("%-20s                  : RM%.2f%n", "Total Expenses", calTotalExpense());
		System.out.printf("%-20s              : RM%.2f%n", "Total Donation Collected", calTotalDonation(fee, participant, sponsorShip));
		System.out.printf("%-20s                 : RM%.2f%n", "Total Monthly Expense", calTotalMonthlyExpense(otherExpenses));
		System.out.printf("%-20s                  : RM%.2f%n%n", "Total Balance", calTotalBalance());
	}
}
