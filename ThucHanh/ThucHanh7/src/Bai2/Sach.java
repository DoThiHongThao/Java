package Bai2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Sach {
	protected String MaSach, TieuDe,NXB;
	protected double DonGia;
	protected int SoLuong;
	protected Date NgayNhap;
	Scanner in = new Scanner(System.in); 
	protected void setMaSach(String MaSach) {
		this.MaSach=MaSach;
	}
	protected String getMaSach() { 
	    return MaSach; 
	}
	protected void setTieuDe(String TieuDe) {
		this.TieuDe=TieuDe;
	}
	protected String getTieuDe() {
		return TieuDe;
	}
	protected void setNXB(String NXB) {
		this.NXB=NXB;
	}
	protected String getNXB() {
		return NXB;
	}
	protected void setDonGia(double DonGia) {
		this.DonGia=DonGia;
	}
	protected double getDonGia() {
		return DonGia;
	}
	protected void setSoLuong(int SoLuong) {
		this.SoLuong=SoLuong;
	}
	protected int getSoLuong() {
		return SoLuong;
	}
	protected void setNgayNhap(Date NgayNhap) {
		this.NgayNhap=NgayNhap;
	}
	protected Date getNgayNhap() {
		return NgayNhap;
	}
	protected Sach() {
		this.MaSach="";
		this.TieuDe="";
		this.NXB="";
		this.DonGia=0;
		this.SoLuong=0;
		this.NgayNhap=null;
	}
	protected Sach(String MaSach, String TieuDe, String NXB, double DonGia, int SoLuong, Date NgayNhap) {
		this.MaSach=MaSach;
		this.TieuDe=TieuDe;
		this.NXB=NXB;
		this.DonGia=DonGia;
		this.SoLuong=SoLuong;
		this.NgayNhap=NgayNhap;
	}
	protected void nhap() 
	  { 
	    System.out.println("Mã Sách : "); 
	    this.MaSach=in.nextLine(); 
	    System.out.println("Tiêu đề sách: "); 
	    this.TieuDe=in.nextLine(); 
	    System.out.println("Nhà Xuất Bản: "); 
	    this.NXB=in.nextLine(); 
	    System.out.println("Don Gia: "); 
	    this.DonGia=in.nextDouble(); 
	    System.out.println("Số Lượng: ");
	    this.SoLuong=in.nextInt();
	    Calendar cal=Calendar.getInstance();
	    //SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	    //System.out.println(df.format(cal.getTime()));
	    this.NgayNhap=(Date) cal.getTime();
	  } 
	public String toString() 
	  {
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	  return "\nMã Sách " + this.MaSach + "\nTiêu đề: " + this.TieuDe + "\nNhà Xuất Bản: " + this.NXB +"\n Đơn Giá:"+this.DonGia
			  +"\nSố lượng:"+this.SoLuong+"Ngày Nhập: "+df.format(NgayNhap); 
	  } 
	   
}
