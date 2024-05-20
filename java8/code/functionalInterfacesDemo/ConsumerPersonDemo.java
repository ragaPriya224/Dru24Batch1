package java8.day2;

import java.util.List;
import java.util.function.Consumer;

import java8.day2.data.Person;
import java8.day2.data.PersonRepository;

public class ConsumerPersonDemo {

	static Consumer<Person> consumer = (person) -> System.out.println(person);
	static Consumer<Person> nameConsumer = (person) -> System.out.println(person.getName().toUpperCase());

	static List<Person> personList = PersonRepository.getAllPersons();
	public static void main(String[] args) {	
		//		personList.forEach(consumer);
		//		personList.forEach(nameConsumer);
//		personList.forEach(consumer.andThen(nameConsumer));

		printWithCondition();

	}
	/**
	 * finding the person who is male and their salary greater than  5k
	 */
	private static void printWithCondition() {
		personList.forEach(per ->{
			if(per.getGender().equals("Male") && per.getSalary() > 5000) {
				consumer.andThen(nameConsumer).accept(per);
			}
		});

	}

}
