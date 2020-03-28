package bai3;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class MyDate {
	private int ngay;
    private int thang;
    private int nam;
    public void setNgay(int ngay){
        this.ngay=ngay;
    }
    public void setThang(int thang){
        this.thang=thang;
    }
    public void setNam(int nam){
        this.nam=nam;
    }
    public int getNgay(){
        return ngay;
    }
    public int getThang(){
        return thang;
    }
    public int getNam(){
        return nam;
    }
    // public MyDate(){
    //     setNgay(12);
    //     setThang(6);
    //     setNam(2019);
    // }
    public MyDate()
   {
	Calendar cal = Calendar.getInstance(); // Ngay thang nam hien tai

	setNgay(cal.get(Calendar.DAY_OF_MONTH));
	setThang(cal.get(Calendar.MONTH) + 1);
	setNam(cal.get(Calendar.YEAR));
   }

    public MyDate(int ngay, int thang, int nam){
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
    }
    public void Nhap(){
        String strngay, strthang, strnam;
        int ngay, thang, nam;

        do{
            strngay = JOptionPane.showInputDialog(null,"Nhap ngay: ",JOptionPane.INFORMATION_MESSAGE);
            ngay = Integer.parseInt(strngay);
            setNgay(ngay);
        }while(ngay<0 && ngay>31);

        do{
            strthang = JOptionPane.showInputDialog(null,"Nhap thang: ",JOptionPane.INFORMATION_MESSAGE);
            thang = Integer.parseInt(strthang);
            setThang(thang);
        }while(thang<1 && thang>12);

        do{
		    strnam= JOptionPane.showInputDialog(null,"Nhap nam: ",JOptionPane.INFORMATION_MESSAGE);
            nam = Integer.parseInt(strnam);
            setNam(nam);
        }while(nam<0);
    }
    public void HienThi(){
        JOptionPane.showMessageDialog(null, "Ngay/Thang/Nam: "+ getNgay() + "/" + getThang()+ "/" + getNam()  );
    }
}
