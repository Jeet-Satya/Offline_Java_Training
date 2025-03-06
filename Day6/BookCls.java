import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(){
        System.out.println("Enter the title");
        Scanner sc=new Scanner(System.in);
        title=sc.nextLine();
        System.out.println("Enter the author");
        author=sc.nextLine();
        System.out.println("Enter the price");
        price=sc.nextDouble();
    }
    public Book(Book b){
        this(b.title, b.author, b.price);
    }
    public void DisplayDetails(){
        System.out.println("Titles: " + this.title+" , "+"Author: " + this.author+" , "+" Price: " + this.price);
    }
}
public class BookCls {
    public static void main(String[] args) {
        Book b=new Book("Java Programming","James Gosling",30.0 );
        Book b1=new Book(b);
        b1.DisplayDetails();
    }
}
