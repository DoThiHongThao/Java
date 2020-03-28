package vidu;

public class B1 {
	
		public static double Sum(int a[]) {
			int sum=0;
			for(int i=0; i<a.length; i++) {
				sum+=a[i];
			}
			return sum;
		}
		public static double Avg(int a[]) {
			return Sum(a)/(a.length);
		}
		public static int Min(int a[]) {
			int min=a[0];
			for(int i=1; i<a.length; i++) {
				if(min>a[i]) {
					min=a[i];
				}
			}
			return min;
		}
		public static int Max(int a[]) {
			int max=a[0];
			for(int i=1; i<a.length; i++) {
				if(max<a[i]) {
					max=a[i];
				}
			}
			return max;
		}
		public static void main(String[] arg) {
			int data[]= {78,65,78,21,93,45,33,55,22,81};
			System.out.println("Tong cua day la: "+Sum(data));
			System.out.println("Trung binh cong cua day la: "+Avg(data));
			System.out.println("Min: "+Min(data));
			System.out.println("Max: "+Max(data));
		}

}
