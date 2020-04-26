package qlyTienDien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {
	Scanner a = new Scanner(System.in);
	protected String maHoaDon;
	protected Date ngayHoaDon;
	protected String hoTen;
	protected int soLuong;
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
	protected String getHoTen() {
		return hoTen;
	}
	protected void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	protected int getSoLuong() {
		return soLuong;
	}
	protected void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	protected int getDonGia() {
		return donGia;
	}
	protected void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	protected KhachHang(String maHoaDon, Date ngayHoaDon, String hoTen, int soLuong, int donGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.hoTen = hoTen;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	protected KhachHang() {
		super();
		this.maHoaDon = null;
		this.ngayHoaDon = null;
		this.hoTen = null;
		this.soLuong = 0;
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
		System.out.print("Ho ten khach hang: ");
		this.hoTen=a.nextLine();
		System.out.print("So luong: ");
		this.soLuong=a.nextInt();
		System.out.print("Don Gia: ");
		this.donGia=a.nextInt();
		
	}
	public String toString() {
		return "Ma Hoa Don"+getMaHoaDon()+"\n Ngay hoa don"+getNgayHoaDon()+"\n Ho ten khach"+getHoTen()+"\nSo luong "+getSoLuong()+"\nDon Gia"+getDonGia();
	}
}
