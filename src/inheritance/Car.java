package inheritance;

public class Car extends Honda {

	String name,veh_num;
	public Car() {
		System.out.println("child const..");
	}
	public Car(String name, String veh_num) {
		super.display();
		this.name=name;
		this.veh_num=veh_num;
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		Car c1=new Car("Activa","TS2333");
		c.display();

	}

}
