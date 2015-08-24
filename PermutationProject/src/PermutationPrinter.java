import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PermutationPrinter {

	public static int lol = 0;

	public static HashSet<String> data;

	public static boolean con;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		con = true;
		data = new HashSet<String>();
		List<Integer> l = new ArrayList<Integer>();
	// l.add(new Integer(10));
	// l.add(new Integer(9));
	// l.add(new Integer(8));
	// l.add(new Integer(7));
		//l.add(new Integer(6));
		//l.add(new Integer(5));
		l.add(new Integer(4));
		l.add(new Integer(3));
		l.add(new Integer(2));
		l.add(new Integer(1));
		print(l, l.size());
		System.out.println(lol);
		System.out.println(con);
		System.out.println(l);

	}

	public static void print(List<Integer> l, int n) {
		if (n == 1) {
			toDo(l);
		} /*
			 * else if (n == 2){ toDo(l); Collections.swap(l, l.size() - n,
			 * l.size() - 1); print(l, n - 1); } else if (n == 3){ for (int i =
			 * 0; i < n; i++){ Collections.swap(l, l.size() - n, l.size() - 1);
			 * print(l, n - 1); } }
			 */ else {

			List<Integer> help = new ArrayList<Integer>(l.size());

			for (int i = 0; i < l.size(); i++) {
				help.add(l.get(i));
			}

			for (int k = 1; k <= n; k++) {
				help.set(help.size() - k, l.get(l.size() - k));

			}

			for (int i = 1; i <= n; i++) {
				print(l, n - 1);
				if (i < n)
					Collections.swap(l, l.size() - n, l.size() - n + i);
			}

			for (int k = 1; k <= n; k++) {
				l.set(l.size() - k, help.get(help.size() - k));
			}
		}
	}

	private static void toDo(List<Integer> l) {
		lol++;
		if (data.contains(l.toString())) {
			con = false;
			System.out.println(l.toString() + ":HERE");
		} else {
			System.out.println(l);
		}
		data.add(l.toString());
	}
}
