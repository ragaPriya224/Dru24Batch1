package practice.java8Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import practice.data.Person;
import practice.data.PersonRepository;

public class StreamDemo {

	public static void main(String[] args) {
		//		syntax: SOURCE. STREAMINSTANCE . OPERATIONS 
		List<Person> personList = 	PersonRepository.getAllPersons();

		// filter : intermediate operation
		List<Person> outputList = personList.stream()
				.filter(s -> s.getName().startsWith("A"))
				.skip(1)
				.collect(Collectors.toList());
		System.out.println(outputList);

		//skip -> skip the elements
		List<Person> dataList = personList.stream()
				.filter(s -> s.getName().startsWith("A"))
				.skip(1)
				.collect(Collectors.toList());
		System.out.println(dataList);

		//limit -> restrict the number of elements
		List<Person> dataListUsingLimit = personList.stream()
				.filter(s -> s.getName().startsWith("A"))
				.skip(1)
				.collect(Collectors.toList());
		System.out.println(dataListUsingLimit);

		//map -> for manipulation, to get subset of elements
		List<String> output = personList.stream()
				.map(Person::getName)
				.collect(Collectors.toList());
		System.out.println(output);


		//using java7 : to convert to uppercase
		List<String> nameList = Arrays.asList("meghna","dhruv","anushya",
				"uma","anuhya","venkat","uma","anuhya");
		List<String> modifiedList = new ArrayList();

		for(String s:nameList) {
			modifiedList.add(s.toUpperCase());
		}
		System.out.println(modifiedList);

		//using java8 : to convert to uppercase
		List<String> java8List =nameList.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(java8List);

		//distinct : to have unique elements alone
		List<String> disList =nameList.stream()
				.distinct()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(disList);
		//foreach : terminal operation 
		nameList.stream().forEach(System.out::println);

		//sorted list
			// TODO Auto-generated method stub
		List<String> cityList = Arrays.asList("Gurgaon" , "NewDelhi" , "Mumbai","tokyo","berlin","bombay");

		//length>5
		List<String> sortedList = cityList.stream().filter(name -> name.length()>5).sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		
	}

}
