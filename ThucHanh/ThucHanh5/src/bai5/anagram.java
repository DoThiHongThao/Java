package bai5;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class anagram {
	public static boolean isAnagramSort(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}
	public static void main(String[] args) {
		String s,b;
		s=JOptionPane.showInputDialog(null,"Nhập chuỗi thứ nhất: ",JOptionPane.INFORMATION_MESSAGE);
		b=JOptionPane.showInputDialog(null,"Nhập chuỗi thứ hai: ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Kiểm tra 2 chuỗi có phải là angram: "+ isAnagramSort(s,b));
	}
}
