package oops.inheritance;

class Employee extends Person
{
  
   private int id;
   private float sal;
   
  Employee(String name,String gender, String add,int id, float sal)
   {
	   super(name,gender,add);
       this.id = id;
       this.sal = sal;
    }
   
 
   void setId(int id)
   {
	   this.id = id;
   }
   
   int getId()
   {
	   return id;
   }
  void setSal(float sal)
  {
	 this.sal = sal;
  }
  
  float getSal()
  {
	  return sal;
  }
}
