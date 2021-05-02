package tests;

import org.testng.annotations.Test;

public class FirstTest {
	@Test(priority=1)
	public void Test() {
		System.out.println("First test");
	}
	
	@Test(priority=2)
	public void Test1() {
		System.out.println("First test");
	}
}
