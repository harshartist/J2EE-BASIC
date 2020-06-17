package com.java.functional.exmp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,8,7,70);
		
		Optional<Integer> red=
		list.stream()
//				.reduce(0, Integer::sum);
				.reduce(Integer::min);
		
		System.out.println("red = "+red);
		
	}
}
