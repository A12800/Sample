package com.synechron.practise;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
	public void launch() {
		System.out.println("launching program");
	}
    @Test(priority = 0)
	public void login() {
		System.out.println("logging in");
	}
    @Test(enabled = false)
	public void program() {
		System.out.println(" program");
	}
	
	
}
