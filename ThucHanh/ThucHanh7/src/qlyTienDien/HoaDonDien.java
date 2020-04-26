package qlyTienDien;

import java.util.Scanner;
import java.util.StringTokenizer;


public class HoaDonDien {
	public static void main(String[] args) {
		int x; 
		String thang;
		int t,n;
	    Scanner a = new Scanner(System.in); 
	    ListKhachHang hd = new ListKhachHang(); 
	    do 
	    { 
	            System.out.println("\n\t-----------------------------------"); 
	            System.out.println("\t0. Exit"); 
	            System.out.println("\t1. Nhập hóa đơn"); 
	            System.out.println("\t2. Xuất hóa đơn"); 
	            System.out.println("\t3. Tổng số lượng cho từng loại khách hàng"); 
	            System.out.println("\t4. Trung bình thành tiền theo tháng"); 
	            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	            System.out.println("Nhập lựa chọn ------>>"); 
	            x = a.nextInt(); 
	            
	            switch(x)  
	            { 
	                case 1: 
	                    int b;
	                    System.out.println("\t1. Khách hàng Việt Nam");  
	                    System.out.println("\t2. Khách hàng nước ngoài"); 
	                    b=a.nextInt();
	                    switch(b) {
	                    	case 1:
	                    		hd.khVN();
	                    		break;
	                    	case 2:
	                    		hd.khNN();
	                    		break;
	                    }
	                    break; 
	                case 2: 
	                    hd.xuat();; 
	                    break; 
	                case 3: 
	                	hd.soluong();
	                	break;
	                case 4:
	                	System.out.print("Nhập số tháng cần kiểm tra (mm/yyyy): ");
	                	thang=a.next();
	                	StringTokenizer hk=new StringTokenizer(thang,"/");
	                	t=Integer.parseInt(hk.nextToken());
	                	n=Integer.parseInt(hk.nextToken());
	                	hd.TB(t,n);
	                	break;
	            } 
	        } while(x!=0); 
	        System.out.println(""); 
	        a.close();
	}	
}
