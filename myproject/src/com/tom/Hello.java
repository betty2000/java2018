package com.tom;

public class Hello{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("Betty", 70, 90);
		String name="Betty";
		int english=80;
		int math=70;
		System.out.println(name + "\t" + english + "\t" + math +  "\t" + (math+english)/2);
		System.out.println(3>=5);
		String s1 =new String("abc");
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
					
	