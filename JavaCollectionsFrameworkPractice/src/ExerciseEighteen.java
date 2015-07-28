//Exercise from Building Java Programs 3rd Edition Chapter 11 Exercise 18
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExerciseEighteen {

	public static void main(String[] args) {
		// Creates Map to test reverse method
		Map<String, String> map = new HashMap<String, String>();
		map.put("42", "Marty");
		map.put("81", "Sue");
		map.put("17", "Ed");
		map.put("31", "Dave");
		map.put("56", "Ed");
		map.put("3", "Marty");
		map.put("29", "Ed");
		
		//tests reverse method
		System.out.println(reverse(map));
	}

	public static Map<String, Set<String>> reverse(Map<String, String> map){
		
		//Creates map to store reversed data
		Map<String, Set<String>> toReturn = new HashMap<String, Set<String>>();
		
		//Reverses Data
		for (String key: map.keySet()){
			
			//If key already exists, updates value set
			if (toReturn.containsKey(map.get(key))){
				Set<String> tempSet = toReturn.get(map.get(key));
				tempSet.add(key);
				toReturn.put(map.get(key), tempSet);
			} else {
				
				//creates new key and corresponding set
				Set<String> tempSet = new HashSet<String>();
				tempSet.add(key);
				toReturn.put(map.get(key), tempSet);
			}
		}
		
		return toReturn;
		
	}
}
