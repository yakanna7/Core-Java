// multilevel inheritance
package oops.inheritance;
class Faculty extends Employee
 {

     private String subject;
     private String dept;
    Faculty(String name,String gender,String add,int id,float sal,String subject,String dept)
    {
         super( name, gender,add, id, sal);
	     this.subject = subject;
	     this.dept =dept;
     }

      public void setSubject(String subject)
      {
    	  this.subject = subject;
      }
      
      public String getSubject()
      {
    	  return subject;
      }
      
      public void setDept(String dept)
      {
    	  this.dept = dept;
      }
      
      public String getDept()
      {
    	  return dept;
      }
          
  
 
  public static void main(String args[])
  {
    
       Faculty f=new Faculty("Shiva","Male","Kphb",46576,20000.0f,"Java","Computer");
       System.out.println("Name is "+f.getName());
       System.out.println("Gender is "+f.getGender());
       System.out.println("Address is "+f.getAdd());
       System.out.println("Id is "+f.getId());
       System.out.println("Salary is "+f.getSal());
       System.out.println("Subject is "+f.getSubject());
       System.out.println("Department is "+f.getDept());
  }

  
}

  
       
       