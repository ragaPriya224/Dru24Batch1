package java8.day4;

import java.util.Arrays;
import java.util.List;

public class DemoParallelStream {

	public static void main(String[] args) {

		//arraylist
		List<Integer> numberList = Arrays.asList(10,20,30,40);
		
		//parallelStream 
		numberList.parallelStream().forEach(number ->
			System.out.println( number + " " +Thread.currentThread().getName()));

	}

}
//output:
//cannot predict the order 
// multiple threads 
