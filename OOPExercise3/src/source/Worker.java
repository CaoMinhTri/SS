package source;

public class Worker extends Human implements Comparable<Worker>{
	
	private double weekSalary;
	private double workHoursPerDay;
	
	public Worker(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	
	public Worker(String firstName, String lastName, int weekSalary, int workHoursPerDay) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
		this.weekSalary = weekSalary;
		this.workHoursPerDay = workHoursPerDay;
	}
	
	public double calculateMoneyPerHour(){
		return  this.weekSalary / 5 / this.workHoursPerDay;
	}

	@Override
	public String toString() {
		return "Worker [weekSalary=" + weekSalary + ", workHoursPerDay=" + workHoursPerDay + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(Worker o) {
		// TODO Auto-generated method stub
		return (int) (o.calculateMoneyPerHour() - this.calculateMoneyPerHour());
	}
}
