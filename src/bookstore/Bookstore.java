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
//        Book book1 = new Book ("huck finn", "29.99", author1);

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
