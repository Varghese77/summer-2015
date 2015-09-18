//Solution completed by Roy Varghese Mathew on September 18th 2015
//Challenge modified from https://www.reddit.com/r/dailyprogrammer/comments/3ggli3/20150810_challenge_227_easy_square_spirals/
import java.awt.Point;

public class Solution {

	public static void main(String[] args) {
		// test cases
		Point p = findPoint(1024716039, 557614022);
		printPoint(p);
		System.out.println(findStep(3, new Point(2, 3)));
	}

	/*
	 * pre: length must be a positive, odd number > 1, step must be <= length ^2
	 * post: returns a point with cartesian coordinates of step
	 */
	private static Point findPoint(int length, int step) {
		int shellRoot = findLargestOddSquareRoot(step);

		// ShellRoot squared should always be less than step
		if (shellRoot == length) {
			shellRoot -= 2;
		}

		int shellRootSquared = (int) Math.pow(shellRoot, 2);
		// determines which side of the outershell step is on
		int d = (step - shellRootSquared) / (shellRoot + 1);
		// coordinates of shellRootSquared
		int shellRootSquared_X = (int) Math.ceil(length / 2.0) + (int) Math.floor(shellRoot / 2.0);
		int shellRootSquared_Y = shellRootSquared_X;

		// last point in shell
		Point shellEnd = new Point(shellRootSquared_X, shellRootSquared_Y);
		Point pointOfStep = null;

		// how much to translate shellEnd for solution in outer shell
		int dx = 0;
		int dy = 0;

		// determines dx and dy based on step's coordinates relative to
		// shellEnd's coordinates
		if (d == 0) {
			dx = 1;
			if (step - shellRootSquared != 1) {
				dy = -1 * (step - (shellRootSquared + 1));
			}
		} else if (d == 1) {
			dx = -1 * (step - (shellRootSquared + shellRoot + 1) - 1);
			dy = -1 * (shellRoot);
		} else if (d == 2) {
			dx = -1 * shellRoot;
			dy = -1 * (3 * (shellRoot + 1) + shellRootSquared - 1 - step);
		} else if (d == 3) {
			dx = -1 * (4 * (shellRoot + 1) + shellRootSquared - 1 - step);
			dy = 1;
		} else if (d == 4) {
			dx = 1;
			dy = 1;
		} else {
			return null;
		}

		// returns point of step in outer shell
		pointOfStep = new Point((int) shellEnd.getX() + dx, (int) shellEnd.getY() + dy);
		return pointOfStep;
	}

	/*
	 * pre: n must be greater or equal to 1 post: returns root of the largest
	 * off square root within n
	 */
	private static int findLargestOddSquareRoot(int n) {
		int root = (int) Math.sqrt(n);
		if (root % 2 == 0) {
			return root - 1;
		} else {
			return root;
		}
	}

	/*
	 * pre: point can't be null post: prints to console point in cartesian form
	 */
	private static void printPoint(Point p) {
		System.out.println("(" + (int) p.getX() + ", " + (int) p.getY() + ")");
	}

	private static int findStep(int length, Point p) {
		int centerCoordinate = length / 2 + 1;
		// determines magnitude of coordinates of p relative to c
		int xShell = Math.abs((int) p.getX() - centerCoordinate);
		int yShell = Math.abs((int) p.getY() - centerCoordinate);

		// determines shell with point p based on symmetrical property of shell structure
		int shell = 1;
		if (xShell > yShell) {
			shell += xShell;
		} else {
			shell += yShell;
		}

		// once shell is determined, root and square can be determined
		int root = shell * 2 - 1;
		int square = (int) Math.pow(root, 2);
		int step = square;

		// creates an iterator that will transverses shell and increments step
		// until point is found
		Point iter = new Point(centerCoordinate + shell - 1, centerCoordinate + shell - 1);
		if (iter.equals(p)) {
			return step;
		} else {
			for (int i = root - 1; i > 0; i--) {
				iter.translate(-1, 0);
				step--;
				if (iter.equals(p)) {
					return step;
				}
			}
			for (int i = root - 1; i > 0; i--) {
				iter.translate(0, -1);
				step--;
				if (iter.equals(p)) {
					return step;
				}
			}
			for (int i = root - 1; i > 0; i--) {
				iter.translate(1, 0);
				step--;
				if (iter.equals(p)) {
					return step;
				}
			}
			for (int i = root - 2; i > 0; i--) {
				iter.translate(0, 1);
				step--;
				if (iter.equals(p)) {
					return step;
				}
			}
		}
		return -1; // will never reach this point
	}

}
