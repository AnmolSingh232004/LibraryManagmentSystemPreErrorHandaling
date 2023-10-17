public class Main {
    public static void main(String[] args){
        Library library = new Library(); //creating this object lets us add books
        library.getBooksInLibrary();
        LibraryUser user1 = new LibraryUser();
        LibraryUser user2 = new LibraryUser();
        LibraryUser user3 = new LibraryUser();
        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);
        Thread t3 = new Thread(user3);
        t1.start();
        t2.start();
        t3.start();
    }
}
