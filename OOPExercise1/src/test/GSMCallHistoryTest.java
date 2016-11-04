package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import source.Battery;
import source.Battery.BatteryType;
import source.Call;
import source.Display;
import source.GSM;

public class GSMCallHistoryTest {
	
	private GSM gsm;
	private Battery battery;
	private Display display;
	private Call call;

	@Before
	public void setUp() throws Exception {
		battery = new Battery("batteryModel_1", "10000", "20000", BatteryType.NiCd);
		display = new Display("displayModel_1", 65000);
		List<Call> historyCall = new ArrayList<Call>();
		call = new Call("1/11/2016", "12:00", "123456789", 4000);
		historyCall.add(call);
		call = new Call("2/11/2016", "5:30", "123456789", 530);
		historyCall.add(call);
		gsm = new GSM("GSMmodel_1", "Google", 1000, "me", battery, display, historyCall);
	}

	@Test
	public void testCalculatePriceOfHistoryCall() {
		double expected = 0;
		for (Call call : gsm.getHistoryCall()) {
			expected += call.calculatePriceOfCall();
		}
		assertTrue(expected == gsm.calculatePriceOfHistoryCall());
	}
	
	@Test
	public void testAddCall(){
		call = new Call("2/11/2016", "15:00", "123456789", 4500);
		assertTrue(gsm.addCall(call));
	}
	
	@Test
	public void testDeleteCall(){
		assertTrue(gsm.deleteCall(call)); 
	}
	
	@Test
	public void testDeleteLongestCall(){
		assertTrue(gsm.deleteLongestCall());
	}

}
