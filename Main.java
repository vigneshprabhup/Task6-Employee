package Task6;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the employee details");
		System.out.println("Please enter the name : ");
		
		e1.name=scan.nextLine();
	
		
		System.out.println("Please enter the year of joining : ");
		e1.yearofjoining= scan.nextInt();
		
		System.out.println("Please enter the address");
		e1.address= scan.next()+scan.nextLine();
		
		System.out.println("Please enter the employee details");
		System.out.println("Please enter the name : ");
		
         e2.name=scan.next()+ scan.nextLine();
		
		
		System.out.println("Please enter the year of joining : ");
		e2.yearofjoining= scan.nextInt();
		
		System.out.println("Please enter the address");
		e2.address= scan.next()+ scan.nextLine();
		
		
//////////////////////
		
		System.out.println("Please enter the employee details");
		System.out.println("Please enter the name : ");
		
		
	
		e3.name=scan.next()+ scan.nextLine();
		
		
		System.out.println("Please enter the year of joining : ");
		e3.yearofjoining= scan.nextInt();
		
		System.out.println("Please enter the address");
		e3.address= scan.next()+scan.nextLine();
		
////////////////////////		
//		
	System.out.println(e1.toString());
//		System.out.println(e2.toString());
//		System.out.println(e3.toString());
		
		
		
	}

}
