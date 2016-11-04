package source;

public class Battery {
	private String model;
	private String idleHours;
	private String workHours;
	private BatteryType batteryType;
			
	public enum BatteryType{
		LiIon, NiMH, NiCd
	};
	
	public Battery(){
		
	}

	public Battery(String model, String idleHours, String workHours, BatteryType batteryType) {
		super();
		this.model = model;
		this.idleHours = idleHours;
		this.workHours = workHours;
		this.batteryType = batteryType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getIdleHours() {
		return idleHours;
	}

	public void setIdleHours(String idleHours) {
		this.idleHours = idleHours;
	}

	public String getWorkHours() {
		return workHours;
	}

	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}

	public BatteryType getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(BatteryType batteryType) {
		this.batteryType = batteryType;
	}

	@Override
	public String toString() {
		return "Battery [model=" + model + ", idleHours=" + idleHours + ", workHours=" + workHours + ", batteryType="
				+ batteryType + "]";
	}
}
