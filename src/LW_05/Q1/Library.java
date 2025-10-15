package LW_05.Q1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BorrowableItemsList = new ArrayList<>();

    //method to add new items to the list
    public void addLibraryItem(Book borrowableItems) {
        BorrowableItemsList.add(borrowableItems);
    }

    //method to check out items from the list/library
    public void checkOutBorrowableItem(String title) {
        for (Book book : BorrowableItemsList) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                System.out.println("The book you searched is available");
                System.out.println("Checking out: " + book.getTitle());
                book.setAvailable(false);
            }
        }
    }

    //method to list all available borrowable items
    public void listAvailableItems() {
        System.out.println("Available books: ");
        for (Book book : BorrowableItemsList) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }

    //method to display information about library
    public void displayLibraryInfo() {
        int bookCount = 0;
        for (Book book : BorrowableItemsList) {
            if (book.isAvailable()) {
                bookCount++;
            }
        }
        System.out.println("Number of books available : "+bookCount);
    }
}

