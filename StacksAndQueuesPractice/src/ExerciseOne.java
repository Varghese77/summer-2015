import java.util.LinkedList;
import java.util.Queue;
//Exercise from Building Java Programs 3rd Edition Chapter 14 Exercise 1
import java.util.Stack;

public class ExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> testStack = new Stack();
		
		//fills stack with Random Integers between -100 & 100
		for (int i = 0; i < 10; i++) {
			testStack.push(new Integer((int) (Math.random() * 200) - 100));
		}
		
		//Tests Method
		System.out.println("Before: " + testStack);
		testStack = splitStack(testStack);
		System.out.println("After: " + testStack);
	}
	
	public static Stack<Integer> splitStack(Stack<Integer> toSplit) {
		Queue<Integer> aux = new LinkedList();
		
		// Transfer values from stack to Queue
		while (!toSplit.isEmpty()){
			aux.add(toSplit.pop());
		}
		
		int auxSize = aux.size();
		
		// Places negative values in stack
		for (int i = 0; i < auxSize; i++){
			Integer toSort = aux.remove();
			if (toSort.intValue() < 0){
				toSplit.push(toSort);
			}else {
				aux.add(toSort);
			}
		}
		
		// adds remaining non-negative values to stack
		while (!aux.isEmpty()){
			toSplit.push(aux.remove());
		}
		
		// Return split Stack
		return toSplit;
		
	}
}

