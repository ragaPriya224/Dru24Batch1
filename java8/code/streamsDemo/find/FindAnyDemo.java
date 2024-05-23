package java8.day4.find;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("gourav","riya","Shubham","sourav","Adithi");
		
		//return any element from the current stream 
		Optional<String> result = stream
					.filter(name -> Character.isUpperCase(name.charAt(0))).sorted().findFirst();
		System.out.println(result.get());
		
	}

}
