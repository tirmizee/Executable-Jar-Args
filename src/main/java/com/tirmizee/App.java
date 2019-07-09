package com.tirmizee;

public class App {
	
	private static String arg1;
	private static String arg2;
	private static String arg3;
	private static String arg4;
	private static String arg5;
	
    public static void main(String...args) {
    	System.out.println("Send...");
    	System.out.println("Key = Value");
	    
    	for (String arg : args) {
			String[] parameter = arg.split(":");
			if (parameter.length == 2) {
				System.out.println(parameter[0] + " = " + parameter[1]);
				switch (parameter[0]) {
					case "arg1" : arg1 = parameter[1]; break;
					case "arg2" : arg2 = parameter[1]; break;
					case "arg3" : arg3 = parameter[1]; break;
					case "arg4" : arg4 = parameter[1]; break;
					case "arg5" : arg5 = parameter[1]; break;
				}
			}
		}
	    
    	System.out.println("Parameter...");
		System.out.println("arg1 = " + arg1);
		System.out.println("arg2 = " + arg2);
		System.out.println("arg3 = " + arg3);
		System.out.println("arg4 = " + arg4);
		System.out.println("arg5 = " + arg5);
        System.out.println( "End Task" );
    }

}
