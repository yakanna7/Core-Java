//Overriding equals and hashCode methods
package packages.java.util.listinterface;

class Employ 
{
	private int id;
	private String name;
	private String gender;
	private double salary;

	public Employ(int id, String name, String gender, double salary )
	{
		this.id     = id;
		this.name   = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + getId();
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (this.getClass() != o.getClass()) {
			return false;
		}

		Employ e = (Employ)o;
		return (this.getId() == e.getId());
	}
}

class ArrayList15
{
     public static void main(String args[])
     {
    	 Employ emp1 = new Employ(1100,"Kranthi","Male",20000);
    	 Employ emp2 = new Employ(1100,"Ramesh","Male",30000);
    	 
    	 System.out.println("Is emp1 == emp2? "+emp1.equals(emp2));
    	 System.out.println(emp1.hashCode());
    	 System.out.println(emp2.hashCode());
     }
}
