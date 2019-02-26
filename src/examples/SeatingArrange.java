package examples;

public class SeatingArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seatingArrangement(100);
	}

	private static void seatingArrangement(int n) {
		int s=n%12;
		switch(s)
		{
		case 0:System.out.println("seat number"+(n-11)+"WS");
		break;
		case 1:System.out.println("seat number"+(n+9)+"WS");
		break;
		case 2:System.out.println("seat number"+(n+7)+"WS");
		break;
		case 3:System.out.println("seat number"+(n+5)+"WS");
		break;
		case 4:System.out.println("seat number"+(n+3)+"WS");
		break;
		case 5:System.out.println("seat number"+(n+1)+"WS");
		break;
		case 6:System.out.println("seat number"+(n-11)+"WS");
		break;
		case 7:System.out.println("seat number"+(n-11)+"WS");
		break;
		case 8:System.out.println("seat number"+(n-11)+"WS");
		break;
		case 9:System.out.println("seat number"+(n-11)+"WS");
		break;
		case 10 :System.out.println("seat number"+(n-11)+"WS");
		break;
		case 11:System.out.println("seat number"+(n-11)+"WS");
		break;
		
		}
	}

}
