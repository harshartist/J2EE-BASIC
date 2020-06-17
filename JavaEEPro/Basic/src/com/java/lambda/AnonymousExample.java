package com.java.lambda;

import java.io.File;
import java.io.FileFilter;

public class AnonymousExample 

{
/*  (A)First way of implementing an interface is to use implements keyword 
	right after the class and providing the body for it's method
	
	(B)second way is to use an anonymous class as we are doing in the following code
	
  FileFilter filefill = new FileFilter()
		  
	{
	
		@Override
		public boolean accept(File file) {
			return file.getName().endsWith(".java");
		}	}
		
	(C)We have a new and an amazing way of implementing or providing implementation to a
		functional interface and that is by using lambda expression 
		Ex:-
 */
	 FileFilter filefill = (File file) -> file.getName().endsWith(".java");
	

	
	
	
}
