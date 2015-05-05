Frrll1package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.solution;
import code.solution;

public class tests {
	@Test
	public void test0() {
		commonCode0("meat", 1);
	}
	
	@Test
	public void test01() {
		commonCode0("carl", 0);
	}
	
	@Test
	public void test02() {
		commonCode0("carlito", 0);
	}
	
	@Test
	public void test03() {
		commonCode0("eeeee", 5);
	}
	
	@Test
	public void test04() {
		commonCode0("", 0);
	}
	
	 
	public void commonCode0(String testString, int expected) {
		solution Solution = new solution();
		int actual = Solution.count_e(testString);
		assertTrue(
				"I expected count_e to return " + expected + 
				" given an argument of '" + testString + "' , " + 
				" but instead I got " + actual + ".", 
				actual == expected);
	}
	
	@Test
	public void test05(){
		commonCode1("hello", 'l' , 2);
	}
	
	@Test
	public void test06(){
		commonCode1("bob", 'b' , 2);
	}
	
	@Test
	public void test07(){
		commonCode1("chris", 'l' , 0);
	}
	
	@Test
	public void test08(){
		commonCode1("bryan", 'y' , 1);
	}
	
	
	public void commonCode1(String testString, char c, int expected) {
		solution Solution = new solution();
		int actual = Solution.count_one_char(testString, c);
		assertTrue(
				"I expected count_one_char to return " + expected + 
				" given an argument of '" + testString +  "' , " + c +
				" but instead I got " + actual + ".", 
				actual == expected);
	}
	
	@Test
	public void test09(){
		commonCode2("firefly", "sversyl");
	}
	
	@Test
	public void test10(){
		commonCode2("ABCDE", "NOPQR");
	}
	
	@Test
	public void test11(){
		commonCode2("NOPQR", "ABCDE");
	}
	
	@Test
	public void test12(){
		commonCode2("123 Bob", "123 Obo");
	}
	
	
	
	public void commonCode2(String testString, String expected) {
		solution Solution = new solution();
		String actual = Solution.encode(testString);
		assertTrue(
				"I expected encode to return " + expected + 
				" given an argument of '" + testString +  "' , " +
				" but instead I got " + actual + ".", 
				actual.equals(expected));
	}
	
//	
//	public void commonCode3(String testString,String key, String expected) {
//		solution Solution = new solution();
//		String actual = Solution.encode2(testString);
//		assertTrue(
//				"I expected encode2 to return " + expected + 
//				" given the arguments of '" + testString +  "' and '" + key + "', " +
//				" but instead I got " + actual + ".", 
//				actual.equals(expected));
//	}
//	
}
