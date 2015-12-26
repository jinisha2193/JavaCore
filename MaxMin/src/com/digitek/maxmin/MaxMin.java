package com.digitek.maxmin;

public class MaxMin {
	
	public static void max()
	{
		int a[] = {12,4,2,6,77,10};
		int i=0;
		int max ;
		max=a[0];
		for(i=1;i<=5;i++){
			if (max<a[i])
			{
				max=a[i];
				
			}
		}
		System.out.println("max:"+max);
		
				
		}
	public static void min()
	{
		int a[] = {12,4,2,6,77,10};
		int i=0;
		int min ;
		min=a[0];
		for(i=1;i<=5;i++){
			if (min>a[i])
			{
				min=a[i];
				
			}
		}
		System.out.println("min:"+min);
		
				
		}
	
		
	
	public static void main(String args[]){
		max();
		min();
	}

}
