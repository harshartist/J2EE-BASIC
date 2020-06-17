package com.java.functional.exmp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndfinal {
	
	
	public static void main(String[] args) {
		Stream<String> stream= Stream.of("Filteration","Foundation","DoesntBelong","Nation","Optimazation","Frustration");
		
		Predicate<String> p1= Predicate.isEqual("Nation");
		Predicate<String> p2= Predicate.isEqual("Foundation");
		
		List<String> list =new ArrayList<>();
		
		stream
		.peek(System.out::println)
		.filter(p1.or(p2))	
		
//		.peek is an intermediary operation
//		This wont triggered the processing of data
//		.peek(list::add);
		
//		.forEach is a final operation 		
//		This will trigger the processing of data
		.forEach(list::add);
		
		System.out.println("done");
		System.out.println("size "+list.size());
		
	}
}
