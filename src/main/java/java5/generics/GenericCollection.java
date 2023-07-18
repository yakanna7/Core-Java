package java5.generics;

class GenericCollection<T> {

 
    T[] list;
    int index = -1;
    int size = -1;
    @SuppressWarnings("unchecked")
	public GenericCollection(int size)
    {
         this.size = size;
    	 list = (T[])new Object[size];
    }

    public void add(T element)
    {
        index++;
        if (index == size)
        {
            System.out.println("List is full");
            index--;
        }
        else
        {
            list[index] = element;
        }
    }

    public void display()
    {
        System.out.println("Elements in List are");
        for(T val : list)
        {
            System.out.println(val);
        }
    }
    
	public static void main(String[] args) {
		
		GenericCollection<String> list1 = new GenericCollection<String>(3);

        list1.add("Manoj");
        list1.add("Yakanna");
        list1.add("Sateesh");


        GenericCollection<Integer> list2 = new GenericCollection<Integer>(3);

        list2.add(10);
        list2.add(20);
        list2.add(30);
       

        list1.display();
        list2.display();
		
	}

}
