import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
				toSplit.add(toSort);
			}else {
				aux.add(toSort);
			}
		}
		
		// adds remaining non-negative values to stack
		while (!aux.isEmpty()){
			toSplit.add(aux.remove());
		}
		
		// Return split Stack
		return toSplit;
		
	}
}

