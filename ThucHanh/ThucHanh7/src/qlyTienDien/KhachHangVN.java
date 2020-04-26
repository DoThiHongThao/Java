package qlyTienDien;

import java.util.Date;

public class KhachHangVN extends KhachHang{
	private String doiTuong;
	private int dinhMuc;
	private double sum;
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public int getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public KhachHangVN(String maHoaDon, Date ngayHoaDon, String hoTen, int soLuong, int donGia, String doiTuong,
			int dinhMuc) {
		super(maHoaDon, ngayHoaDon, hoTen, soLuong, donGia);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}
	public KhachHangVN() {
		super();
		this.doiTuong = null;
		this.dinhMuc = 0;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap doi tuong: ");
		this.doiTuong=a.nextLine();
		System.out.println("Nhap dinh muc: ");
		this.dinhMuc=a.nextInt();
	}
}
