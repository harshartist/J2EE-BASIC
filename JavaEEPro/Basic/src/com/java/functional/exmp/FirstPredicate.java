package com.java.functional.exmp;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {
	
	public static void main(String[] args) {
		Stream<String> stream= Stream.of("Filteration","Foundation","DoesntBelong","Nation","Optimazation","Frustration");
	
	Predicate<String> p1= s-> s.length()>10;
	Predicate<String> p2= Predicate.isEqual("Nation");
	Predicate<String> p3= Predicate.isEqual("DoesntBelong");	
		
	stream
	.filter(p2.or(p3))
	.forEach(s->System.out.println(s));	
	}
}
