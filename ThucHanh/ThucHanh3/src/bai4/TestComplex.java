package bai4;

import javax.swing.JOptionPane;
import bai4.Complex;
public class TestComplex {
	public static void main(String[] args){
        String a;
        Complex s1= new Complex();
        Complex s2= new Complex();
        Complex kq= new Complex();
        int b;
        do{
            a = JOptionPane.showInputDialog(null,"1.Nhap\n"+"2. Tong\n"+"3.Hieu\n"+"4.Nhan\n"+"5.Chia\n"+"6.Thoat\n",JOptionPane.INFORMATION_MESSAGE);
            b=Integer.parseInt(a);
            switch(b){
                case 1:
                {
                    s1.nhapSoPhuc(s1);
                    s1.hienThi();
                    s2.nhapSoPhuc(s2);
                    s2.hienThi();
                    break;
                }
                case 2:
                {
                    kq.congHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
                case 3:{
                    kq.truHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
                case 4:{
                    kq.nhanHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
                case 5:{
                    kq.chiaHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
            }
        }while(b!=6);
    }
}
