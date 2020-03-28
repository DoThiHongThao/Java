package vidu;
import vidu.Point_3;
public class TestPoint_3 {
	public static void main(String[] args) {
		//Goi ham khoi tao khong tham so
		Point_3 obj1 = new Point_3();

		obj1.hienThi();

		//Goi ham khoi tao 2 tham so
		Point_3 obj2 = new Point_3(-12.8, 13);
		obj2.hienThi();

		//Goi ham khoi tao 3 tham so
		Point_3 obj3 = new Point_3("B", 3.5, 4.5);
		obj3.hienThi();

		Point_3 obj4 = new Point_3();
		obj4.nhap();
		obj4.hienThi();
	}
}
