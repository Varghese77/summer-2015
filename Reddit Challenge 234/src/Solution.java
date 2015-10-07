// https://www.reddit.com/r/dailyprogrammer/comments/3n55f3/20150930_challenge_234_intermediate_red_squiggles/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		File f = new File("enable1.txt");
		Scanner file = null;
		String word = "Hello";
		try {
			file = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//HashSet of words here
		
		//loop through words here
			//Set filtered Words = filterWords(String word, Set words)
			// loop though characters here and insert necessary indicator
		
	}

	//method create initial filtered words
}
