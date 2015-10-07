// https://www.reddit.com/r/dailyprogrammer/comments/3n55f3/20150930_challenge_234_intermediate_red_squiggles/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		File f = new File("enable1.txt");
		Scanner words = null;
		//String word = "Hello";
		try {
			words = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		List<String> wordsList = new LinkedList<String>();
		
		while (words.hasNextLine()){
			String word = words.nextLine();
			wordsList.add(word);
		}
		
		//loop through words here
			String word = "gme";
			List<String> filteredWords = filterWords(wordsList, "word");
			// loop though characters here and insert necessary indicator
			for (int i = 0; i < word.length(); i++){
				
			}
		
	}

	//method creates initial filtered words set
	private static List<String> filterWords(List<String> wordsList, String word) {
		char wordFirstLetter = word.charAt(0);
		List<String> filteredWords = new LinkedList<String>();
		Iterator<String> iter = wordsList.iterator();
		while(iter.hasNext()) {
			String nextWord = iter.next();
			char nextWordFirstLetter = nextWord.charAt(0);
			if (nextWordFirstLetter == wordFirstLetter) {
				filteredWords.add(nextWord);
			}// else if ()
		}
		return filteredWords;
	}
}
