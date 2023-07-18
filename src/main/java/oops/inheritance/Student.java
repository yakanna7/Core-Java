package oops.inheritance;

class Student extends Person
{
   private int htno;
   private String course;
   
   Student(String name,String gender, String add,int htno,String course )
   {
	   super(name,gender,add);
	  
	  this.htno=htno;
	 
	  this.course = course;
  }

    
   
   public int getHtno() {
		return htno;
	}

	public void setHtno(int htno) {
		this.htno = htno;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public static void main(String args[])
	{
		Student s = new Student("Shiva","Male","Kphb",1234,"B.Tech");
		
     	System.out.println("Name is "+s.getName());
        System.out.println("Gender is "+s.getGender());
        System.out.println("Address is "+s.getAdd());
        System.out.println("Rno is "+s.getHtno());
        System.out.println("Course is "+s.getCourse());
	}
 }

