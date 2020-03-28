package vidu;

import javax.swing.JOptionPane;

public class Point_3 {
	private String tenDiem;
	  private double tungDo;
	  private double hoanhDo;

    // Ham khoi tao khong tham so
    public Point_3()
    {
		  setTenDiem("A");
		  setTungDo(0.0);
		  setHoanhDo(0.0);
    }

	  // Ham khoi tao 2 tham so tung do va hoanh do
    public Point_3(double tung, double hoanh)
    {
		  setTenDiem("Noname");
		  setTungDo(tung);
		  setHoanhDo(hoanh);
    }


    // Ham khoi tao 3 tham so ten diem, tung do va hoanh do
    public Point_3(String ten,  double tung, double hoanh)
    {
		  setTenDiem(ten);
		  setTungDo(tung);
		  setHoanhDo(hoanh);
    }

    public void setTenDiem(String ten){
		  tenDiem = ten;
    }

	  public void setTungDo(double tung){
		  tungDo = tung;
    }

    public void setHoanhDo(double hoanh){
	  	  hoanhDo = hoanh;
    }

    public String getTenDiem(){
		  return tenDiem;
	  }

    public double getTungDo(){
		  return tungDo;
	  }

	  public double getHoanhDo(){
	  		  return hoanhDo;
	  }

    public void nhap(){
		  String strTenDiem, strTung, strHoanh;
		  double dTung, dHoanh;

		  strTenDiem = JOptionPane.showInputDialog(null,
"Nhap ten diem: ",JOptionPane.INFORMATION_MESSAGE);
		  setTenDiem(strTenDiem);

		  strTung = JOptionPane.showInputDialog(null,
"Nhap tung do: ",JOptionPane.INFORMATION_MESSAGE);
		  dTung = Double.parseDouble(strTung);
		  setTungDo(dTung);

		  strHoanh= JOptionPane.showInputDialog(null,
"Nhap hoanh do: ",JOptionPane.INFORMATION_MESSAGE);
		  dHoanh = Double.parseDouble(strHoanh);
		  setHoanhDo(dHoanh);
	  }

	  public void hienThi(){
	  	  JOptionPane.showMessageDialog(null, "Point: "
	  	  					+ getTenDiem() + "(" + getTungDo()
	  	  					+ "," + getHoanhDo() + ")");
	  }
}
