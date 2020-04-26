package bai3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ListHoaDon {
	private HoaDon[] hd=new HoaDon[100];
	private int countHD; 
	private int countG=0;
	private int countN=0;
	private double sum1=0, sum2=0;
	public void ListS() {
		  countHD=0; 
		    for(int i=0; i<100; i++) 
		    { 
		      hd[i] = new HoaDon(); 
		    } 
	  }
	public void ListHDGio(){
		HoaDonGio gk=new HoaDonGio();
	    if(countHD>100) 
	      System.out.println("Khong the them du lieu!"); 
	    else 
	    {   
	    		hd[countHD] = new HoaDonGio(); 
	          gk.nhap(); 
	          hd[countHD]=gk; 
	          if(gk.getSoGio()<24) {
	        	  
	        	  
	        	  sum1=(gk.getSoGio()*gk.getDonGia()); 
	        	  gk.setSum(sum1);
	        	  countG++;
	          }
	          else if(gk.getSoGio()>24 && gk.getSoGio()<30) {
	        	  sum1=(24*gk.getDonGia()); 
	        	  gk.setSum(sum1);
	        	  countG++;

	          }
	          else if(gk.getSoGio()>30) {
	        	  System.out.println("Số giờ > 30 nên k dùng thể dùng loại hóa đơn theo giờ");
	          }
	        countHD++; 
	    } 
	  } 
	public void ListHDNgay() {
		HoaDonNgay gk=new HoaDonNgay();
		if(countHD>100) 
		      System.out.println("Khong the them du lieu!"); 
		else {
			hd[countHD] = new HoaDonNgay(); 
	        gk.nhap(); 
			if(gk.getSoNgay()<7) {
		        hd[countHD]=gk; 
		      	sum2=(gk.getSoNgay()*gk.getDonGia()); 
		      	gk.setSum(sum2);
			}
			else {
		        hd[countHD]=gk; 
		      	sum2=((gk.getSoNgay()-7)*gk.getDonGia()*0.8)+7*gk.getDonGia(); 
		      	gk.setSum(sum2);
			}
		}
		countN++;
		countHD++; 
	}
	
	public void SLTheoLoai() {
		 System.out.println("------------/---------------/------------"); 
		 System.out.println("| Số lượng thuê theo ngày: " + countN + "|"); 
		 System.out.println("| Số lượng thuê theo giờ: " + countG + "|"); 
	}
	public void TB(int a, int b) {
		Calendar biCalendar=new GregorianCalendar();
		int sum=0;
		int count=0;
		for(int i=0 ; i<countHD; i++) {
			biCalendar.setTime(hd[i].getNgayHoaDon());
			int k=biCalendar.get(Calendar.MONTH)+1;
			int h=biCalendar.get(Calendar.YEAR);
			if(k==a && h==b) {
				if(hd[i] instanceof HoaDonNgay) {
		    		HoaDonNgay gk=new HoaDonNgay();
		    		gk=(HoaDonNgay) hd[i];
		    		sum+=gk.getSum();
				}
				else {
					HoaDonGio gk=new HoaDonGio();
		    		gk=(HoaDonGio) hd[i];
		    		sum+=gk.getSum();
				}
				count++;
			}
			//System.out.println(k+" "+h);
		}
		double tb=sum/count;
		System.out.println("Trung bình thành tiền của hóa đơn tháng "+a+" là "+tb );
	}
	public void xuat()
	  { 
	    for(int i=0 ; i<countHD; i++) 
	    { 
	    	if(hd[i] instanceof HoaDonNgay) {
	    		HoaDonNgay gk=new HoaDonNgay();
	    		gk=(HoaDonNgay) hd[i];
				      //System.out.println(hd[i].toString()); 
				    
				    System.out.println("----------------Hóa Đơn-----------------"); 
				    System.out.println("| Ma Hoa Don " + gk.maHoaDon + "|"); 
				    System.out.println("| Ten Khach : " + gk.tenKhach + "|"); 
				    System.out.println("| Ngày Hóa Đơn : " + gk.ngayHoaDon + "|"); 
				    System.out.println("| Đơn Giá : " + gk.donGia + "|"); 
				    System.out.println("| Thoi gian: " + gk.getSoNgay()+ "|"); 
				    System.out.println("| Tổng tiền: " + gk.getSum() + "|"); 
				    System.out.println("------------------------------------------"); 
	    	}
	    	else {
	    		HoaDonGio gk=new HoaDonGio();
	    		gk=(HoaDonGio) hd[i];
				      //System.out.println(hd[i].toString()); 
				    
				    System.out.println("----------------Hóa Đơn-----------------"); 
				    System.out.println("| Ma Hoa Don " + gk.maHoaDon + "|"); 
				    System.out.println("| Ten Khach : " + gk.tenKhach + "|"); 
				    System.out.println("| Ngày Hóa Đơn : " + gk.ngayHoaDon + "|"); 
				    System.out.println("| Đơn Giá : " + gk.donGia + "|"); 
				    System.out.println("| Thoi gian: " + gk.getSoGio()+ "|"); 
				    System.out.println("| Tổng tiền: " +gk.getSum() + "|"); 
				    System.out.println("------------------------------------------"); 
	    	}
	    }
	  } 
}
