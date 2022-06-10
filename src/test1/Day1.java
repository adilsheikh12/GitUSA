package test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test(groups= {"smoke"})
	public void MobileLoan() {
		System.out.println("Mobile Loan");
	}

	@Test
	public void CarLoan() {
		System.out.println("Car Loan");
		System.out.println("motor loan");
		System.out.println("vehicle loan_1");
		System.out.println("Car Loan_2");
		System.out.println("motor loan_3");
		System.out.println("vehicle loan_4");
		
	}

	@Test
	public void getLoan() {
		System.out.println("get_loan");
		System.out.println("take_loan");
	}
	
	
	@AfterTest
	public void cleanLogs()
	{
		System.out.println("I will execute last in Personal Loan");
	}
}
