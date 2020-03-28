package bai3;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class HoTenSV_MaSV {
	 private int[] a;
	 private int[][] k;
	 public void setA(int[] c){
	     this.a=c;
	 }
	 public void setB(int[][] c){
	     this.k=c;
	 }
	 public void Nhap(int[] c){
	     String b,s;
	     int i=0;
	     b=JOptionPane.showInputDialog(null,"Nhap chuoi so ngan cach nhau boi dau ',': ",JOptionPane.INFORMATION_MESSAGE);
	     StringTokenizer sk= new StringTokenizer(b,",");
	     while(sk.hasMoreTokens()){
	         s=sk.nextToken(",");
	         c[i]=Integer.parseInt(s);
	         if(c[i]<-5 || c[i]>15){
	             JOptionPane.showMessageDialog(null, "Nhap sai", "Loi", JOptionPane.ERROR_MESSAGE);
	             break;
	         }
	         i++;
	     }
	     setA(c);
	 }
	 public int[] getA(){
	     return a;
	 }
	 public int[][] getB(){
	     return k;
	 }
	 // public HoTenSV_MaSV(){
	 //     int[] c={1,2,3,4,5};
	 //     setA(c);
	 // }
	 public HoTenSV_MaSV(int[] a){
	     setA(a);
	 }
	
	 public HoTenSV_MaSV(){
	     int b[][] = {{3,4},{5,6}, {1,9},{4,5},{5,1}};
	     setB(b);
	 }
	 
	 public String toString() {
	     String s="Day so da nhap: ";
	     for(int i=0; i<a.length; i++) {
	         String b=Integer.toString(a[i]);
	         s=s+b+",";
	     }
	     return s;
	 }
	
	 // public String toString() {
	 //     String s="Day so da nhap: ";
	 //     for(int i=0; i<k.length; i++) {
	 //         for(int j=0; j<k[0].length; j++){
	 //             String b=Integer.toString(k[i][j]);
	 //             s=s+b+",";
	 //         }
	 //     }
	 //     return s;
	 // }
	 public int ountElement(int n){
	     int dem=0;
	     for(int i=0; i<a.length; i++){
	         if(a[i]==n){
	             dem++;
	         }
	     }
	     return dem;
	 }
	 public int countElement_2D(int[][] arr, int n){
	     int dem=0;
	     for(int i=0; i<arr.length; i++){
	         for(int j=0; j<arr[0].length; j++){
	             if(arr[i][j]==n){
	                 dem++;
	             }
	         }
	     }
	     return dem;
 }
}