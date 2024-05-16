package collectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList foodList = new LinkedList();
		foodList.add("dosa");
		foodList.add("vada");
		foodList.add("idli");
		foodList.add("poori");
		System.out.println("initial "+foodList);
		foodList.addFirst("biriyani");
		System.out.println(foodList);
		foodList.addLast("coffee");
		System.out.println(foodList);
		System.out.println(foodList.getFirst());
		System.out.println(foodList.getLast());
		foodList.removeFirst();
		System.out.println(foodList);
		foodList.removeLast();
		System.out.println(foodList);
	}
}
