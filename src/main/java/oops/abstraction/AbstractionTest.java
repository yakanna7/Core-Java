//Java Abstract Class example program
package oops.abstraction;

class AbstractionTest 
{
	public static void main(String args[]) 
	{
		Employee emp = new FullTimeEmployee(100, "Shiva", "A", "Male", 300000);

		System.out.println("Full time employee details are");
		System.out.println("Employee Id is " + emp.getId());
		System.out.println("Full name is " + emp.getFullName());
		System.out.println("Gender is " + emp.getGender());
		System.out.println("Monthly Salary " + emp.getMonthlySalary());

		emp = new PartTimeEmployee(101, "Vinod", "B", "Male", 50, 150);
		System.out.println("\nPart time employee details are");
		System.out.println("Employee Id is " + emp.getId());
		System.out.println("Full name is " + emp.getFullName());
		System.out.println("Gender is " + emp.getGender());
		System.out.println("Monthly Salary " + emp.getMonthlySalary());
	}
}
