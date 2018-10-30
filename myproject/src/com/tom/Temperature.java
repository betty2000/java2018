package com.tom;

public class Temperature {
	    double celsius;
		
		public Temperature( double celsius){
			this.celsius = celsius;
		}
		
			public double fehrenheit(){
				double f= celsius * (9/5.0)+32;
				return f; 
				
		
		}

	}

