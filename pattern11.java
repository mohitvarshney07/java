package pattern;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int star = 1;
		int row = 1;
		while(row<= 2*n-1) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i=i+1;
			}
			if(row<n) {
				star=star+1;
			}
			else {
				star=star-1;
			}
			row=row+1;
			System.out.println();
		}
	}

}
