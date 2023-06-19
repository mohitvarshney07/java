package pattern;

import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int space = n-1;
		int star = 1;
		int row= 1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
			System.out.print("\t");
			i++;
		}
			int j=1;
			int val = row;
			while(j<=star) {
				System.out.print(val+"\t");
				if(j<(star/2)+1) {
					val=val+1;
				}
				else {
					val = val-1;
				}
				j++;
			}
			space= space-1;
			star = star+2;
			row++;
			System.out.println();
		}
	}

}
