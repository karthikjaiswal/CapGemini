package serialize;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class Time extends Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1);
		
		Date d2=new Date(2323223232L);
		System.currentTimeMillis();
		System.out.println(d2);
		
		System.out.println(d2.compareTo(d1));
		System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		
		
	}
}
