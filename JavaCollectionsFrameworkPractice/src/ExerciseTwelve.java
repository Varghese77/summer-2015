import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseTwelve {

	public static void main(String[] args) {
		
		//Creates list to test method
		List<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hi");
		list.add("lol");
		list.add("rotfl");
		list.add("ttyl");
		list.add("winning");
		
		// tests for false
		System.out.println(contains3(list));
		
		//Updates List to test for true
		list.add("hi");
		System.out.println(contains3(list));

	}
	
	public static boolean contains3(List<String> list){
		//Creates map to store each string and the total number of times it appears
		Map<String, Integer> stringCountMap = new HashMap<String, Integer>();
		
		//Stores strings and their count in the stringCountMap
		for (int i = 0; i < list.size(); i++){
			String toCount = list.get(i);
			
			if (stringCountMap.containsKey(toCount)){
				int count = stringCountMap.get(toCount).intValue() + 1;
				stringCountMap.put(toCount, new Integer(count));
			} else {
				stringCountMap.put(toCount, new Integer(1));
			}
		}
		
		//Goes through the map and tests for a value of three or greater
		for (String instance: stringCountMap.keySet()){
			if (stringCountMap.get(instance).intValue() >= 3){
				return true;
			}
		}
		
		return false;
	}

}
