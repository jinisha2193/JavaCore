package com.digitek.primenumbers;

public class PrimeNumber {
	
	public static void prime(){
		int i=0,flag=0,c=0;
		for(c= 10;c<20;c++){	
			flag=0;
			for(i=2;i<(c/2);){
				if(c%i==0){
					System.out.println(+c+"not a prime");
					flag=1;
					break;
				}
				if(c%i !=0){
					i++;
				}
				
			}
			if(flag==0){
				System.out.println(+c+" a prime");
			}
		}
	}
	public static void main(String args[]){
		prime();
	}
	

}
