package Bai2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SachGIaoKhoa extends Sach{
	public String TinhTrang;
	Scanner in = new Scanner(System.in); 
	public void setTinhTrang(String TinhTrang) {
		this.TinhTrang=TinhTrang;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public SachGIaoKhoa() {
		super();
		this.TinhTrang="";
	}
	public SachGIaoKhoa(String MaSach, String TieuDe, String NXB, double DonGia, int SoLuong, Date NgayNhap,String TinhTrang) {
		super(MaSach,TieuDe,NXB,DonGia,SoLuong,NgayNhap);
		this.TinhTrang=TinhTrang;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập Tình Trạng: ");
		TinhTrang=in.nextLine();
	}
	public String toString() 
	  {
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	  return "\nMã Sách " + this.MaSach + "\nTiêu đề: " + this.TieuDe + "\nNhà Xuất Bản: " + this.NXB +"\n Đơn Giá:"+this.DonGia
			  +"\nSố lượng:"+this.SoLuong+"\nTình trạng: "+this.TinhTrang+"\nNgày Nhập: "+df.format(NgayNhap); 
	  } 
	   
}
