import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Library {
    private List<Book> booksInLibrary = new ArrayList();


    public void getBooksInLibrary() {
        System.out.println("Books in library are : \n");
        for (Book s : booksInLibrary) {
            System.out.println("Book Name : " + s.getTitle() + "\nBook Category : " + s.getCategory() + "\nBook Availability(True is unavailable false is available) : " + s.getReserved());
        }
    }
    public void reserveBookByTitle(String bookTitle){
        for (Book book : booksInLibrary){
            if (book.getTitle().equals(bookTitle)) {
                if (!book.getReserved()) {
                    book.setReserved(true);
                    System.out.println("Reserved " + book.getTitle());

                } else {
                    System.out.println(book.getTitle() + " is already reserved.");
                }
                return;


            }
        }
        System.out.println("Book with title " + bookTitle + " not found.");
    }

    public Library() { // adds books to the library
        booksInLibrary.add(new Book ("Book1","Non-Fiction",false));
        booksInLibrary.add(new Book ("Book2","Non-Fiction",false));
        booksInLibrary.add(new Book ("Book3","Fiction",false));

        // this code below basically lets us manually add books disabled it due to testing limitations

        /*Scanner input = new Scanner(System.in);
        boolean continueAdding = true;

        while (continueAdding) {

            System.out.println("Please enter in the name of the book you want to add.");
            String title = input.nextLine();

            System.out.println("Please choose the category of your book:\n1.Fiction\n2.Non-Fiction");
            int choice = input.nextInt();
            input.nextLine();

            String category;

            switch (choice) {

                case 1:
                    category = "Fiction";
                    break;

                case 2:
                    category = "Non-Fiction";
                    break;

                default:
                    System.out.println("Invalid category choice.");
                    continue;
            }

            Book book = new Book(title, category, false);
            booksInLibrary.add(book);

            System.out.println("Book added to the library");

            System.out.println("Do you want to add more books? (Yes = 1 / No = 2)");
            int response = input.nextInt();
            input.nextLine();

            if (response != 1) {
                System.out.println("Exiting.");
                continueAdding = false;
            }
        }
    }
       /* public synchronized void reserveBook (String titleName){

        if (booksInLibrary.contains(titleName)){
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }*/


        }
    }

