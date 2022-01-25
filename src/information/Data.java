package information;

import java.util.Scanner;

public class Data {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.next();
		System.out.println("Enter your Age");
		int age=s.nextInt();
		System.out.println("Enter your pnone number:");
		long phno=s.nextLong();
		System.out.println("Enter your salary:");
		float sal=s.nextFloat();
		System.out.println("enter your CTC:");
		double c=s.nextDouble();
		System.out.println("Enter your Gendure:");
		char gen=s.next().charAt(0);
		System.out.println("All the statement is:");
		boolean b=s.hasNext();
		
		
	
		
		System.out.println("name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phnone Number:"+phno);
		System.out.println("Your salary is:"+sal);
		System.out.println("Your CTC is:"+c);
		System.out.println("Your Gendure is:"+gen);
		System.out.println("All the statement is:"+b);
		
		
		
	}

}
