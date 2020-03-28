package com.test;
import com.bean.*;

public class TestPoint {
	public static void main(String[] args) {
		//Goi ham khoi tao khong tham so
		Point obj1 = new Point();

		obj1.hienThi();

		//Goi ham khoi tao 2 tham so
		Point obj2 = new Point(-12.8, 13);
		obj2.hienThi();

		//Goi ham khoi tao 3 tham so
		Point obj3 = new Point("B", 3.5, 4.5);
		obj3.hienThi();

		Point obj4 = new Point();
		obj4.nhap();
		obj4.hienThi();
	}
}