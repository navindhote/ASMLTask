package com.asml.solutions;

public class ASMLTask {

	static void spiralPrint(int rows, int columns, int a[][]) {

		int currRowPos = rows;
		int currColPos = columns;
		int iterations = rows * columns;

		int i1 = 0;
		int i2 = 0;

		String direction = "right";
		int loop = 0;

		for (int i = 0; i < iterations; i++) {

			System.out.print(a[i1][i2] + " ");

			if (i2 < currColPos - 1 - loop && direction.equals("right")) {
				i2 += 1;

				if (i2 == currColPos - 1 - loop) {
					direction = "down";
				}

			} else if (i1 < currRowPos - 1 - loop && direction.equals("down")) {
				i1 += 1;

				if (i1 == currRowPos - 1 - loop) {
					direction = "left";
				}
			} else if (i2 > 0 + loop && direction.equals("left")) {
				i2 -= 1;

				if (i2 == 0 + loop) {
					direction = "up";
				}
			} else if (i1 > 0 + loop && direction.equals("up")) {
				i1 -= 1;
				if (i1 == 1 + loop) {
					direction = "right";
					loop += 1;

				}
			}
		}
	}

	public static void main(String[] args) {

		int row = 4;
		int col = 4;

		int list[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		spiralPrint(row, col, list);

	}

}
