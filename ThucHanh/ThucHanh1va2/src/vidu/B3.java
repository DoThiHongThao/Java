package vidu;

public class B3 {
	public static boolean SoThuanNghich(int n){
        StringBuilder arr= new StringBuilder();
        String str= ""+n;
        arr.append(str);
        String check= ""+arr.reverse();
        if(str.equals(check)) return true;
        else return false;
	}
	public static void main(String[] args) {
		
		int n,count=0;
        for(n=100000 ; n<= 999999 ; n++){
        	if(SoThuanNghich(n)){
        		System.out.println(n);count++;
            }
        }
        System.out.println("Co "+count+" so thuan nghich co 6 chu so");
	}
}
