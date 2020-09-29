package TestCode;

public class ParkingDataBase {
	
    public int getPVTotalProfit() {
		
		int[] profit = {3230, 1800, 760};
		int totalPVProfit = 0;
		for (int count = 0; count<profit.length; count++) {
			totalPVProfit = totalPVProfit + profit[count];
		}
		return totalPVProfit;
	}
	
	public int getPVTotalCost() {
		
		int[] cost = {1230, 1080, 340};
		int totalPVCost = 0;
		for (int count = 0; count<cost.length; count++) {
			totalPVCost = totalPVCost + cost[count];
		}
		return totalPVCost;
	}

}
