package pattern;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int space =0;
		int star = n;
		int row= 1;
		while(row<=n) {
			int i = 1;
			while(i<= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<= star) {
				System.out.print("* ");
				j++;
			}
			space = space+2;
			star = star-1;
			row++;
			System.out.println();
		}
	}

}
