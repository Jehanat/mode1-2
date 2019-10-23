package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {
	public static void main(String[] args) {
		int accountNo;
		String city,state;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AccountNo:");
		accountNo=Integer.parseInt(sc.nextLine());
		System.out.println("enter City:");
		city=sc.nextLine();
		System.out.println("Enter state:");
		state=sc.nextLine();
		System.out.println(AccountBAL.updateAccountBal(accountNo, city, state));
	}

}
