package btvn;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DateUtils {
	
	static MyDate[] date = new MyDate[100];;
	
	
	public static void CompareDate(MyDate date1, MyDate date2) {
		String string = "";
		String str1 = ""+date1.getNgay()+"/"+date1.getThang()+"/"+date1.getNam();
		String str2 = ""+date2.getNgay()+"/"+date2.getThang()+"/"+date2.getNam();
		int test = str1.compareToIgnoreCase(str2);
		if(test > 0) {
			string += date1.toString() +" sau "+date2.toString();
			JOptionPane.showMessageDialog(null, string, "So Sanh", JOptionPane.INFORMATION_MESSAGE);
		}else if(test < 0) {
			string += date1.toString() +" truoc "+date2.toString();
			JOptionPane.showMessageDialog(null, string, "So Sanh", JOptionPane.INFORMATION_MESSAGE);
		}else {
			string += date1.toString() +" trung "+date2.toString();
			JOptionPane.showMessageDialog(null, string, "So Sanh", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void nhapMyDate(MyDate date) {
		date.accept();
	}
	
	public static void sortDate(MyDate[] dates, int ptu) throws ParseException {
		ArrayList<String> date = new ArrayList<String>();
		String dateStr = "";
		//SimpleDateFormat simple = new SimpleDateFormat("DD/MM/YYYY");
		String hienthi = "";
		
		for(int i = 0; i < ptu; i++) {
			dateStr = dates[i].getNgay()+"/"+dates[i].getThang()+"/"+dates[i].getNam();
			date.add(dateStr);
			dateStr = "";
		}
		Object[] dateTT = date.toArray();
		for(int i = 0; i < ptu - 1; i++) {
			for(int j = i+1; j < ptu; j++) {
				if(date.get(i).compareTo(date.get(j)) > 0) {
					Object tmp = dateTT[i];
					dateTT[i] = dateTT[j];
					dateTT[j] = tmp;
				}
			}
		}
		for(int i = 0; i < ptu; i++) {
			hienthi += dateTT[i] +"\n";
		}
		JOptionPane.showMessageDialog(null, hienthi);
	}
	
}