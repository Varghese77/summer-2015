//Exercise from Building Java Programs 3rd Edition Chapter 14 Exercise 4
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ExerciseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Stack<Integer> collapse(Stack<Integer> toCollapse){
		Queue<Integer> aux = new LinkedList();
		int toCollapseSize = toCollapse.size();
		
		//Adds values in stack in pairs of twos
		for (int i = 1; i < toCollapseSize; i += 2){
			int sum = toCollapse.pop() + toCollapse.pop();
			aux.add(new Integer(sum));
		}
		
		// Adds last remaining non-added value if it exists
		if (!toCollapse.isEmpty()){
			aux.add(toCollapse.pop());
			
		}
		
		// Re-aligns Values to stack
		while(!aux.isEmpty()){
			toCollapse.add(aux.remove());
		}
		
		while(!toCollapse.isEmpty()){
			aux.add(toCollapse.pop());
		}
		
		while(!aux.isEmpty()){
			toCollapse.add(aux.remove());
		}
		
		return toCollapse;	
	}
}
