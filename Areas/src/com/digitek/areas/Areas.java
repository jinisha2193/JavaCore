package com.digitek.areas;

public class Areas {
	
	public static int areaSquare(int side){
		 int sq = side*side;
		 System.out.println("the area of sqaure with side"+side+" is : "+sq);
		 return sq;	
	}
	
	
	public static int areaRectangle(int l,int b){
		 int rec = l*b;
		 System.out.println("the area of rectangle with sides "+l+","+b+" is : "+rec);
		 return rec;
	}
	
	public static double areaCircle(int rad){
		 double cir = 3.14*rad*rad;
		 System.out.println("the area of circle with radius "+rad+" is : "+cir);
		 return cir;
	}
	
	
	public static void main(String args[]){
		int r1=areaSquare(4);
		int r2 = areaRectangle(3,5);
		double r3 = areaCircle(5);
		
		
	}

}
