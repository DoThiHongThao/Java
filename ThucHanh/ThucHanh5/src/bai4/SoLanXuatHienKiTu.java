package bai4;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class SoLanXuatHienKiTu {
	public static void main(String[] args) {
		String s,b;
		s=JOptionPane.showInputDialog(null,"Nhập chuỗi: ",JOptionPane.INFORMATION_MESSAGE);
		b=JOptionPane.showInputDialog(null,"Nhập kí tự cần tìm: ",JOptionPane.INFORMATION_MESSAGE);
		StringTokenizer token=new StringTokenizer(s);
        int dem=0;
        while(token.hasMoreTokens()){
            String value=token.nextToken();
            if(value.contains(b))
                dem++;
        }
        JOptionPane.showMessageDialog(null, "Số lần xuất hiện của kí tự là: "+ dem);
	}
}
