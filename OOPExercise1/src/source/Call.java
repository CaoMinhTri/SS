package source;

public class Call {
	private String date;
	private String time;
	private String dialedPhoneNumber;
	private long second;

	public Call(String date, String time, String dialedPhoneNumber, long second) {
		super();
		this.date = date;
		this.time = time;
		this.dialedPhoneNumber = dialedPhoneNumber;
		this.second = second;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDialedPhoneNumber() {
		return dialedPhoneNumber;
	}

	public void setDialedPhoneNumber(String dialedPhoneNumber) {
		this.dialedPhoneNumber = dialedPhoneNumber;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}
	
	public double calculatePriceOfCall(){
		if(this.getSecond()%60 == 0){
			return this.getSecond()/60 * 0.37;
		}
		return (this.getSecond()/60 + 1) * 0.37;
	}


	@Override
	public String toString() {
		return "Call ["+ "date=" + date + ", time=" + time + ", dialedPhoneNumber=" + dialedPhoneNumber
				+ ", second=" + second + "]";
	}

}
