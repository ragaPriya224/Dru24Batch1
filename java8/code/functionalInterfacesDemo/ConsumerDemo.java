package java8.day2;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
	// to convert the given string to upper case 
		Consumer<String> consumer = (name) -> System.out.println(name.toUpperCase());
//		left hand : FUNCTIONAL INTERFACE - interface with type of input to the operation
		//right hand: lambda expression to convert to uppercase
//		consumer.accept("hello");
		
		
		Consumer<String> consumerDemo = (name) -> System.out.println(name.length());
//		consumerDemo.accept("team");
		
//		consumer.andThen(consumerDemo).accept("team");
		
		Consumer<Integer> consumerInteger = (mark) -> System.out.println(mark+10);
//		consumerInteger.accept(20);
		Consumer<Integer> consumerIntegerDemo = (mark) -> System.out.println(mark-10);
//		consumerIntegerDemo.accept(20);
		
		consumerInteger.andThen(consumerIntegerDemo).accept(100);  //valid 
//		consumerInteger.andThen(consumerIntegerDemo).accept("hello"); //not valid
//		consumer.andThen(consumerIntegerDemo).accept(100);  //not valid 
		
		
		
	}

}
