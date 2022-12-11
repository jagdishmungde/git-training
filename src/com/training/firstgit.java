package com.training;

import java.util.Arrays;
import java.util.List;

public class firstgit {
	public static void main(String[] args) {
		List <String>asList=Arrays.asList("India","pakistan","iceland","finland","swizerland");
		
		asList.stream().sorted().map(a -> a.toUpperCase()).filter(a -> a.contains("LAND")).forEach(System.out::println);
//		asList.stream().sorted().map(abc-> abc.toUpperCase()).forEach(System.out::println);
	}

}
