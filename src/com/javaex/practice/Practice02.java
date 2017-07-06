package com.javaex.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		double num;
		
		for(int i=0;i<5;i++) {
			System.out.println("숫자를 입력해주세요: ");
			num=sc.nextInt();
			sum+=num;
		}
		
		System.out.println("평균은 "+sum/5+"입니다.");
		sc.close();
	}
	
}
