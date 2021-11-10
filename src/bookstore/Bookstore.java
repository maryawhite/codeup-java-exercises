package bookstore;

public class Bookstore {

    public static void main(String[] args) {
        //make 3 authors
        //make 5 books
        //create 8 customers-store them in an array, have each customer buy a book or two

        Author author1 = new Author("Mark Twain");
        Author author2 = new Author("Joseph Conrad");
        Author author3 = new Author("Stephen King");

        //make 5 books
        Book book1 = new Book ("Huck Finn", 29.99, author1);
        Book book2 = new Book ("Heart of Darkness", 32.99, author2);
        Book book3 = new Book ("The Shining", 19.99, author3);
        Book book4 = new Book("Salem's Lot", 8.99, author3);
        Book book5 = new Book("Typhoon", 16.99, author2);
        System.out.println("line 20:  " + book1.getPrice());


        System.out.println("line 20:  " + book1.getTitle());
        System.out.println("line23:  " + author1.getName());   //this is the author name
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);

        //Not part of the bonus...
        //Create an array of book and iterate through it with an enhanced for loop
        Book[] books = {book1, book2, book3, book4, book5};
        System.out.println("---Looping through an array of books---");
        for ( Book oneBook : books) {
            System.out.println(oneBook);
        }


        Customer customer1 = new Customer("Mary");
        Customer customer2 = new Customer("Sarah");
        Customer customer3 = new Customer("Daniel");
        Customer customer4 = new Customer("Charlie");
        Customer customer5 = new Customer("Tim");
        Customer customer6 = new Customer("John");
        Customer customer7 = new Customer("Jennifer");
        Customer customer8 = new Customer("Laura");

        Customer[] customers = {customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8};

//now make the customers buy 1 or 2 books...


    }

}
