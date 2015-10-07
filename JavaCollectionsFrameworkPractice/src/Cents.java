
public class Cents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int change = 37;
		
		System.out.println(change / 25);
		change %= 25;
		
		System.out.println(change / 10);
		change %= 10;
		
		System.out.println(change / 5);
		change %= 5;
		
		System.out.println(change / 1);
		change %= 1;
		
	}

}
