package bai3;

import java.sql.Date;

class HoaDonGio extends HoaDon{
	private int soGio;
	private double sum;
	protected int getSoGio() {
		return soGio;
	}

	protected void setSoGio(int soGio) {
		this.soGio = soGio;
	}
	
	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public HoaDonGio(String maHoaDon, Date ngayHoaDon, String tenKhach, int donGia,int soGio) {
		super(maHoaDon,ngayHoaDon,tenKhach,donGia);
		this.soGio=soGio;
	}
	
	public HoaDonGio() {
		super();
		this.soGio=0;
	}
	
	public void nhap() {
		super.nhap();
		System.out.print("So Gio: ");
		this.soGio=a.nextInt();
	}
	public String toString() {
		return "Ma Hoa Don: "+getMaHoaDon()+"\n Ngay hoa don: "+getNgayHoaDon()+"\n Ten Khanh: "+getTenKhach()+"\nDon Gia: "+getDonGia()+"\nSo Ngay:"+getSoGio();
	}
}
