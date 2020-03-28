package bai1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DemTu {
	public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("Nhap vao 1 xau: ");
		String str= input.nextLine();
		StringTokenizer strToken= new StringTokenizer(str, " ");
		System.out.println("So cac tu trong xau la: " + 
									strToken.countTokens());
    }
}
