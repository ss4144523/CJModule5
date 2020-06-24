package com.shape;

public class Square implements Polygon{
	public float side;
	public float area;
	public float perimeter;

	@Override
	public void calArea() {
	 area = side*side;
		System.out.println("Area of square :"+area);
	}

	@Override
	public void calPeri() {
		 perimeter = 4*side;
		System.out.println("Perimeter of square :"+perimeter);
	}

}
