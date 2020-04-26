package bai3;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HoaDon {
	Scanner a = new Scanner(System.in);
	protected String maHoaDon;
	protected Date ngayHoaDon;
	protected String tenKhach;
	protected int donGia;
	
	protected String getMaHoaDon() {
		return maHoaDon;
	}
	protected void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	protected Date getNgayHoaDon() {
		return ngayHoaDon;
	}
	protected void setNgayHoaDon(Date ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}
	protected String getTenKhach() {
		return tenKhach;
	}
	protected void setTenKhach(String tenKhach) {
		this.tenKhach = tenKhach;
	}
	protected int getDonGia() {
		return donGia;
	}
	protected void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	protected HoaDon(String maHoaDon, Date ngayHoaDon, String tenKhach, int donGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.tenKhach = tenKhach;
		this.donGia = donGia;
	}
	protected HoaDon() {
		this.maHoaDon = "";
		this.ngayHoaDon = null;
		this.tenKhach = "";
		this.donGia = 0;
	}
	protected void nhap() {
		System.out.print("Ma Hoa Don: ");
		this.maHoaDon=a.nextLine();
		System.out.print("Ngay Hoa Don: ");
		String s=a.nextLine();
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	    try {
			this.ngayHoaDon=df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Ten Khach: ");
		this.tenKhach=a.nextLine();
		System.out.print("Don Gia: ");
		this.donGia=a.nextInt();
//		Calendar cal=Calendar.getInstance();
		
	}
	public String toString() {
		return "Ma Hoa Don"+getMaHoaDon()+"\n Ngay hoa don"+getNgayHoaDon()+"\n Ten Khanh"+getTenKhach()+"\nDon Gia"+getDonGia();
	}
}
