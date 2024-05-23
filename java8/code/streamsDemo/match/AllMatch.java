package java8.day4.match;

import java.util.stream.Stream;

public class AllMatch {

	public static void main(String[] args) {
		
		//creating stream of strings 
		Stream<String> stream = Stream.of("Adithi","Shubham");
		
		boolean answer = stream.allMatch(name -> Character.isUpperCase(name.charAt(0)));
		
		System.out.println(answer);

	}

}
