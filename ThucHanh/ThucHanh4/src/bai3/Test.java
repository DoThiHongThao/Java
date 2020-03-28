package bai3;

import javax.swing.JOptionPane;

import bai3.HoTenSV_MaSV;

public class Test {
	 public static void main(String[] args) {
	     int[] a= new int[10];
	     //int b[][]= new int[][];
	     HoTenSV_MaSV d= new HoTenSV_MaSV(a);
	     HoTenSV_MaSV c= new HoTenSV_MaSV();
	     
	     // b.Nhap(a);
	     //System.out.println(b.toString());
	     int g;
	     
	     do{
	         String f=JOptionPane.showInputDialog(null, "1.Nhap mang 1 chieu (Tu -5 den 15)\n"+"2.In mang 1 chieu\n" + "3. Trong mang 1 chieu dem so phan tu bang n\n"+
	         "4. Trong mang 2 chieu dem so phan tu bang n\n"+"5.Thoat\n"+"Nhap lua cho cua ban: ",JOptionPane.INFORMATION_MESSAGE);
	         g=Integer.parseInt(f);
	         switch(g){
	             case 1:
	             {
	                 d.Nhap(a);
	                 break;
	             }
	             case 2:
	             {
	                 JOptionPane.showMessageDialog(null, d.toString());
	                 break;
	             }
	             case 3:
	             {
	                 String n=JOptionPane.showInputDialog(null,"Nhap so n: ",JOptionPane.INFORMATION_MESSAGE);
	                 int m=Integer.parseInt(n);
	                 int sopt=d.ountElement(m);
	                 JOptionPane.showMessageDialog(null, "So bang voi so n la: "+ sopt);
	             }
	             case 4:
	             {
	                 String n=JOptionPane.showInputDialog(null,"Nhap so n: ",JOptionPane.INFORMATION_MESSAGE);
	                 int m=Integer.parseInt(n);
	                 int dem=c.countElement_2D(c.getB(),m);
	                 JOptionPane.showMessageDialog(null, "So bang voi so n la: "+ dem);
	             }
	         }
	
	     }while(g!=5);
	 }
 
}
