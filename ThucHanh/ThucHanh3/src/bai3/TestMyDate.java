package bai3;
import bai3.MyDate;
public class TestMyDate {
	public static void main(String[] args){
        MyDate a= new MyDate();
        a.HienThi();
        MyDate b=new MyDate(5,7,1992);
        b.HienThi();
        MyDate c=new MyDate();
        c.Nhap();
        c.HienThi();
    }
}
