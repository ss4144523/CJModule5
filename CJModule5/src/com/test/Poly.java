package com.test;
import com.shape.*;
public class Poly {
	public static void main(String[] args) {
	Square square = new Square();
	   square.side = 4;
	Rectangle rectangle = new Rectangle();
       rectangle.length = 5;
       rectangle.breadth = 3;
	square.calArea();
	square.calPeri();
	rectangle.calArea();
	rectangle.calPeri();
	}
}