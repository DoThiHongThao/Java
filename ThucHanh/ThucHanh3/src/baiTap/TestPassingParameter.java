package baiTap;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Dung Le");
		DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
		System.out.println("cinderellaDVD title: "+ cinderellaDVD.getTitle());
		
		changTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
	}
	
	public static void swap(Object o1,Object o2) {
		Object tmp =o1;
		o1=o2;
		o2=tmp;
	}
	public static void changTitle(DigitalVideoDisc dvd,String title) {
		String oldTitleString=dvd.getTitle();
		dvd.setTitle(title);
		dvd=new DigitalVideoDisc(oldTitleString);
	}

}
