package com.ntt.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ann {

	@BeforeSuite
	public void ann1() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void ann2() {
		System.out.println("After suite");
	}

	@BeforeClass
	public void ann3() {
		System.out.println("Before class");
	}

	@AfterClass
	public void ann4() {
		System.out.println("After class");
	}

	@BeforeMethod
	public void ann5() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void ann6() {
		System.out.println("After method");
	}

	@BeforeGroups
	public void ann7() {
		System.out.println("Before groups");
	}

	@AfterGroups
	public void ann8() {
		System.out.println("After group");
	}

	@BeforeTest
	public void ann9() {
		System.out.println("Before test ");

	}

	@AfterTest
	public void ann10() {
		System.out.println("After test");

	}

	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}

}
