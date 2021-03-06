//Exercise from Building Java Programs 3rd Edition Chapter 14 Exercise 4
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ExerciseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> test = new Stack();
		
		//test values from prompt
		test.push(new Integer(7));
		test.push(new Integer(2));
		test.push(new Integer(8));
		test.push(new Integer(9));
		test.push(new Integer(4));
		test.push(new Integer(11));
		test.push(new Integer(7));
		test.push(new Integer(1));
		test.push(new Integer(42));
		
		System.out.println("Before: " + test);
		test = collapse(test);
		System.out.println("After: " + test);

	}
	
	public static Stack<Integer> collapse(Stack<Integer> toCollapse){
		Queue<Integer> aux = new LinkedList();
		int toCollapseSize = toCollapse.size();
		
		//removes odd number that doesn't need to be added if needed
		if (toCollapseSize % 2 != 0){
			aux.add(toCollapse.pop());
		}
		
		//Adds values in stack in pairs of twos
		while(!toCollapse.isEmpty()){
			int sum = toCollapse.pop() + toCollapse.pop();
			aux.add(new Integer(sum));
		}
		
		// Re-aligns Values to stack
		while(!aux.isEmpty()){
			toCollapse.push(aux.remove());
		}
		
		while(!toCollapse.isEmpty()){
			aux.add(toCollapse.pop());
		}
		
		while(!aux.isEmpty()){
			toCollapse.push(aux.remove());
		}
		
		return toCollapse;	
	}
}
