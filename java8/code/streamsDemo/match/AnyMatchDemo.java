package java8.day4.match;

import java.util.stream.Stream;

//check any element in list having uppercase at 0th index
public class AnyMatchDemo {

	public static void main(String[] args) {
		//creating stream of strings 
		Stream<String> stream = Stream.of("Adithi","gourav","riya","Shubham","sourav");
		
		//checking whether any one elemen matches the condition 
		boolean answer =stream.anyMatch(name -> Character.isUpperCase(name.charAt(0)));
		
		//displaying the result
		System.out.println(answer);
	}

}


//anymatch  -? atleast one element match
//allmatch -> matches all element 
//nonematch ->  none of the elements matches 
