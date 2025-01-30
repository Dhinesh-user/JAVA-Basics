package TestNGpack;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class Example {
    static WebDriver dr;
	
    public static void main(String[] args) {
    	System.out.println("Enter the browser either chrome or edge \n");
		Scanner sc = new Scanner(System.in);
		
		String browserName=sc.next();
	    Browser br = new Browser();
	    dr=br.browserinit(browserName);
	    dr.get("https://demo.automationtesting.in/Alerts.html");
	
	
}}
