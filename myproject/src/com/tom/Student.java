package com.tom;

public class Student {
			
		String name;
	    int english;
	    int math;
	    
	    public Student(String name, int english, int math) {
	    	this.name = name;
	    	this.english = english;
	    	this.math= math;
	   }
	    
	    public void print() {
	    	
	    	System.out.println(name + "\t "+ english + "\t" + math +"\t"
	    			+getA()+"\t");
	     
	    if((english+math)/2<60){
	    System.out.println("FALED" );
	    }
	    else {
	    System.out.println("PASS");}
	    }
         public int getA(){
        	return(english+math)/2;
       	}
         public char getA(){
         char granding = 'F';
         int average = getA();
         switch average/10  
         case 10:
         case 9:	 
        	 }
    	
    }
      
         
}


