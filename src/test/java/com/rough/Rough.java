package com.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rough {
	
	     @Test
	      public void test() {
	    	 WebDriver d= new ChromeDriver();
	    	 d.get("https://www.google.com/");
	    	 System.out.println(d.getTitle());
	      }

}
