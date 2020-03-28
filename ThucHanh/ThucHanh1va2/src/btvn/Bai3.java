package btvn;

import javax.swing.JOptionPane;

public class Bai3 {
	public static void main(String[] args){
	    String nam, thang;
	    int x,y;
	    
	    String strHienThi = "So ngay trong thang la ";
	    do{
	    nam = JOptionPane.showInputDialog(null,
	            "Hay nhap nam: ","Nhap nam", 
	            JOptionPane.INFORMATION_MESSAGE);
	    }while(Integer.parseInt(nam)<0);
	    do{
	    thang = JOptionPane.showInputDialog(null,
	"Hay nhap thang: ","Nhap nam", 
	JOptionPane.INFORMATION_MESSAGE);
	    }while(Integer.parseInt(thang)<0 && Integer.parseInt(thang)>12);
	    x=Integer.parseInt(thang);
	    y=Integer.parseInt(nam);
	    if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12){
	    strHienThi+="31";
	        JOptionPane.showMessageDialog(null,strHienThi, 
	"So ngay trong thang", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	    }
	    if(x==4 || x==6 || x==9 || x==11){
	        strHienThi+="30";
	            JOptionPane.showMessageDialog(null,strHienThi, 
	    "So ngay trong thang", JOptionPane.INFORMATION_MESSAGE);
	        System.exit(0);
	        }
	    if(x==2){
	        if(y%4==0)
	            strHienThi+="29";
	        else
	            strHienThi+="28";
	        JOptionPane.showMessageDialog(null,strHienThi, 
	                                        "So ngay trong thang", JOptionPane.INFORMATION_MESSAGE);
	        System.exit(0);
	        }
	    
	    
	  }
}
