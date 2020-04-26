package qlyTienDien;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ListKhachHang {
	private KhachHang[] khachHang=new KhachHang[100];
	private int countHD; 
	private int countVN;
	private int countNN;
	
	public void khVN() {
		KhachHangVN khachHangVn=new KhachHangVN();
		if(countHD>100) 
		      System.out.println("Khong the them du lieu!"); 
		else 
	    {   
			khachHang[countHD] = new KhachHangVN(); 
			khachHangVn.nhap(); 
	        khachHang[countHD]=khachHangVn;
	        if(khachHangVn.getSoLuong()<=khachHangVn.getDinhMuc()) {
	        	khachHangVn.setSum(khachHangVn.getSoLuong()*khachHangVn.getDonGia());
	        }
	        else {
	        	double k=khachHangVn.getDonGia()*khachHangVn.getDinhMuc()+(khachHangVn.getSoLuong()-khachHangVn.getDinhMuc())*2.5;
	        	khachHangVn.setSum(k);
	        }
	        countVN++;
	    }
	}
	
	public void khNN() {
		KhachHangNuocNgoai kHangNuocNgoai=new KhachHangNuocNgoai();
		if(countHD>100) 
		      System.out.println("Khong the them du lieu!"); 
		else 
	    {
			khachHang[countHD]=new KhachHangNuocNgoai();
			kHangNuocNgoai.nhap();
			khachHang[countHD]=kHangNuocNgoai;
			kHangNuocNgoai.setSum(kHangNuocNgoai.getDonGia()*kHangNuocNgoai.getSoLuong());
			countNN++;
	    }
	}
	
	public void soluong() {
		 System.out.println("------------/---------------/------------"); 
		 System.out.println("| Số lượng hóa đơn người Việt: " + countVN + "|"); 
		 System.out.println("| Số lượng hóa đơn người nước ngoài: " + countNN + "|"); 
	}
	
	public void TB(int a, int b) {
		Calendar biCalendar=new GregorianCalendar();
		int sum=0;
		int count=0;
		for(int i=0 ; i<countHD; i++) {
			biCalendar.setTime(khachHang[i].getNgayHoaDon());
			int k=biCalendar.get(Calendar.MONTH)+1;
			int h=biCalendar.get(Calendar.YEAR);
			if(k==a && h==b) {
				if(khachHang[i] instanceof KhachHangVN) {
		    		KhachHangVN gk=new KhachHangVN();
		    		gk=(KhachHangVN) khachHang[i];
		    		sum+=gk.getSum();
				}
				else {
					KhachHangNuocNgoai gk=new KhachHangNuocNgoai();
		    		gk=(KhachHangNuocNgoai) khachHang[i];
		    		sum+=gk.getSum();
				}
				count++;
			}
			//System.out.println(k+" "+h);
		}
		double tb=sum/count;
		System.out.println("Trung bình thành tiền của hóa đơn tháng "+a+" là "+tb );
	}
	public void xuat() {
		for(int i=0 ; i<countHD; i++) 
	    { 
	    	if(khachHang[i] instanceof KhachHangVN) {
	    		KhachHangVN gk=new KhachHangVN();
	    		gk=(KhachHangVN) khachHang[i];
				      //System.out.println(hd[i].toString()); 
				    
				    System.out.println("----------------Hóa Đơn-----------------"); 
				    System.out.println("| Ma Hoa Don " + gk.maHoaDon + "|"); 
				    System.out.println("| Ten Khach : " + gk.hoTen + "|"); 
				    System.out.println("| Ngày Hóa Đơn : " + gk.ngayHoaDon + "|"); 
				    System.out.println("| Số lượng: " + gk.getSoLuong()+ "|"); 
				    System.out.println("| Đơn Giá : " + gk.donGia + "|"); 
				    System.out.println("| Định mức: " + gk.getDinhMuc()+ "|"); 
				    System.out.println("| Đối tượng: " + gk.getDoiTuong()+ "|"); 
				    System.out.println("| Tổng tiền: " + gk.getSum() + "|"); 
				    System.out.println("------------------------------------------"); 
	    	}
	    	else {
	    		KhachHangNuocNgoai gk=new KhachHangNuocNgoai();
	    		gk=(KhachHangNuocNgoai) khachHang[i];
				      //System.out.println(hd[i].toString()); 
				    
				    System.out.println("----------------Hóa Đơn-----------------"); 
				    System.out.println("| Ma Hoa Don " + gk.maHoaDon + "|"); 
				    System.out.println("| Ten Khach : " + gk.hoTen + "|"); 
				    System.out.println("| Ngày Hóa Đơn : " + gk.ngayHoaDon + "|"); 
				    System.out.println("| Số lượng: " + gk.getSoLuong()+ "|"); 
				    System.out.println("| Đơn Giá : " + gk.donGia + "|"); 
				    System.out.println("| Quốc tịch: " + gk.getQuocTich()+ "|");
				    System.out.println("| Định mức: " + gk.soLuong+ "|"); 
				    System.out.println("| Tổng tiền: " +gk.getSum() + "|"); 
				    System.out.println("------------------------------------------"); 
	    	}
	    }
	}
}
