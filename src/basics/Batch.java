package basics;

public class Batch {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		s1.setName("Raju");
		s1.setRoll(101);
		s1.setFees(1245);
		s1.setCollege("Vjit");
		/*System.out.println( s1.getName());
		System.out.println( s1.getRoll());
	    System.out.println(	s1.getFees());*/
	    
	    
	    Student s2=new Student();
		s2.setName("Teja");
		s2.setRoll(102);
		s2.setFees(1225);
		s2.setCollege("MGIT");
		/*System.out.println( s2.getName());
		System.out.println( s2.getRoll());
	    System.out.println(	s2.getFees());*/
	    
	    Student s3=new Student();
		s3.setName("Ravi");
		s3.setRoll(103);
		s3.setFees(1445);
		s3.setCollege("MGIT");
		/*System.out.println( s3.getName());
		System.out.println( s3.getRoll());
	    System.out.println(	s3.getFees());*/
		System.out.println( s1.getCollege()+"\n");
		System.out.println( s2.getCollege()+"\n");
	    System.out.println( s3.getCollege()+"\n");

	}

}
