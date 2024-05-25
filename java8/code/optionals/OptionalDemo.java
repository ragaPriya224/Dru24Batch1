package practice.java8Demo.Optionals;

import java.util.Optional;

public class OptionalNullableDemo {

	public static void main(String[] args) {
		String[] str = new String[5];
		str[1] = "welcome";
		str[2] = "hello";
		Optional<String> value = Optional.of(str[1]);

		System.out.println(value); //Optional[welcome]
		System.out.println(value.get()); //welcome
		
		Optional<String> value1 = Optional.ofNullable(str[3]);
		System.out.println(value1); // no value is present, so returns empty optional
		if(value1.isEmpty()) {
			System.out.println("***************");
		}
		Optional<String> value2 = Optional.ofNullable(str[2]);
		System.out.println(value2); //value is present , so returns value
    //is present is to check whether a value is present or not
		if(value2.isPresent()) {
			System.out.println("&&&&&&&&&&&&&&&&&&&");
		}
    		Optional<String> value = Optional.of(str[4]); // null pointer exception, bcoz null is returned

		System.out.println(value);
		System.out.println(value.get());

//of -> if value -> returns value
           null  -> returns null
    
//		of nullable -> if value -> returns value
//		                   null  -> returns empty 
	}

}
