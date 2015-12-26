package com.digitek.oddandeven;

public class OddAndEven {
	
	public static void odd(){
		
		int i = 0;
		
		for (i=0;i<11;i++){
			if((i%2) != 0)
			{
				System.out.println(+i+" is odd");
			}
		}
	}
	public static void even(){
		
		int c=0;
		System.out.println("\n");
		for (c=0;c<11;c++){
			if((c%2) == 0)
			{
				System.out.println(+c+" is even");
			}
		}
	}
	
	public static void oddOrEvenWithParameters(int a){
		 
		if(a%2 == 0){
			System.out.println(+a+" is even");
				}
		else{
			System.out.println(+a+" is odd");
		}
		
	}
	public static void main(String args[]){
		odd();
		even();
		System.out.println("\n");
		oddOrEvenWithParameters(33);
		
	}
	
	
}
