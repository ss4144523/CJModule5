import java.util.Scanner;

public class BookDetails {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter bookNo");
		int bookNo = scanner.nextInt();
		System.out.println("enter title");
		String title = scanner.next();
		System.out.println("enter author");
		String author = scanner.next();
		System.out.println("enter price");
		float price = scanner.nextFloat();
		
		Book book = new Book();
		
		System.out.println("Book No "+book.getBookNo());
		System.out.println("Title :"+book.getTitle());
		System.out.println("Author :"+book.getAuthor());
		System.out.println("Price :"+book.getPrice());
	}

}
