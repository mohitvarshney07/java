package pattern;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star = 1;
		int row = 1;
		while(row<=n) {
			int i=1;
			while(i <=space) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			while(j<= star) {
				System.out.print("* ");
				j=j+1;
			}
			space=space-1;
			star = star+2;
			row = row+1;
			System.out.println();
		}
		

	}

}
