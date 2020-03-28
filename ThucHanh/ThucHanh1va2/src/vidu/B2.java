package vidu;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in);
		int n;
		System.out.printf("Nhap so n: ");
		n=a.nextInt();
		double sum=0;
		for(int i=1; i<=n; i++) {
			sum+=(double)1/i;
		}
		System.out.println("Tong la: "+sum);
	}

}
