package sampleGit;

import java.util.Scanner;

public class sampleGit {
	

	public void saving(long savingAmount) {
		System.out.println("savingAmount is ;" +savingAmount);
	}
	
	public void fixed(long fixedAmount) {
		System.out.println("fixedAmount is ;" +fixedAmount);
	}
	public void deposit(long depositAmount) {
		System.out.println("depositAmount is ;" +depositAmount);
	}
	
	public void spent (long spentamount) {
		System.out.println("depositAmount is ;" +spentamount);
		
		Scanner a=new Scanner(System.in);
		short empId=a.nextShort();
		System.out.println(empId);
	}
}

