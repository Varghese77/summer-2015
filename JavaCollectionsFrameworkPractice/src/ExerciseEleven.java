//Exercise from Building Java Programs 3rd Edition Chapter 11 Exercise 11
import java.util.HashSet;
import java.util.Set;

public class ExerciseEleven {

	public static void main(String[] args) {

		// creates test sets
		Set<Integer> setOne = new HashSet<Integer>();
		setOne.add(new Integer(1));
		setOne.add(new Integer(4));
		setOne.add(new Integer(7));
		setOne.add(new Integer(9));
		
		Set<Integer> setTwo = new HashSet<Integer>();
		setTwo.add(new Integer(2));
		setTwo.add(new Integer(4));
		setTwo.add(new Integer(5));
		setTwo.add(new Integer(6));
		setTwo.add(new Integer(7));
		
		//Tests method
		System.out.println(symmetricSetDifference(setOne, setTwo));
	}

	public static Set<Integer> symmetricSetDifference(Set<Integer> setOne, Set<Integer> setTwo){
		//Creates set of common numbers
		Set<Integer> intersect = new HashSet<Integer>(setOne);
		intersect.retainAll(setTwo);
		
		// Removes common numbers from combined set
		Set<Integer> symmetricSetDifference = new HashSet<Integer>(setOne);
		symmetricSetDifference.addAll(setTwo);
		symmetricSetDifference.removeAll(intersect);
		
		return symmetricSetDifference;
		
	}
}
