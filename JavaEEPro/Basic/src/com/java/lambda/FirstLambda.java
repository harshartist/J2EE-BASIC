package com.java.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {
		

/*	this is then first approach by using of an anonymous class
		
	FileFilter FF =new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".java");
			}
		};
		
		*/
		
		
		FileFilter firstLambda = (File file)->file.getName().endsWith(".java");
		
		File dir = new File("/home/harshartist/Desktop/temp");
	    File[] files=	dir.listFiles(firstLambda);
	    
	    for(File f :files) {
	    	
	    	System.out.println(f);
	    	
	    	
	    }
	}

}
