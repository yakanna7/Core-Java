package oops.abstraction;

class PartTimeEmployee extends Employee
{
	private double hourlyPay;
	private double totalWorkHours;

	public PartTimeEmployee(int id, String firstName, String lastName,
			String gender, double hourlyPay, double totalWorkHours) {
		super(id, firstName, lastName, gender);
		this.hourlyPay = hourlyPay;
		this.totalWorkHours = totalWorkHours;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public void setTotalWorkHours(double totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}

	public double getMonthlySalary() {
		return hourlyPay * totalWorkHours;
	}
}

