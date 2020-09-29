package TestCode;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

import TestCode.ParkingDataBase;
import TestCode.ManageParking;

public class ManageParkingTest {
	
	ManageParking object;
	ParkingDataBase pr;

	@Before
	public void setUp() throws Exception {
		//pr = Mockito.mock(ParkingDataBase.class);
		//object = new ManageParking (pr);
		object = new ManageParking();
		
	}

	@Test
	public void testgetRevenue () {
		assertEquals(2400, object.getRevenue(3,800));
	}
	
	@Test
	public void testgetNetIncome() {
		assertEquals(4300, object.getNetIncome(5337,1037),0);
	}
	
	@Test
	public void testgetNetProfit() {
		assertEquals(2893, object.getNetProfit(5393,394,1137,188,300,481));
	}
	
	@Test
	public void testgetGrossProfit () {
		assertEquals(3635, object.getGrossProfit(4733,1098));
	}
	
	@Test
	public void testGetTax() {
		assertEquals(379.5,object.getTax(3450), 0);
	}
	
	@Test
	public void testcalculateROI() {
		assertEquals(0.3868,object.calculateROI(5270,3800), 5);
	}
	
	@Test
	public void testcalculatePV() {
		assertEquals(12, object.calculatePV(100,1,3),5);
	}
	
	@Test
	public void testcalculateNPV() {
		when(pr.getPVTotalProfit()).thenReturn(5790);
		when(pr.getPVTotalCost()).thenReturn(2650);
	}

}

