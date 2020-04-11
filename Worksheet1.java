/**
 * @author <Josh Alexander> This class contains the solution for Worksheet1
 */

 public class Worksheet1 {

	// Exercise 1

	 /**
	 * @param m an integer
	 * @param n an integer to raise by
	 * @return the result of m^n
	 */
	static int power(int m, int n) {
		if (n==0) {
			return 1;
		}
		else return m * power(m,n-1);
		
	}

	 /**
	 * @param m an integer
	 * @param n an integer to raise by
	 * @return the result of m^n
	 */
	static int fastPower(int m, int n) {
		if (n==0) {
			return 1;
			}
		if (n%2==0) {
			m = fastPower(m,n/2);
			return m*m;
		}
		else return m * fastPower(m,n-1);
	}

	// Exercise 2

	 /**
	 * @param a a list
	 * @return the inverse of the list eg positive to negative, negative to positive
	 */
	static List<Integer> negateAll(List<Integer> a) {
		if (a.isEmpty()==true) {
			return new List<>();
		}
		else return new List<>(a.getHead() * -1, negateAll(a.getTail()));
	}

	// Exercise 3
   
	 /**
	 * @param x an integer to find
	 * @param a a list
	 * @return the location of x in the list
	 */
	static int find(int x, List<Integer> a) {
		
		if (a.isEmpty()==true) {
			throw new IllegalArgumentException();
		}
	    if (a.getHead()==x) {
	    	return 0;
	    }
	    else return 1 + find(x,a.getTail());
	}

	// Exercise 4

	 /**
	 * @param a a list
	 * @return true if all elements of the list are positive
	 */
	static boolean allEven(List<Integer> a) {
		if (a.isEmpty()==true) {
			return true;
		}
		if (a.getHead()%2==0) {
			return allEven(a.getTail());
		}
		else return false;
	}

	// Exercise 5

	 /**
	 * @param a a list
	 * @return only the positive elements of the list
	 */
	static List<Integer> evenNumbers(List<Integer> a) {
		if (a.isEmpty()==true) {
			return new List<>();
		}
		if (a.getHead()%2==0) {
			return new List<>(a.getHead(), evenNumbers(a.getTail()));
		}
		else return evenNumbers(a.getTail());
	}

	// Exercise 6

	 /**
	 * @param a a list
	 * @return true if the list is sorted by descending order
	 */
	static boolean sorted(List<Integer> a) {
		if (a.getTail().isEmpty()== true) {
			return true;
		}
		if (a.getHead() >= a.getTail().getHead()) {
			return sorted(a.getTail());
		}
		else return false;
	}

	// Exercise 7

	 /**
	 * @param a a list
	 * @param b a list
	 * @return a single list of merged a and b by descending order
	 */
	static List<Integer> merge(List<Integer> a, List<Integer> b) {
		if (a.isEmpty()==true && b.isEmpty()==true) {
			return new 	List<>();
		}
		if (a.isEmpty()==true) {
			return b;
		}
		if (b.isEmpty()==true) {
			return a;
		}
		if (a.getHead()>= b.getHead()) {
			return new List<>(a.getHead(),merge(a.getTail(),b));
		}
		else return new List<>(b.getHead(),merge(b.getTail(),a));
 }	

	// Exercise 8
	 
	/**
	 * @param a a list
	 * @return a list without duplicates in descending order
	 */
	static List<Integer> removeDuplicates(List<Integer> a) {
		if (a.isEmpty()==true) {
			return new List<>();
		}
		if (a.getTail().isEmpty()==true) {
			return new List<>(a.getHead(),removeDuplicates(a.getTail()));
		}
		if (a.getHead()==a.getTail().getHead()) {
			return new List<>(a.getHead(), removeDuplicates(a.getTail().getTail()));
		}
		else return new List<>(a.getHead(),removeDuplicates(a.getTail()));
		}
		
	
 }


