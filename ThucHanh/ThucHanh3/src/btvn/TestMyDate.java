package btvn;

import java.text.ParseException;
import javax.swing.JOptionPane;

public class TestMyDate extends DateUtils{

	static MyDate[] dates = new MyDate[100];

	public static void main(String[] args) throws ParseException {
    	MyDate my1 = new MyDate();
    	String a;
    	int b;
    	do {
    		a=JOptionPane.showInputDialog(null,"****************Menu******************\n"
												+"1. In ngay co san\n"
												+"2. Nhap mang va sap xep\n"
												+"3. Thoat\n"
												+"****************************************\n"
												+"=> Nhap lua chon: ");
			b=Integer.parseInt(a);
			switch(b) {
				case 1:
					int d;
					do {
						String c=JOptionPane.showInputDialog(null, "****************Menu******************\n"
																+"1. MyDate()\n"
																+"2. MyDate(24, 9, 1999)\n"
																+"3. MyDate(\"Jan/1/1999\")\n"
																+"4. Nhap ngay va hien thi\n"
																+"5. Hien thi ngay hien tai\n"
																+"6. Hien thi theo String\n"
																+"7. Thoat\n");
						d=Integer.parseInt(c);
						switch(d) {
							case 1:
								
						    	my1.hienthiDate();
						    	break;
						    case 2:
						    	MyDate my2 = new MyDate(24, 9, 1999);
						    	my2.hienthiDate();
						    	break;
						    case 3:
						    	MyDate my3 = new MyDate("Jan/1/1999");
						    	my3.hienthiDate();
						    	
						    	break;
						    case 4:
						    	my1.accept();
						    	my1.hienthiDate();
						    	break;
						    case 5:
						    	my1.print();
						    	break;
						    case 6:
						    	my1.print("2/10/1789");
						    	break;
						}
					}while (d!=7);
					break;
				case 2:
					MyDate[] dates = new MyDate[100];
			    	String m = JOptionPane.showInputDialog(null,"Nhap so phan tu trong mang: ",JOptionPane.INFORMATION_MESSAGE);
			    	int n=Integer.parseInt(m);
			    	if(n <=  100) {
				    	for(int i = 0; i < n; i++) {
				    		dates[i] = new MyDate();
				    		dates[i].accept();
				    	}
				    	sortDate(dates, n);
			    	}
					break;
			}
    	}while(b!=3);
    	
    }
}