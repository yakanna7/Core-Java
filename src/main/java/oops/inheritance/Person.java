package oops.inheritance;

class Person {
	
    private String name;
    private String gender;
    private String add;
    
    Person(String name,String gender,String add)
    {
    	this.name=name;
    	this.gender=gender;
    	this.add=add;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
 }
