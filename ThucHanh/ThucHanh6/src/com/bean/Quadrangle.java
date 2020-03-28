package com.bean;

import javax.swing.JOptionPane;

public class Quadrangle {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	public Point getP4() {
		return p4;
	}
	public void setP4(Point p4) {
		this.p4 = p4;
	}
	public Quadrangle() {
		Point s1 = new Point("A",0, 0);
		Point s2 = new Point("B",0, 1);
		Point s3 = new Point("C",1, 1);
		Point s4 = new Point("D",1, 0);
		setP1(s1);
		setP2(s2);
		setP3(s3);
		setP4(s4);
		
	}
	public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
//	public void hienThi() {
//		JOptionPane.showMessageDialog(null, "ABCD: "
//					+"A("+getP1() + ")" + ", B("+getP2() + ")"+", C("+getP3() + ")"+", D("+getP4() + ")");
//	}
	
	public void hienthi() 
	{
		JOptionPane.showMessageDialog(null, "ABCD: "
				+getP1().toString() + "," +getP2().toString()+", "+getP3().toString()+", "+getP4().toString());
		
	}
}
