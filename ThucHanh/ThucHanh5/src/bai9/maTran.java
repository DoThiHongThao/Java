package bai9;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class maTran {
	//int a[][];
	public static void Nhap(int[][] a) {
		//Scanner input= new Scanner(System.in);
		String s;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
					try {
					s=JOptionPane.showInputDialog(null,"Nhap so o hang "+i+1+" cot "+j+1+":");
					a[i][j]=Integer.parseInt(s);
					if(a[i][j]<0 || a[i][j]>100) {
						JOptionPane.showMessageDialog(null, "Ban phai nhap so >0 va <100: ","Loi", JOptionPane.ERROR_MESSAGE);
						s=JOptionPane.showInputDialog(null,"Nhap so o hang "+i+1+" cot "+j+1+":");
						a[i][j]=Integer.parseInt(s);
					}
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Ban phai nhap so: ","Loi", JOptionPane.ERROR_MESSAGE);
						JOptionPane.showInputDialog(null,"Nhap so o hang "+i+" cot "+j+":");
					}
				
			}
		}
		//return a;
		//input.close();
	}
	public static int Max(int[][] a) {
		int Max=a[0][0];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				if(Max<a[i][j])
					Max=a[i][j];
			}
		}
		return Max;
	}
	
	public static int MaxNT(int[] a) {
		int Max=a[0];
		for(int i=0; i<a.length; i++) {
				if(Max<a[i])
					Max=a[i];
		}
		return Max;
	}
	
	public static boolean NguyenTo(int a) {
		if(a==2 || a==0)
			return false;
		for(int i=2; i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int DemSoNguyen(int[][] a, int i) {
		int dem=0;
		for(int j=0; j<a[0].length; j++) {
			if(NguyenTo(a[i][j])==true) {
				dem++;
			}
		}
		return dem;
	}
	
	public static void HangMax(int[][] a) {
		int[] dem = new int[a.length+1];
		for(int i=0; i<a.length; i++) {
			dem[i]=DemSoNguyen(a,i);
		}
		int max=MaxNT(dem);
		String s="Hang co nhieu so nguyen to nhat la: ";
		for(int i=0; i<a.length; i++) {
			if(dem[i]==max)
				s+=(i+1)+",";
		}
		JOptionPane.showMessageDialog(null, s+" với số các số nguyên tố là: "+max);
	}
	public static void InNguyenTo(int[][] a) {
		//int[] b;
		String b="Day so nguyen trong ma trận là: ";
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				if(NguyenTo(a[i][j])==true) 
					b+=a[i][j]+",";
				else
					a[i][j]=0;
			}
		}
		JOptionPane.showMessageDialog(null, b);
	}
	
	public static void In(int[][] a) {
		String b="Day so: ";
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
					b+=a[i][j]+",";
				}
			}
		JOptionPane.showMessageDialog(null, b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int t[][] = new int[4][4];
		String b;
		do {
			b=JOptionPane.showInputDialog(null, "\n 1.Nhập ma trận"
												+"\n 2.Phần tử lớn nhất cuar ma trận"
												+"\n 3.In ra các phần tử là số nguyên"
												+"\n 4.Hàng trong ma trận có số nguyên tố nhiều nhất"
												+"\n 5.In"
												+"\n 6.Thoát\n"
												+"=>Nhập lựa chọn: ");
			a=Integer.parseInt(b);
			switch (a) {
			case 1:
				Nhap(t);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "So lon nhat la: "+ Max(t));
				break;
			case 3:
				InNguyenTo(t);
				break;
			case 4:
				HangMax(t);
				break;
			case 5:
				In(t);
				break;
			default:
				break;
			}
		}while(a!=6);

	}

}
