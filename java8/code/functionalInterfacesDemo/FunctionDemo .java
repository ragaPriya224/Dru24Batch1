package java8.day2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> functionDemo = name -> name.length();
		System.out.println(functionDemo.apply("hello"));


	}

}
