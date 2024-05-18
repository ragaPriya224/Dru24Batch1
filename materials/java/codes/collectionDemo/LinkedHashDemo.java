package collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String[] args) {
		LinkedHashSet foodList = new LinkedHashSet();
		foodList.add("dosa");
		foodList.add("vada");
		foodList.add("idli");
		foodList.add("vada");
		foodList.add(1);
		System.out.println(foodList);
	}

}
