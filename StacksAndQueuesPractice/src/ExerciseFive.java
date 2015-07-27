import java.util.Stack;

public class ExerciseFive {

	public static void main(String[] args) {
		// Creates Equal Test Stacks
		Stack<Integer> testOne = new Stack();
		testOne.push(new Integer(7));
		testOne.push(new Integer(2));
		testOne.push(new Integer(8));
		testOne.push(new Integer(9));

		Stack<Integer> testTwo = new Stack();
		testTwo.push(new Integer(7));
		testTwo.push(new Integer(2));
		testTwo.push(new Integer(8));
		testTwo.push(new Integer(9));

		// Tests equals method
		System.out.println("Before: testOne: " + testOne + ", testTwo "
				+ testTwo);
		boolean equality = equals(testOne, testTwo);
		System.out.println("After: testOne: " + testOne + ", testTwo "
				+ testTwo + ", Equality:" + equality);

		// Makes Stacks unequal
		testOne.push(new Integer(99));
		testTwo.push(new Integer(100));

		// Re-tests equals method
		System.out.println("Before: testOne: " + testOne + ", testTwo "
				+ testTwo);
		equality = equals(testOne, testTwo);
		System.out.println("After: testOne: " + testOne + ", testTwo "
				+ testTwo + ", Equality:" + equality);

	}

	public static boolean equals(Stack<Integer> stackOne,
			Stack<Integer> stackTwo) {
		// Stacks can't be equal if they have different length
		if (stackOne.size() != stackTwo.size()) {
			return false;
		}

		// Sets up local boolean and auxiliary stack to be used in following
		// loop.
		boolean isEqual = true;
		Stack<Integer> aux = new Stack();

		// Compares the next values in both stacks and stores the value in aux
		while (!stackOne.isEmpty()) {
			Integer stackOneNumber = stackOne.pop();
			Integer stackTwoNumber = stackTwo.pop();

			if (stackOneNumber.intValue() != stackTwoNumber.intValue()) {
				isEqual = false;
				stackOne.push(stackOneNumber);
				stackTwo.push(stackTwoNumber);
				break;
			}

			aux.add(stackOneNumber);
		}

		// Adds back values to both stacks
		while (!aux.isEmpty()) {
			Integer toAddBack = aux.pop();
			stackOne.push(toAddBack);
			stackTwo.push(toAddBack);
		}

		return isEqual;
	}
}
