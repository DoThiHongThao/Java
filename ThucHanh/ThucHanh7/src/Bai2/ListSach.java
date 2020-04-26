package Bai2;

public class ListSach {
	private Sach[] S = new Sach[100]; 
	  private int countS; 
	  private double sum1=0, sum2=0, sum3=0;
	  public void ListS() {
		  countS=0; 
		    for(int i=0; i<100; i++) 
		    { 
		      S[i] = new Sach(); 
		    } 
	  }
	  public void ListS(int temp)
	  { 
	    if(countS>100) 
	      System.out.println("Khong the them du lieu!"); 
	    else 
	    { 
	        if(temp==1) 
	        { 
	          S[countS] = new SachGIaoKhoa(); 
	          SachGIaoKhoa gk = new SachGIaoKhoa(); 
	          gk.nhap(); 
	          S[countS]=gk; 
	          if((gk.getTinhTrang().equals("mới"))==true) {
	        	  sum1+=(gk.getSoLuong()*gk.getDonGia()); 
	          }
	          if((gk.getTinhTrang().equals("cũ"))==true) {
	        	  sum1+=(gk.getSoLuong()*gk.getDonGia()*0.5); 
	          }
	        } 
	        else if(temp==2)
	        { 
	          S[countS] = new SachNgoaiVan(); 
	          SachNgoaiVan ngoaiv = new SachNgoaiVan(); 
	          ngoaiv.nhap(); 
	          S[countS]=ngoaiv; 
	          sum2+=(ngoaiv.getSoLuong()*ngoaiv.getDonGia()*1.2); 
	        } 
	        else {
	        	S[countS] = new SachThamKhao(); 
		        SachThamKhao tk = new SachThamKhao(); 
		        tk.nhap(); 
		        S[countS]=tk;
		        sum3+=(tk.getSoLuong()*tk.getDonGia()*tk.getThue());
	        }
	        countS++; 
	    } 
	  } 
	   
	  public void xuattt()
	  { 
	    for(int i=0 ; i<countS; i++) 
	    { 
	      System.out.println("------------/---------------/------------"); 
	      System.out.println(S[i].toString()); 
	    } 
	    System.out.println("----------------Thành Tiền-----------------"); 
	    System.out.println("| Sách Giáo Khoa: " + sum1 + "|"); 
	    System.out.println("| Sách Ngoại Văn : " + sum2 + "|"); 
	    System.out.println("| Sách Tham Khảo: " + sum3 + "|"); 
	    System.out.println("------------------------------------------"); 
	  } 
	   
}
