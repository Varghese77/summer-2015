//Exercise from Building Java Programs 3rd Edition Chapter 11 Exercise 14
import java.util.HashMap;
import java.util.Map;

public class ExerciseFourteen {

	public static void main(String[] args) {
		// Creates maps to test intersect method
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Janet", new Integer(87));
		map1.put("Logan", new Integer(62));
		map1.put("Whitaker", new Integer(46));
		map1.put("Alyssa", new Integer(100));
		map1.put("Stefanie", new Integer(80));
		map1.put("Jeff", new Integer(88));
		map1.put("Kim", new Integer(52));
		map1.put("Sylvia", new Integer(95));

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("Logan", new Integer(62));
		map2.put("Kim", new Integer(52));
		map2.put("Whitaker", new Integer(52));
		map2.put("Brian", new Integer(60));
		map2.put("Stefanie", new Integer(80));
		map2.put("Jeff", new Integer(88));
		map2.put("Lisa", new Integer(83));
		map2.put("Sylvia", new Integer(87));
		
		//Tests intersect Method
		System.out.println(intersect(map1, map2));
	}

	public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2){
		// Creates map to store intersecting data
		Map<String, Integer> toReturn = new HashMap<String, Integer>();
		
		//Compares the key and values in each map
		for (String name: map1.keySet()){
			if (map2.containsKey(name) && map2.get(name).equals(map1.get(name))){
				toReturn.put(name, map1.get(name));
			}
		}
		
		return toReturn;
	}
}
