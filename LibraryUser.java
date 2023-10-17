import java.util.Scanner;

public class LibraryUser implements Runnable{
    private Book libraryUser;
    private Library library;

    public LibraryUser(){
        this.libraryUser = new Book("null","null",false);
        this.library = new Library();
    }

    public void run(){
        System.out.println("\nEnter in the name of the book you want to reserve.");
        Scanner input = new Scanner(System.in);
        String inputBook = input.nextLine();
        library.reserveBookByTitle(inputBook);
        //System.out.println("\nUser is reading book.");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        //System.out.println("\nUser is returning book.");
        libraryUser.returnBook();
    }


}
