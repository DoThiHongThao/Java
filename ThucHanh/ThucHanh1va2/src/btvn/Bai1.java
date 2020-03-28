package btvn;

import javax.swing.JOptionPane;

public class Bai1 {
	public static void main(String[] args){
	    String a,b,c;
	    String x = "Phuong trinh co nghiem la ";
	    
	    a = JOptionPane.showInputDialog(null,
	"Giai phuong trinh ax^2+bx+c=0 \n Hay nhap so a: ","Nhap a", 
	JOptionPane.INFORMATION_MESSAGE);

	    
	    b = JOptionPane.showInputDialog(null,
	"Giai phuong trinh ax^2+bx+c=0 \n Hay nhap so b: ","Nhap b", 
	JOptionPane.INFORMATION_MESSAGE);
	    

	    c = JOptionPane.showInputDialog(null,
	"Giai phuong trinh ax^2+bx+c=0 \n Hay nhap so c: ","Nhap c", 
	JOptionPane.INFORMATION_MESSAGE);
	    
	    if(Integer.parseInt(a)==0){
	        x+=a;
	        JOptionPane.showMessageDialog(null,x, 
	"Ket qua", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	    }
	    int m,n,p,denta;
	    m=Integer.parseInt(a);
	    n=Integer.parseInt(b);
	    p=Integer.parseInt(c);
	    denta=(n*n)-(4*m*p);
	    String strHienThi="Phuong trinh vo nghiem";
	    if(denta<0){
	        JOptionPane.showMessageDialog(null,strHienThi, 
	"Ket qua", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	    }
	    if(denta==0){
	        x+=(-n/(2*m));
	        JOptionPane.showMessageDialog(null,x, 
	"Ket qua", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	    }
	    if(denta>0){
	        x+=(double)(-n+Math.sqrt(denta))/(2*m)+" va";
	        x+=(double)(-n-Math.sqrt(denta))/(2*m);
	    JOptionPane.showMessageDialog(null,x, 
	"Ket qua", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	    }
	  }
}
