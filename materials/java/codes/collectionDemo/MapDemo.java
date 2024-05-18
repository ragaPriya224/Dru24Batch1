package collectionDemo;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> foodMap = new HashMap<String, Integer>();
		foodMap.put("samosa", 20);
		foodMap.put("chicken", 100);
		foodMap.put("briyani", 180);
		foodMap.put("burger", 20);
		foodMap.put("samosa", 25);
		System.out.println(foodMap);
//		System.out.println(foodMap.keySet());
		System.out.println(foodMap.values());
		System.out.println(foodMap.containsKey("samosa"));
		System.out.println(foodMap.containsValue(25));
		System.out.println(foodMap.size());
	System.out.println(foodMap.get("burger"));
	System.out.println(foodMap.remove("samosa"));
	foodMap.putIfAbsent("briyani", 300);
	System.out.println(foodMap.replace("burger", 30));
	System.out.println(foodMap.entrySet());
	System.out.println(foodMap);

	}

}
