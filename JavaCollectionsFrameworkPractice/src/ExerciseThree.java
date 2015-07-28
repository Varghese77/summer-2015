//Exercise from Building Java Programs 3rd Edition Chapter 11 Exercise 3
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExerciseThree {

	public static void main(String[] args) {

		//Creates LinkedList to test Method
		List<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(0));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(4));
		list.add(new Integer(0));
		list.add(new Integer(6));
		list.add(new Integer(0));
		list.add(new Integer(8));
		list.add(new Integer(0));
		list.add(new Integer(10));
		list.add(new Integer(0));
		list.add(new Integer(12));
		list.add(new Integer(0));
		list.add(new Integer(14));
		list.add(new Integer(0));
		list.add(new Integer(16));
		
		//Tests Method
		System.out.println("Before: " + list);
		removeInRange(list, new Integer(0), 5, 13);
		System.out.println("After: " + list);
	}
	
	public static void removeInRange(List list, Object toRemove, int startIndex, int endIndex ) {
		// Throws exception if indexes are out of the range for list
		if (startIndex >= list.size() || endIndex > list.size()){
			throw new IllegalArgumentException();
		}
		
		Iterator<Object> listItr = list.iterator();
		
		//removes all instances of Object toRemove between indexes of list
		for (int i = 0; i < endIndex - 1; i++){
			if (i >= startIndex){
				Object obj = listItr.next();
				if (obj.equals(toRemove)){
					listItr.remove();
				}
			} else {
				listItr.next();
			}
		}
		
	}

}
