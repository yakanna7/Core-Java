package oops.polymorphism.overriding;

abstract class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	
	public Employee(int id, String firstName, String lastName, String gender)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFullName()
	{
		return firstName+" "+lastName;
	}
	
	public abstract double getMonthlySalary();
}

class FullTimeEmployee extends Employee
{
	private double annualSalary;
	
	public FullTimeEmployee(int id, String firstName, String lastName, String gender, double annualSalary)
	{
		super(id,firstName,lastName,gender);
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public double getMonthlySalary()
	{
		return annualSalary/12;
	}
	
}

class PartTimeEmployee extends Employee
{
	private double hourlyPay;
	private double totalWorkHours;
	
	public PartTimeEmployee(int id, String firstName, String lastName, String gender, double hourlyPay, double totalWorkHours)
	{
		super(id,firstName,lastName,gender);
		this.hourlyPay = hourlyPay;
		this.totalWorkHours = totalWorkHours;
	}
	public double getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(float hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	public double getTotalWorkHours() {
		return totalWorkHours;
	}
	public void setTotalWorkHours(float totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}
	
	public double  getMonthlySalary()
	{
		return totalWorkHours*hourlyPay;
	}
	
}

class AbstractTest {
	
	public static void main(String args[])
	{
		Employee emp = new FullTimeEmployee(100,"Shive","B","Male",500000);
		
	    System.out.println("Full time employee details are:");
	    System.out.println("Employee id is "+emp.getId());
		System.out.println("Full name is "+emp.getFullName());
		System.out.println("Gender is "+emp.getGender());
	    System.out.println("Monthly salary is "+emp.getMonthlySalary());
	    
	    emp = new PartTimeEmployee(101,"Ravi","V","Male",70, 200);
	
		System.out.println(("\nPart time employee details are:"));
		System.out.println("Employee id is "+emp.getId());
		System.out.println("Full name is "+emp.getFullName());
		System.out.println("Gender is "+emp.getGender());
		System.out.println("Monthly salary is "+emp.getMonthlySalary());
	}
}



