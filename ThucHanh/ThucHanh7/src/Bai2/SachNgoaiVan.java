package Bai2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SachNgoaiVan extends Sach{
	private String NgonNgu;
	Scanner in = new Scanner(System.in);
	public void setNgonNgu(String NgonNgu) {
		this.NgonNgu=NgonNgu;
	}
	public String getNgonNgu() {
		return NgonNgu;
	}
	public SachNgoaiVan() {
		super();
		this.NgonNgu ="";
	}
	public SachNgoaiVan(String MaSach, String TieuDe, String NXB, double DonGia, int SoLuong, Date NgayNhap,String NgonNgu) {
		super(MaSach,TieuDe,NXB,DonGia,SoLuong,NgayNhap);
		this.NgonNgu=NgonNgu;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập Ngôn Ngữ: ");
		NgonNgu=in.nextLine();
	}
	public String toString() 
	  {
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	  return "\nMã Sách " + this.MaSach + "\nTiêu đề: " + this.TieuDe + "\nNhà Xuất Bản: " + this.NXB +"\n Đơn Giá:"+this.DonGia
			  +"\nSố lượng:"+this.SoLuong+"\nNgôn Ngữ: "+this.NgonNgu+"\nNgày Nhập: "+df.format(NgayNhap); 
	  } 
}
