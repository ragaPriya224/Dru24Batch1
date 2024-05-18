package collectionDemo;

import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {
		TreeSet dataSet =new TreeSet();
		dataSet.add(100);
		dataSet.add(101);
		dataSet.add(104);
		dataSet.add(107);
		dataSet.add(110);
		dataSet.add(115);
		dataSet.add(100);
		dataSet.add(103);
		dataSet.add(100);
		System.out.println(dataSet);
		System.out.println(dataSet.first());
		System.out.println(dataSet.last());
		System.out.println(dataSet.headSet(104));
		System.out.println(dataSet.tailSet(104));
		System.out.println(dataSet.subSet(100, 110));
		System.out.println(dataSet.size());
	}

}
