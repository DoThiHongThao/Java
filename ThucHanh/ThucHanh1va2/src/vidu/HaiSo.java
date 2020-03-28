package vidu;

import java.util.Scanner;

public class HaiSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a;
		double x,y;
		System.out.println("Nhap so thu nhat: ");
		x=in.nextDouble();
		System.out.println("Nhao so thu 2: ");
		y=in.nextDouble();
		do {
		System.out.println("\n1.Tong 2 so"+
							"\n2.Hieu 2 so"+
							"\n3.Tich 2 so"+
							"\n4.Chia 2 so"+
							"\n5.Thoat"+
							"\n=>Nhap Lua Chon: ");
		a=in.nextInt();
		switch (a) {			
		case 1:
			System.out.println("Tong hai so la: "+(x+y));
			break;
		case 2:
			System.out.println("Tong hai so la: "+(x-y));
			break;
		case 3:
			System.out.println("Tong hai so la: "+(x*y));
			break;
		case 4:
			System.out.println("Tong hai so la: "+(x/y));
			break;
		default:
			break;
		}
		}while(a!=5);
		in.close();
	}

}
