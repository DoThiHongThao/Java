package btvn;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MyDate{
	Scanner scanner = new Scanner(System.in);
    private int ngay;
    private int thang;
    private int nam;

    public void setNgay(String ngay) {
    	int testDay = Integer.parseInt(ngay);
		if(testDay > 31 || testDay <= 0) {
			System.out.println("Nhap ngay bi sai! Nhap Lai!");
			accept();
		}else {
			if(this.getThang() == 4 || this.getThang() == 6 ||
				this.getThang() == 9 || this.getThang() == 11) {
				if(testDay == 31) {
					System.out.println("Nhap ngay bi sai! Nhap Lai!");
					accept();
				}
				this.ngay = testDay;
			}
			if(this.getThang() == 2) {
				if(testDay > 29) {
					System.out.println("Nhap ngay bi sai! Nhap Lai!");
					accept();
				}else if(testDay == 29 && this.getNam() % 4 != 0) {
					System.out.println("Nhap ngay bi sai! Nhap Lai!");
					accept();
				}else { 
					this.ngay = testDay;
				}
			}
			if(this.getThang() == 1 || this.getThang() == 3 || this.getThang() == 5 || this.getThang() == 7 ||
					this.getThang() == 8 || this.getThang() == 10 ||this.getThang() == 12) {
				this.ngay = testDay;
			}
		}
	}
    
    public void setNgay(int ngay){
        if(ngay <= 31 && ngay >= 1){
            this.ngay = ngay;
        }else if(ngay > 31 || ngay < 1){
            JOptionPane.showMessageDialog(null, "Ban nhap ngay sai");
        }
    }
    
    public int getNgay(){
        return ngay;
    }
    public void setThang(int thang){
        if(thang <= 12 && thang >= 1){
            this.thang = thang;
        }
    }
    
    public void setThang(String thang) {
		switch(thang) {
		case "January": case "Jan": case "1":
			this.thang = 1;
			break;
		case "February": case "Feb": case "2":
			this.thang = 2;
			break;
		case "March": case "Mar": case "3":
			this.thang = 3;
			break;
		case "April": case "4": case "Apr":
			this.thang = 4;
			break;
		case "May": case "5": 
			this.thang = 5;
			break;
		case "June": case "Jun": case "6":
			this.thang = 6;
			break;
		case "July": case "Jul": case "7":
			this.thang = 7;
			break;
		case "August": case "8": case "Aug":
			this.thang = 8;
			break;
		case "September": case "9": case "Sep":
			this.thang = 9;
			break;
		case "October": case "10": case "Oct":
			this.thang = 10;
			break;
		case "November": case "11": case "Nov":
			this.thang = 11;
			break;
		case "December": case "12": case "Dec":
			this.thang = 12;
			break;
		default:
			System.out.println("Thang ban dua vao bi sai");
			break;
		}
	}
    
    public int getThang(){
        return thang;
    }
    public void setNam(String nam) {
		int namTest = Integer.parseInt(nam);
		if(namTest < 0) {
			System.out.println("Nhap sai nam moi ban nhap lai!");
			accept();
		}else {
			this.nam = namTest;
		}
	}
    
    public void setNam(int nam){
        this.nam = nam;
    }
    public int getNam(){
        return nam;
    }

    public MyDate(){
        Calendar cal = Calendar.getInstance(); // ngay thang nam hien tai
        setNam(cal.get(Calendar.DAY_OF_MONTH));
        setNgay(cal.get(Calendar.MONTH) + 1);
        setThang(cal.get(Calendar.YEAR));
    }

    public MyDate(int ngay, int thang, int nam){
        setNam(nam);
        setThang(thang);
        setNgay(ngay);
    }
    
    public MyDate(String date) {
    	String testStr = "\\w+/{1}+\\d{1,2}+/{1}+\\d{1,4}+";
    	if(!date.matches(testStr)) {
    		System.out.println("Ban truyen vao khong thang cong!");
    		return;
    	}
    	String in[] = date.split("/");
    	this.setThang(in[0]);
    	this.setNam(in[2]);
    	this.setNgay(in[1]);
    }

    public void nhapDate(){
        String Dngay, Dthang, Dnam;
        int iLuaChon = JOptionPane.NO_OPTION;
        Dngay = JOptionPane.showInputDialog(null, "Hãy nhập ngày: ", "Nhập ngày", JOptionPane.INFORMATION_MESSAGE);
        ngay = Integer.parseInt(Dngay);
        while((ngay < 1 || ngay > 31) && iLuaChon != JOptionPane.YES_OPTION){
            iLuaChon = JOptionPane.showConfirmDialog(null, "Có lỗi xảy ra. Yêu cầu nhập ngày (1-31).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            if(iLuaChon == JOptionPane.YES_OPTION){
                Dngay = JOptionPane.showInputDialog(null, "Hãy nhập ngày: ", "Nhập ngày", JOptionPane.INFORMATION_MESSAGE);
                ngay = Integer.parseInt(Dngay);
            }
        }
        iLuaChon = JOptionPane.NO_OPTION;
        Dthang = JOptionPane.showInputDialog(null, "Hãy nhập tháng: ", "Nhập tháng", JOptionPane.INFORMATION_MESSAGE);
        thang = Integer.parseInt(Dthang);
        while((thang < 1 || thang > 12) && iLuaChon != JOptionPane.YES_OPTION){
            iLuaChon = JOptionPane.showConfirmDialog(null, "Có lỗi xảy ra. Yêu cầu nhập tháng (1-12).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            if(iLuaChon == JOptionPane.YES_OPTION){
                Dthang = JOptionPane.showInputDialog(null, "Hãy nhập tháng: ", "Nhập tháng", JOptionPane.INFORMATION_MESSAGE);
                thang = Integer.parseInt(Dthang);
            }
        }
        iLuaChon = JOptionPane.NO_OPTION;
        Dnam = JOptionPane.showInputDialog(null, "Hãy nhập năm: ", "Nhập năm", JOptionPane.INFORMATION_MESSAGE);
        nam = Integer.parseInt(Dnam);
        while(nam < 1 && iLuaChon != JOptionPane.YES_OPTION){
            iLuaChon = JOptionPane.showConfirmDialog(null, "Có lỗi xảy ra. Yêu cầu nhập năm (> 0).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            if(iLuaChon == JOptionPane.YES_OPTION){
                Dnam = JOptionPane.showInputDialog(null, "Hãy nhập năm: ", "Nhập năm", JOptionPane.INFORMATION_MESSAGE);
                nam = Integer.parseInt(Dnam);
            }
        }
    }
    
    public void accept() {
		String string;
		String strtest = "\\w+/{1}\\w{0,30}.{0,1}\\w+/{1}\\d{1,4}+";
		do {
			string = JOptionPane.showInputDialog(null, "Hãy nhập date theo mẫu (MM/DD/YYYY): ", "Nhập Date", JOptionPane.INFORMATION_MESSAGE);
			if(!string.matches(strtest)) {
				JOptionPane.showMessageDialog(null, "Nhap sai! Nhap lai!", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}while(!string.matches(strtest));
		String date[] = string.split("/");
		this.setThang(date[0]);
		this.handlingDay(date[1]);
		this.setNam(date[2]);
	}

    private void handlingDay(String string) {
		// TODO Auto-generated method stub
		switch(string) {
		case "First": case "1": case "1st":
			this.setNgay("1");
			break;
		case "Second": case "2": case "2nd":
			this.setNgay("2");
			break;
		case "Third": case "3": case "3rd":
			this.setNgay("3");
			break;
		case "Fourth": case "4": case "4th":
			this.setNgay("4");
			break;
		case "Fifth": case "5": case "5th":
			this.setNgay("5");
			break;
		case "Sixth": case "6": case "6th":
			this.setNgay("6");
			break;
		case "Seventh": case "7": case "7th":
			this.setNgay("7");
			break;
		case "Eighth": case "8": case "8th":
			this.setNgay("8");
			break;
		case "Ninth": case "9": case "9th":
			this.setNgay("9");
			break;
		case "Tenth": case "10": case "10th":
			this.setNgay("10");
			break;
		case "Eleventh": case "11": case "11th":
			this.setNgay("11");
			break;
		case "Twelfth": case "12": case "12th":
			this.setNgay("12");
			break;
		case "Thirteenth": case "13": case "13th":
			this.setNgay("13");
			break;
		case "Fourteenth": case "14": case "14th":
			this.setNgay("14");
			break;
		case "Fifteenth": case "15": case "15th":
			this.setNgay("15");
			break;
		case "Sixteenth": case "16": case "16th":
			this.setNgay("16");
			break;
		case "Seventeenth": case "17": case "17th":
			this.setNgay("17");
			break;
		case "Eighteenth": case "18": case "18th":
			this.setNgay("18");
			break;
		case "Nineteenth": case "19": case "19th":
			this.setNgay("19");
			break;
		case "Twentieth": case "20": case "20th":
			this.setNgay("20");
			break;
		case "Twenty-first": case "21": case "21st":
			this.setNgay("21");
			break;
		case "Twenty-second": case "22": case "22nd":
			this.setNgay("22");
			break;
		case "Twenty-third": case "23": case "23rd":
			this.setNgay("23");
			break;
		case "Twenty-fourth": case "24": case "24th":
			this.setNgay("24");
			break;
		case "Twenty-fifth": case "25": case "25th":
			this.setNgay("25");
			break;
		case "Twenty-sixth": case "26": case "26th":
			this.setNgay("26");
			break;
		case "Twenty-seventh": case "27": case "27th":
			this.setNgay("27");
			break;
		case "Twenty-eighth": case "28": case "28th":
			this.setNgay("28");
			break;
		case "Twenty-ninth": case "29": case "29th":
			this.setNgay("29");
			break;
		case "Thirtieth": case "30": case "30th":
			this.setNgay("30");
			break;
		case "Thirty-first": case "31": case "31th":
			this.setNgay("31");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Nhap sai ngay! Nhap lai!", "ERROR", JOptionPane.ERROR_MESSAGE);
			accept();
		}
	}

	public void print() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String strDate = "Current Date: " + date.toString();
		JOptionPane.showMessageDialog(null, strDate);
	}
    
    public void print(String date) throws java.text.ParseException{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date sDate = simpleDateFormat.parse(date);
		SimpleDateFormat simple2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String strDate = simple2.format(sDate).toString();
		JOptionPane.showMessageDialog(null, strDate);
	}
    
    public void hienthiDate(){
        Calendar cal = Calendar.getInstance();
        cal.set(getNam(), getThang() - 1, getNgay());
        String strHienThi = "Thời gian: ";
        strHienThi +=(cal.get(Calendar.DAY_OF_WEEK) == 1)?"Chủ nhật":"Thứ "+cal.get(Calendar.DAY_OF_WEEK)
        +", Ngày " +String.valueOf(this.ngay)+"-"+String.valueOf(this.thang)+"-"+String.valueOf(this.nam);
        JOptionPane.showMessageDialog(null, strHienThi, "Hiển thị thời gian", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public String toString() {
    	LocalDateTime local = LocalDateTime.of(this.getNam(), this.getThang(), this.getNgay(), 0, 0);
    	return ""+local.getMonth()+"/"+local.getDayOfMonth()+"/"+local.getYear();
    }
}