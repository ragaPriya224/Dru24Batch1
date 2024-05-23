package java8.day4.match;

import java.util.stream.Stream;

public class NoneMatchDemo {

	public static void main(String[] args) {
		
		//creating stream of strings 
		Stream<String> stream = Stream.of("adithi","Gourav","shubham");
		
		boolean answer = stream.noneMatch(name -> Character.isUpperCase(name.charAt(0)));
		
		System.out.println(answer);

	}

}
