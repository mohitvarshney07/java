package pattern;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star = 1;
		int row=1;
		while(row<= n) {
			int i= 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print("1 ");
				j++;
			}
			space = space-1;
			star = star+2;
			row++;
			System.out.println();
		}

	}

}
