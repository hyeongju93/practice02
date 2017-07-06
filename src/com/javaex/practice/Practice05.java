package com.javaex.practice;

public class Practice05 {
	public static void main(String[] args) {
		int[] Array=new int[45];
		int sum=0;
		int num;
		for(int i=0;i<45;i++) {
			Array[i]=0;			
		}
		
		while(true) {
			if(sum==6) {
				break;
			}
			num= (int) (Math.random() * 45 + 1);
			Array[num]=1;
			sum=0;
			for(int i=0;i<45;i++) {
				if(Array[i]==1) {
					sum+=1;
				}
			}
		}
		for(int i=0;i<45;i++) {
			if(Array[i]==1) {
				System.out.println(i);
			}
		}
		
	}
}