package Bai2;

import java.util.Scanner;


public class QLSach {
	public static void main(String[] args)  
	  { 
	    int x; 
	    Scanner a = new Scanner(System.in); 
	    ListSach Sach = new ListSach(); 
	    do 
	    { 
	            System.out.println("\n\t-----------------------------------"); 
	            System.out.println("\t0. Exit"); 
	            System.out.println("\t1. Them Sách Giáo Khoa"); 
	            System.out.println("\t2. Them Sách Ngoại văn"); 
	            System.out.println("\t3. Them Sách Tham Khảo"); 
	            System.out.println("\t4. Hien thi danh muc Sách"); 
	            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	            x = a.nextInt(); 
	            System.out.println("------>>"); 
	            switch(x)  
	            { 
	                case 1: 
	                    Sach.ListS(1); 
	                    break; 
	                case 2: 
	                    Sach.ListS(2); 
	                    break; 
	                case 3: 
	                	Sach.ListS(3);
	                	break;
	                case 4:
	                  Sach.xuattt(); 
	                  break;
	            } 
	        } while(x!=0); 
	        System.out.println(""); 
	        a.close();
	  } 
}
