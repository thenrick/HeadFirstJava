package com.nationwide.chapter3.sunil;

public class Books {
	String title;
	String author;
}

/**
 * @param args
 */
class BooksTestDrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		Books[] myBooks = new Books[3];
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();

		myBooks[0].title = "Java 1";
		myBooks[1].title = "Java 2";
		myBooks[2].title = "Java 3";

		myBooks[0].author = "Albert";
		myBooks[1].author = "Robert";
		myBooks[2].author = "Mike";

		while (x < 3) {
			System.out.println(myBooks[x].title);
			System.out.println("by");
			System.out.println(myBooks[x].author);
		}

	}

}