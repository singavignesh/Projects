package org.lang;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PageExecution {
	@BeforeMethod
	public void method1() {
		System.out.println("method1");
	}
	@Test
	public void method2() {
		System.out.println("method2");
	}
	@Test
	public void method4() {
		System.out.println("method4");
	}
	@AfterMethod
	public void method3() {
		System.out.println("method3");
	}

}
