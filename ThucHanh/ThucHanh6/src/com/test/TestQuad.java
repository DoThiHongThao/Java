package com.test;
import com.bean.*;

public class TestQuad {
	public static void main(String[] args) {
		//Goi ham khoi tao khong tham so
		Quadrangle q1 = new Quadrangle();

		q1.hienthi();

		Point p1 = new Point("A",0, 2);
		Point p2 = new Point("B",0, 3);
		Point p3 = new Point("C",4, 3);
		Point p4 = new Point("D",2, 2);

		//Goi ham khoi tao 4 tham so
		Quadrangle q2 = new Quadrangle(p1, p2, p3, p4);
		q2.hienthi();

//		Quadrangle q3 = new Quadrangle();
//		q3.nhap();
//		q3.hienThi();
	}
}