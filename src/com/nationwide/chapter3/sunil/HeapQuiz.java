package com.nationwide.chapter3.sunil;

public class HeapQuiz {

	int id = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		HeapQuiz[] hq = new HeapQuiz[5];

		hq[0] = new HeapQuiz();

		while (x < 3) {
			hq[x] = new HeapQuiz();
			hq[x].id = x;
			x = x + 1;

		}
		hq[3] = hq[1];
		hq[4] = hq[1];
		hq[3] = null;
		hq[4] = hq[0];
		hq[0] = hq[3];
		hq[3] = hq[2];
		hq[2] = hq[0];

		System.out.println("" + hq[3]);
		System.out.println("" + hq[4]);
	}

}
