package btvn;

import javax.swing.JOptionPane;

public class Bai2 {
	public static void main(String[] args){
	      int iLuaChon;
	      Double b= (double) 0;
	      String a;
	      int LuaChon;
	      String x = "Ket qua la ";
	  	a = JOptionPane.showInputDialog(null,
	            "Nhap so thuc ","Input", 
	            JOptionPane.INFORMATION_MESSAGE);
	    b+=Double.parseDouble(a);
	do{
	    LuaChon=0;
	  	iLuaChon = JOptionPane.showConfirmDialog(null,
	                "Co nhap tiep khong?", "Xac nhan nhap tiep",
	                JOptionPane.YES_NO_OPTION);
	  	
	  	if (iLuaChon == JOptionPane.YES_OPTION){
	          LuaChon = 1;
	          a = JOptionPane.showInputDialog(null,
	                "Nhap so thuc ","Input", 
	                JOptionPane.INFORMATION_MESSAGE);
	         b+=Double.parseDouble(a);
	      }
	          
	  	else
	  		LuaChon = 0;
	  
	  
	  }while(LuaChon==1);
	  x+=b;
	  JOptionPane.showMessageDialog(null,"Ket qua " + x);
	  System.exit(0);
	}
}
