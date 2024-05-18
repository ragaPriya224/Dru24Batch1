package practice;

import java.util.HashMap;

public class CollectionProblem {
	public static void main(String[] args) {
		String languages = "eng chinese eng telugu  chinese hindi chinese  ";
		// languages  count
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		String[] splittedArray = languages.split(" ");
		for(String word: splittedArray) {
			//if already present 
			if(wordCountMap.containsKey(word)) {
				//logic - +1
				wordCountMap.put(word, wordCountMap.get(word)+1);
			}else {
				wordCountMap.put(word, 1);
			}
		}
		System.out.println(wordCountMap);

	}
}
