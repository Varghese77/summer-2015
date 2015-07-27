//Exercise from Building Java Programs 3rd Edition Chapter 14 Exercise 14
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> test = new LinkedList();
		
		//test values from prompt
		test.add(new Integer(10));
		test.add(new Integer(20));
		test.add(new Integer(30));
		test.add(new Integer(40));
		test.add(new Integer(50));
		test.add(new Integer(60));
		test.add(new Integer(70));
		test.add(new Integer(80));
		test.add(new Integer(90));
		
		//tests method
		System.out.println("Before: " + test);
		test = reverseFirstK(4, test);
		System.out.println("After: " + test);
	}

	public static Queue<Integer> reverseFirstK(int k, Queue<Integer> toReverse){
		Stack<Integer> aux = new Stack<Integer>();
		
		// //pushes values to reverse in auxiliary stack
		for (int i = 0; i < k; i++){
			aux.push(toReverse.remove());
		}

		// number of elements to shift to the back once new reversed values are added
		int shift = toReverse.size();
		
		//adds values back to queue in reverse
		while (!aux.isEmpty()){
			toReverse.add(aux.pop());
		}
		
		
		//shifts queue over again
		for (int i = 0; i < shift; i++){
			toReverse.add(toReverse.remove());
		}
		
		return toReverse;
	}
}
