package java8.day4.find;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("Adithi","gourav","riya","Shubham","sourav");
		
		//return any element from the current stream 
		Optional<String> result = stream
					.filter(name -> Character.isUpperCase(name.charAt(0))).findFirst();
		System.out.println(result.get());
		
	}

}
