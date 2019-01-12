package com.traineeatjava.ltiday5;

public class WrapperClasses {

	public static void main(String[] args) {
		int x = 10;
		
		Integer y = 20;      //Autoboxing
		
		Integer z = new Integer(30); 
		System.out.println("x = " + x +", " + "y = " + y + ", " +  "z = " + z);
		
		Integer a = 50; //Creates an object
		a = 60; //Creates another object
		
//		int c = null; //Primitive data type cannot store null value
	    Integer d = null; //Wrapper class object can store null value	
		
	    //Some places in Java, primitive not supported,
	    //Collections like ArrayList, LinkedList and others
	    //Then we end up using wrapper classes instead of primitives
	    
	    //Converting int to Integer
	    Integer e = 10; //now Integer(10);
	    //Converting Integer to int
	    int f = e; //e.intValue();
	    //Converting String to Integer
	    Integer g = new Integer("100");
	    //Converting Integer to String
	    String h = g.toString();
	    //Converting String to Integer
	    int i = Integer.parseInt("100");
	    //Converting int to String
	    String j = Integer.toString(100);
	    
	    //TODO: Try this: int->String->float->Double->Integer
	    int k = 10;
	    //int to String
	    String l = Integer.toString(k);
	    //String to float
	    float m = Float.parseFloat(l);
	    //float to Double
	    Double n = new Double(m);
	    //Double to Integer;
	    Integer o = n.intValue();
	    
	}
}
