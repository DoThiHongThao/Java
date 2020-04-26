package qlyTienDien;

import java.util.Date;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;
	private int sum;
	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	
	public KhachHangNuocNgoai(String maHoaDon, Date ngayHoaDon, String hoTen, int soLuong, int donGia,
			String quocTich) {
		super(maHoaDon, ngayHoaDon, hoTen, soLuong, donGia);
		this.quocTich = quocTich;
	}
	
	public KhachHangNuocNgoai() {
		super();
		this.quocTich = null;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhao quoc tich: ");
		this.quocTich=a.nextLine();
	}
	
}
