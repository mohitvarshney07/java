package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int star = n;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i = i+1;
			}
			row = row+1;
			star = star-1;
			System.out.println();
		}

	}

}
