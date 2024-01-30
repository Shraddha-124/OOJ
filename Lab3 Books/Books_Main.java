import java.util.Scanner;

class Books 
{
    int price;
    int num_pages;
    String name;
    String author;

    Books(String name, String author, int price, int num_pages)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }
lo0o,o
    public String toString() 
    {
        String name;
        String author;
        String price;
        String num_pages;
        name = "Book name: " + this.name + "\n";
        author = "Author name : " + this.author + "\n";
        price = "Price : " + this.price + "\n";
        num_pages = "Number of pages : " + this.num_pages + "\n";
        return name + author + price + num_pages;
    }
}

public class Books_Main
 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n;
        String name;
	    String author;
        int price;
	    int num_pages;
        System.out.println("Enter the number of books:");
        n = s.nextInt();
        Books b[];
	b=new Books[n];
        for (i = 0; i < n; i++) 
        {
	    System.out.println("Enter the details of book" + (i+1) + ":");

            System.out.println("Enter the name of the book:");
	    name = s.next();
	    System.out.println("Enter the author name:");
            author = s.next();
 	    System.out.println("Enter the price:");
            price = s.nextInt();
	    System.out.println("Enter the number of pages:");
            num_pages = s.nextInt();

            b[i] = new Books(name, author, price, num_pages);
        }
        System.out.println("Book details:");
        for (i = 0; i < n; i++)
        {
            System.out.println(b[i]);
        }
    }
 }