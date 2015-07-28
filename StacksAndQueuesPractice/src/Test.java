import java.util.Stack;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in = new Integer(7);
		Stack<Integer> testOne = new Stack();
		Stack<Integer> testTwo = new Stack();
		testOne.push(in);
		testTwo.push(in);
		in = new Integer(8);
		System.out.print(testOne + "" +  testTwo);
	}

}
