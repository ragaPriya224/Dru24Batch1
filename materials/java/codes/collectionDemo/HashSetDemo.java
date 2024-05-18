package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class HashDemo {

	public static void main(String[] args) {
		HashSet foodList = new HashSet();
		foodList.add("dosa");
		foodList.add("vada");
		foodList.add("idli");
		foodList.add("vada");
		foodList.add(1);
		System.out.println(foodList);
	}

}
