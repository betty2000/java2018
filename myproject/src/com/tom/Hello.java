package com.tom;

import java.util.Scanner;

public class Hello{
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);	
		
		
			

		Student stu = new Student("Betty", 70, 90);
		stu.print();
		
		System.out.println(3>=5);
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		
		
		
				
	}			
				
				
				
	Person p = new Person(52f,1.63f);
//	p.weight = 52.5f;
//	p.height = 1.63f;
	System.out.println(p.bmi());
	p.hello();
//	person hank = new Person();
//	Person jack=null;
//	jack.hello();
	
	/*System.out.println( "Hello world");
	int age = 18;
	String name="Betty";
	float weight = 52.3f;
	float height = 1.63f;
	int schoolyears=107;
	
	System.out.println(name);
	System.out.println( "age");
	System.out.println( "weight");
	System.out.println( "height");
	System.out.println(schoolyears);*/
}
					
	