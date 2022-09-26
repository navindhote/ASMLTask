package com.asml.solutions;

public class ASMLTask {

	static void spiralPrint(int m, int n, int a[][]) {
		int n1 = m;
		int n2 = n;
		int t = m*n;

		int i1 = 0;
		int i2 = 0;

		String d = "right";
		int l = 0;

		for (int i = 0; i<t; i++) {
			
			
			 //if(i1==-1) i1=0; if(i2==-1) i2=0;
			 
			System.out.print(a[i1][i2] + " ");

			if (i2 < n2-1-l && d.equals("right")) {
				i2+=1;

				if (i2 == n2-1-l) {
					d = "down";
				}

			} else if (i1 < n1-1-l && d.equals("down")) {
				i1+=1;

				if (i1 == n1-1-l) {
					d = "left";
				}
			}
			else if (i2 > 0 + l && d.equals("left")) {
				i2-=1;

				if (i2 == 0 + l) {
					d = "up";
				}
			}
			else if(i1>0+l && d.equals("up"))
			{
				i1-=1;
				if (i1 == 1+l) {
					d = "right";
					l+=1;
				
			}
		}
	}
	}

	// driver code

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 4;
		int col = 4;
		// array to print in spiral form 
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// function Calling 
		spiralPrint(row, col, arr);

	}

}
