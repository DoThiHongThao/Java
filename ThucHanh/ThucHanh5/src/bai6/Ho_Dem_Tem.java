package bai6;

//import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Ho_Dem_Tem {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,b;
		int k,i;
		k=0;
		char kytu;
		s=JOptionPane.showInputDialog(null,"Nhập họ đệm tên: ",JOptionPane.INFORMATION_MESSAGE);
		//StringTokenizer b= new StringTokenizer(s);
		for(i=s.length()-1; i>=0; i--)
		{
			kytu=s.charAt(i);
			if(Character.isSpace(kytu)) {
				k=i;
				break;
			}
		}
		int n=s.length();
		b=s.substring(k,n);
		b=b+" "+s.substring(0,k);
		JOptionPane.showMessageDialog(null, "Tên Họ Đệm : "+ b);
		
	}

}
