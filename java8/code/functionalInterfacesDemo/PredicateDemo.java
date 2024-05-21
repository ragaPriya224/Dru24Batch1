package java8.day2;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> greaterThanPredicate = (mark)-> mark>50;
		System.out.println(greaterThanPredicate.test(100));
		
		Predicate<Integer> lesserThanPredicate = (mark)-> mark<50;
		System.out.println(lesserThanPredicate.test(100));
		
		Predicate<Integer> equalToPredicate = (mark)-> mark==50;
		System.out.println(equalToPredicate.test(100));
		
		System.out.println("and checking"   + greaterThanPredicate.and(equalToPredicate).test(100));
		
		System.out.println("or checking"   + greaterThanPredicate.or(equalToPredicate).test(100));

	}

}
