package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class firstgit {
	public static void main(String[] args) {
		List <String>asList=Arrays.asList("india","pakistan","iceland","finland","swizerland");
		
		asList.stream().sorted().map(a -> a.toUpperCase()).filter(a -> a.contains("LAND")).forEach(System.out::println);
//		asList.stream().sorted().map(abc-> abc.toUpperCase()).forEach(System.out::println);
		System.out.println("\n khkljfiogjuh ");
		asList.parallelStream().sorted().filter(a -> a.startsWith("i")).map(a -> a.toUpperCase()).forEach(System.out::println);
		
	}

}
