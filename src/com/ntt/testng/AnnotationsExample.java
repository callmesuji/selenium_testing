package com.ntt.testng;

import org.testng.annotations.Test;

public class AnnotationsExample {

	@Test(priority = 2)
	public void test1() {

	}

	@Test(enabled = false)
	public void test2() {

	}
	
	@Test(priority = -1,invocationCount = 3)
	public void test3() {

	}
	
	@Test(priority = 0)
	public void test4() {

	}
	
	@Test(priority = 3)
	public void test5() {

	}

}
