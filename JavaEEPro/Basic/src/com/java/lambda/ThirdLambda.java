package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ThirdLambda {
	public static void main(String[] args) {
		
//		
//		Comparator<String> comp= new Comparator<String>() {
//			
//			@Override
//			public int compare(String s1, String s2) {
//				return Integer.compare(s1.length(),s2.length());
//				}
//			};
//			
//			
			Comparator<String> lambdaComp=(String s1, String s2) ->
			Integer.compare(s1.length(),s2.length());
			
			List<String> myList = Arrays.asList("Harshit","Arushi","Utti","Kaddu","Bhaiiiyaaajiiii");
			Collections.sort(myList,lambdaComp);
			
			for(String s :myList) {
				System.out.println(s);
				
			}
		
		
	}

}
