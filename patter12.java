package pattern;

import java.util.Scanner;

public class patter12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star = 1;
		int row = 1;
		while(row<= 2*n-1) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				space = space-1;
				star= star+1;
			}
			else {
				space = space+1;
				star = star-1;
			}
			row++;
			System.out.println();
		}
		}
}
