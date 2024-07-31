package EX_6;

public class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
    
    public static void main(String[] args) {
        Book[] books = {
                new Book("001", "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("002", "To Kill a Mockingbird", "Harper Lee"),
                new Book("003", "1984", "George Orwell"),
                new Book("004", "Pride and Prejudice", "Jane Austen"),
                new Book("005", "The Catcher in the Rye", "J.D. Salinger")
        };

        Library library = new Library(books);

        String titleToSearch = "1984";  

        Book foundBook = library.binarySearchByTitle(titleToSearch);
        if (foundBook != null) {
            System.out.println("Binary Search: Book found: " + foundBook);
        } else {
            System.out.println("Binary Search: Book with title " + titleToSearch + " not found.");
        }
    }
}
