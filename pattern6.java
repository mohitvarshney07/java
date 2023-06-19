package pattern;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row<=n) {
			if(row==1 || row == n) {
				int i=1;
				while(i<=n) {
					System.out.print("* ");
					i=i+1;
				}
			}
			else {
				System.out.print("* ");
				int i=1;
				while(i<=n-3) {
					System.out.print("  ");
					i=i+1;
				}
				System.out.print("* ");
			}
			System.out.println();
			row=row+1;
		}
	}
}
