package vidu;

public class TamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=5;
		for(int i=0; i<=h; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		for(int i=0; i<h; i++) {
			for(int j=h; j>i; j--) {
				System.out.printf(" ");
			}
			System.out.printf("*");
			for(int j=0; j<2*i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

}
