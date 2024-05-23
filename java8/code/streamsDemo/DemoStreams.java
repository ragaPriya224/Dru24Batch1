package java8.day4;

import java.util.Arrays;
import java.util.List;

public class DemoStreams {

	public static void main(String[] args) {

		//arraylist
		List<Integer> numberList = Arrays.asList(10,20,30,40);
		
		//sequential stream
		numberList.stream().forEach(number ->
			System.out.println( number + " " +Thread.currentThread().getName()));

	}

}
//output:
//10 main
//20 main
//30 main
//40 main
//single thread to process 
