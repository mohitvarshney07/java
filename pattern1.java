package pattern;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = n;
			while(row<=n) {
				int cst=1;
				while(cst<=n) {
					System.out.print("* ");
					cst= cst+1;
				}
				row= row+1;
				System.out.println();
				
				
			}	

	}

}
