package bai3;

import java.sql.Date;

class HoaDonNgay extends HoaDon {
	private int soNgay;
	private double sum;
	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public HoaDonNgay(String maHoaDon, Date ngayHoaDon, String tenKhach, int donGia,int soNgay) {
		super(maHoaDon,ngayHoaDon,tenKhach,donGia);
		this.soNgay=soNgay;
	}
	
	public HoaDonNgay() {
		super();
		this.soNgay=0;
	}
	
	public void nhap() {
		super.nhap();
		System.out.print("So Ngay: ");
		this.soNgay=a.nextInt();
	}
	public String toString() {
		return "Ma Hoa Don: "+getMaHoaDon()+"\n Ngay hoa don: "+getNgayHoaDon()+"\n Ten Khanh: "+getTenKhach()+"\nDon Gia: "+getDonGia()+"\nSo Ngay:"+getSoNgay();
	}
}
