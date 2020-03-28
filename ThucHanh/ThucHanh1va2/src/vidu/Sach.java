package vidu;

import java.util.Scanner;

public class Sach {
	public static void Show(String a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static String[] Add(String a[], String b) {
		String k[] = new String[a.length+1];
		if(a.length>100) {
			System.out.println("Du lieu da day");
		}
		else {
			for(int i=0; i<a.length; i++) {
				k[i]=a[i];
			}
			int m= a.length;
			k[m]=b;
		}
		return k;
	}
	public static boolean FindBook(String a[], String b) {
		for(int i=0; i<a.length; i++) {
			if(b.equals(a[i])==true)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		String Sach[]= {"Abc","Bah","HBj"};
		
		int b;
		do {
			System.out.printf("===============Menu================="
								+"\n1.Show library information"
								+"\n2.Add new book"
								+"\n3.FInd book"
								+"\n4.Exit"
								+"\n===================================="
								+"\n=>Nhap lua chon"
								);
			b=a.nextInt();
			switch (b) {
			case 1:
				
				Show(Sach);
				break;
			case 2:
				System.out.println("Nhap sach muon them");
				String n=a.next();
				Sach=Add(Sach,n);
				break;
			case 3:
				System.out.println("Nhap sach can tim");
				String m=a.next();
				if(FindBook(Sach,m)==true) {
					System.out.println("Co sach can tim");
				}
				else
					System.out.println("Khong co sach can tim");
				break;
			default:
				break;
			}
			
		}while(b!=4);
		a.close();
	}

}
