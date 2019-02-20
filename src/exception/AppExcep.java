package exception;

public class AppExcep extends Throwable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=17;
		int arr[]= {12,3,4};
		System.out.println("start");
		try
		{
			//System.out.println(a/0);
			System.out.println(arr[2]);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
		try {
			throw new MyCustomException();
		}
		catch(MyCustomException e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally block2");
		}
		
	
		
		System.out.println("end");
	}

}
