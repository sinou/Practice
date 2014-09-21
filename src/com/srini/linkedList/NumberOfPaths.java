package com.srini.linkedList;

import java.util.ArrayList;

//this contains solutions for both finding the number of possible paths and the paths themselves
public class NumberOfPaths {
	static ArrayList<Point> path = new ArrayList<Point>();
	public static void main(String args[]) {
		System.out.println(findNumberOfPaths(3, 3));// call to
													// findNumberOfPaths(int,
													// int)
		findAllPaths(3, 3, null);// call to FindAllPaths(int, int,
									// ArrayList<Point>) - finds the paths
									// themselves
	}
	
	public static long findNumberOfPaths(int p, int q) {
		return factorial(p - 1 + q - 1) / (factorial(p - 1) * factorial(q - 1));
		// ((p - 1) + (q - 1))! / (p - 1)! * (q - 1)!
	}

	// this method finds all the paths, not just the number of paths
	public static boolean findAllPaths(int p, int q, ArrayList<Point> path) {// backtracking
																				// here;
		// starting from the end point and moving towards the starting point
		Point oPoint = new Point(p, q);
		boolean isValid = false;
		// path.add(oPoint);
		ArrayList<Point> newPath = new ArrayList<Point>();
		if (path != null) {
			newPath.addAll(path);// add existing points; dynamic programming
									// allows for utilizing current progress
									// and lets us add that to future
									// computation
		}
		newPath.add(oPoint);// add the new point
		if (p == 1 && q == 1) {// print out the results when you have reached
								// the end
			System.out.print("end<-");
			for (Point point : newPath) {
				System.out.print(point.toString() + "<-");
			}
			System.out.print("start");
			System.out.println();
			return true;
		}
		if (p >= 1) {// when you choose p
			isValid = findAllPaths(p - 1, q, newPath);
		}
		if (q >= 1) {// when you choose q
			isValid = findAllPaths(p, q - 1, newPath);
		}

		if (!isValid && path != null) {
			path.remove(oPoint);
		}
		return isValid;
	}

	// returns the factorial of a number; used in findNumberOfPaths(int, int)
	public static long factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return (long) n * factorial(n - 1);
	}
}

// class point: contains x and y coordinates
class Point {
	int p;
	int q;

	Point(int p, int q) {
		this.p = p;
		this.q = q;
	}

	// overriding toString to facilitate legible printing
	public String toString() {
		return "(" + this.p + ", " + this.q + ")";
	}
}