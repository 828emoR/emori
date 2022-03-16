
package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책(책 제목, 저자, 출판사, 가격)

		// book => 초기화:혼공자, 신용권, 한빛미디어, 24000원
		// powerJava, 천인국, 인피니티, 35000
		// 재밌는 Java, 이호준, 인피니티, 20000

		Book b1 = new Book();
		b1.bookName = "혼공자";
		b1.Writer = "신용권";
		b1.Publisher = "한빛미디어";
		b1.Price = 24000;

		Book b2 = new Book();
		b2.bookName = "powerJava";
		b2.Writer = "천인국";
		b2.Publisher = "인피니티";
		b2.Price = 35000;

		Book b3 = new Book();
		b3.bookName = "재밌는 Java";
		b3.Writer = "이호준";
		b3.Publisher = "인피니티";
		b3.Price = 20000;

		Book[] books = { b1, b2, b3 };

		for (int i = 0; i < books.length; i++) {

//			if (books[i].Publisher == "인피니티") {
//				
//			    System.out.println("==================================");
//				System.out.println("책 제목: " + books[i].bookName);
//				System.out.println("저자: " + books[i].Writer);
//				System.out.println( "가격은 " + books[i].Price);
//				System.out.println("==================================");
			
			if (books[i].Writer == "신용권") {
				
				System.out.println("==================================");
				System.out.println("책 제목: " + books[i].bookName);
				System.out.println("저자: " + books[i].Writer);
				System.out.println("가격은 " + books[i].Price);
				System.out.println("==================================");
			}

		}
	}
}
