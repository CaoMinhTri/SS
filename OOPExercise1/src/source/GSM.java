package source;

import java.util.ArrayList;
import java.util.List;

import source.Battery.BatteryType;

public class GSM {

	private static String kindOfPhone = "IPHONE4S";
	private String model;
	private String manufacturer;
	private double price;
	private String owner;
	private Battery battery;
	private Display display;
	private List<Call> historyCall;

	public GSM() {

	}

	public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display,
			List<Call> historyCall) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.battery = battery;
		this.display = display;
		this.historyCall = historyCall;
	}

	public static String getKindOfPhone() {
		return kindOfPhone;
	}

	public static void setKindOfPhone(String kindOfPhone) {
		GSM.kindOfPhone = kindOfPhone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public List<Call> getHistoryCall() {
		return historyCall;
	}

	public void setHistoryCall(List<Call> historyCall) {
		this.historyCall = historyCall;
	}

	public boolean addCall(Call call) {
		try {
			this.getHistoryCall().add(call);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

	public boolean deleteCall(Call call) {
		try {
			return this.getHistoryCall().remove(call);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean deleteLongestCall() {
		try {
			Call callLongestTime = this.getHistoryCall().get(0);
			for (Call call : historyCall) {
				if (call.getSecond() > callLongestTime.getSecond()) {
					callLongestTime = call;
				}
			}
			return this.getHistoryCall().remove(callLongestTime);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public double calculatePriceOfHistoryCall() {
		double totalPrice = 0;
		for (Call call : historyCall) {
			totalPrice += call.calculatePriceOfCall();
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		return "GSM" + "\n model=" + model + "\n manufacturer=" + manufacturer + "\n price=" + price + "\n owner="
				+ owner + "\n battery=" + battery.toString() + "\n display=" + display.toString() + "\n historyCall="
				+ "\n" + historyCall.toString();

	}

	public static void main(String[] args) {
		Battery battery = new Battery("batteryModel_1", "10000", "20000", BatteryType.NiCd);
		Display display = new Display("displayModel_1", 65000);
		List<Call> historyCall = new ArrayList<Call>();
		Call call = new Call("1/11/2016", "12:00", "123456789", 4000);
		historyCall.add(call);
		call = new Call("2/11/2016", "5:30", "123456789", 530);
		historyCall.add(call);
		GSM gsm = new GSM("GSMmodel_1", "Google", 1000, "me", battery, display, historyCall);
		System.out.println(gsm.toString());
		System.out.println("Total price:" + gsm.calculatePriceOfHistoryCall());
		gsm.deleteLongestCall();
		System.out.println(gsm.toString());
	}

}
