package com.tirmizee;

public class App {
	
    public static void main(String...args) {
    	System.out.println("Key = Value");
	    for (String arg : args) {
			String[] parameter = arg.split(":");
			if (parameter.length == 2) {
				System.out.println(parameter[0] + " = " + parameter[1]);
			}
		}
        System.out.println( "End Task" );
    }

}
