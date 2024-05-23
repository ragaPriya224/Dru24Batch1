package java8.day3.streamCreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {

		//method 1 -> if u have array, call Arrays.stream() to convert array to streams
		Integer[] arr = {3,4,5,6,7};
		Arrays.stream(arr).forEach(x-> System.out.println(x));

		// method 2 -> if u have list collection -,stream(), parallelSteam()
		List<Integer> dataList = Arrays.asList(arr);

		// converting list to stream, using stream()
		dataList.stream().forEach(x-> System.out.println(x));

		// converting list to stream, using parallelstream()
		dataList.parallelStream().forEach(x-> System.out.println(x));

		//method 3 
		//if u wanna directly convert numbers to stream without referring array or list 
		Stream.of(3,4,5,6,7).forEach(x->System.out.println(x));

	}

}
