import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Book book1=new Book();
System.out.println("Please enter the title of the book");
book1.title=input.next();
System.out.println("Please enter the author name");
book1.author=input.next();
System.out.println("Please enter the number of pages");
book1.numberOfpages=input.nextInt();
System.out.println("The book title is:"+book1.title);
System.out.println("The book author is:"+book1.author);
System.out.println("The book has"+book1.numberOfpages);
	}

}