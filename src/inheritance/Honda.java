package inheritance;

public class Honda {
	
	String name;
	String veh_num;
	 
	Honda()
	{
		System.out.println("parent const..");
	}
	
	public void display()
	{
		System.out.println("the vehicle name:"+ name);
		System.out.println("the vehicle number:"+veh_num);
	}

}
