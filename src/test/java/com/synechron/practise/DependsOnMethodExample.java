package com.synechron.practise;

import org.testng.annotations.Test;

public class DependsOnMethodExample {

	 @Test
		public void launch() {
			System.out.println("launching program");
		}
	    @Test(dependsOnMethods = {"launch"})
		public void login() {
			System.out.println("logging in");
}
}
