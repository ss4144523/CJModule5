package com.shape;

public class Rectangle implements Polygon{
	public float length;
	public float breadth;
	public float area;
	public float perimeter;

	@Override
	public void calArea() {
		 area = length*breadth;
		 System.out.println("Area of rectangle :"+area);
		
		
	}

	@Override
	public void calPeri() {
		 perimeter = 2*(length+breadth);
		System.out.println("Perimeter of rectangle :"+perimeter);
	}
	

}
