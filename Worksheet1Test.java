import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


/** @author 
 *  <Josh Alexander>
 * This class contains the test cases for Worksheet1 solutions.
 *  <WRITE YOUR TEST CASES BELOW>
 */

public class Worksheet1Test {
	 
	@Test // test of power method 
	  public void test1() {

	    int expected = 125;
	    int actual = Worksheet1.power(5,3);
	    assertEquals(expected, actual);
	    
	  }
	 
	 @Test //test of fastpower method
	  public void test2() {

	    int expected = 1953125;
	    int actual = Worksheet1.fastPower(125,3);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test of negate all
	  public void test3() {
		 
		List<Integer>L = new List<>(5,new List<>(-6,new List<>(0,new List<>())));
		List<Integer>expected = new List<>(-5,new List<>(6,new List<>(0,new List<>())));
	    
	    List<Integer> actual = Worksheet1.negateAll(L);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test of find
	  public void test4() {
		 
		List<Integer>L = new List<>(4,new List<>(6,new List<>(7,new List<>())));
		int expected = 1;
		
	    
	    int actual = Worksheet1.find(6,L);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test of find to throw illegalargumentexception
	  public void test5() {
		 
		assertThrows(IllegalArgumentException.class,() -> {
	    	List<Integer>L = new List<>();
	    	Worksheet1.find(6,L);
	    });
	    
	    
	 }
	 
	 @Test // test of all even to return true
	  public void test6() {
		 
		List<Integer>L = new List<>(10,new List<>(6,new List<>(8,new List<>())));
		boolean expected = true;
	    
	    boolean actual = Worksheet1.allEven(L);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test of all even to return false
	  public void test7() {
		 
		List<Integer>L = new List<>(10,new List<>(7,new List<>(8,new List<>())));
		boolean expected = false;
	    
	    boolean actual = Worksheet1.allEven(L);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test to return only even numbers
	  public void test8() {
		 
		List<Integer>L = new List<>(10,new List<>(6,new List<>(3,new List<>())));
		List<Integer> expected = new List<>(10,new List<>(6,new List<>()));
	    
		List<Integer> actual = Worksheet1.evenNumbers(L);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test to return true if a list is sorted
	  public void test9() {
		 
		List<Integer>L = new List<>(10,new List<>(6,new List<>(3,new List<>())));
		boolean expected = true;
	    
	    boolean actual = Worksheet1.sorted(L);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test to return false if a list is sorted
	  public void test10() {
		 
		List<Integer>L = new List<>(10,new List<>(6,new List<>(20,new List<>())));
		boolean expected = false;
	    
	    boolean actual = Worksheet1.sorted(L);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test to merge two lists in descending order
	  public void test11() {
		 
		List<Integer>L = new List<>(8,new List<>(5,new List<>(2,new List<>())));
		List<Integer>X = new List<>(9,new List<>(8,new List<>()));
		List<Integer> expected = new List<>(9,new List<>(8,new List<>(8, new List<>(5, new List<>(2, new List<>())))));
	    
		List<Integer> actual = Worksheet1.merge(L,X);
	    assertEquals(expected, actual);
	    
	 }
	 
	 @Test // test to remove duplicates from a list 
	  public void test12() {
		 
		List<Integer>L = new List<>(9,new List<>(8,new List<>(8, new List<>(4, new List<>(2, new List<>())))));
		List<Integer> expected = new List<>(9,new List<>(8,new List<>(4, new List<>(2, new List<>()))));
		
		List<Integer> actual = Worksheet1.removeDuplicates(L);
	    assertEquals(expected, actual);
	    
	 }
	 
}


