package Bai2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SachThamKhao extends Sach {
	private String ChuyenNganh;
	private double Thue;
	Scanner in = new Scanner(System.in); 
	public void setChuyenNganh(String ChuyenNganh) {
		this.ChuyenNganh=ChuyenNganh;
	}
	public String getChuyenNganh() {
		return ChuyenNganh;
	}
	public void setThue(int Thue) {
		this.Thue=Thue;
	}
	public double getThue() {
		return Thue;
	}
	public SachThamKhao() {
		super();
		this.ChuyenNganh="";
		this.Thue=0;
	}
	public SachThamKhao(String MaSach, String TieuDe, String NXB, double DonGia, int SoLuong, Date NgayNhap,String ChuyenNganh,double Thue) {
		super(MaSach,TieuDe,NXB,DonGia,SoLuong,NgayNhap);
		this.ChuyenNganh=ChuyenNganh;
		this.Thue-=Thue;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập Chuyên Ngành ");
		ChuyenNganh=in.nextLine();
		System.out.println("Nhập tiền thuế: ");
		Thue=in.nextInt();
	}
	public String toString() 
	  {
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	  return "\nMã Sách " + this.MaSach + "\nTiêu đề: " + this.TieuDe + "\nNhà Xuất Bản: " + this.NXB +"\n Đơn Giá:"+this.DonGia
			  +"\nSố lượng:"+this.SoLuong+"\nChuyên Ngành: "+this.ChuyenNganh+"\nThuế: "+this.Thue+"\nNgày Nhập: "+df.format(NgayNhap); 
	  } 
}
