package interfaces;

public class Home extends Decortion {
	
	

	@Override
	public void flowers() {
		System.out.println("flowers");
		
	}

	@Override
	public void paint() {
		System.out.println("painting home");
		
	}

	public static void main(String[] args) {
		
		Decortion d=new Home();
		d.flowers();
		d.paint();

	}


}
