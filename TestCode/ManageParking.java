package TestCode;

public class ManageParking {
	
	ParkingDataBase pr;
	public ManageParking(ParkingDataBase prDataBase) {
			
	pr = prDataBase;
			
	}

	public int getRevenue (int customer, int service) {
		return customer * service;

	}
	
    public double getNetIncome (int myRevenue, int myExpenses){
		
		return myRevenue - myExpenses;
	}
    
    public int getNetProfit (int grossProfit, int expenses, int interest, int tax, int amortization, int depreciation){
		
		int myNetProfit = grossProfit - (expenses + interest + tax + amortization + depreciation);
		return myNetProfit;
	}
    
    public int getGrossProfit (int totalSale, int costOfGoods) {
		return totalSale - costOfGoods;

	}
	
    public double getTax (int totalIncome){
		
		double myTax = totalIncome*(.11);
		return myTax;
	}
    
    public double calculateROI (int totalBenefit, int totalCost){
		
		double myROI = (totalBenefit - totalCost)/totalCost;
		return myROI;
	}
    
    public double calculatePV (int cashFlow, int interestRate, int time){
		
		double myPV = cashFlow/((1 + interestRate)*time);
		return myPV;
	}
    
    public double calculateNPV (int netProfit, int netCost){
    	netProfit = pr.getPVTotalProfit();
    	netCost = pr.getPVTotalCost();
		double myNPV = netProfit + netCost;
		return myNPV;
	}
    
	

}

