package com.javaex.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		int fiveman=0;
		int oneman=0;
		int fivechan=0;
		int onechan=0;
		int fiveback=0;
		int oneback=0;
		int fiveten=0;
		int ten=0;
		int five=0;
		int one=0;
		int current=0;
		System.out.print("금액: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		fiveman=(int)num/50000;
		current=num%50000;
		
		oneman=current/10000;
		current=current%10000;
		
		fivechan=current/5000;
		current=current%5000;
		
		onechan=current/1000;
		current=current%1000;
		
		fiveback=current/500;
		current=current%500;
		
		oneback=current/100;
		current=current%100;
		
		fiveten=current/50;
		current=current%50;
		
		ten=current/10;
		current=current%10;
		
		five=current/5;
		current=current%5;
		
		one=current;
		
		System.out.println("50000원: "+fiveman+"개");
		System.out.println("10000원: "+oneman+"개");
		System.out.println("5000원: "+fivechan+"개");
		System.out.println("1000원: "+onechan+"개");
		System.out.println("500원: "+fiveback+"개");
		System.out.println("100원: "+oneback+"개");
		System.out.println("50원: "+fiveten+"개");
		System.out.println("10원: "+ten+"개");
		System.out.println("5원: "+five+"개");
		System.out.println("1원: "+one+"개");
		
	
		
		
		sc.close();
	}

}
