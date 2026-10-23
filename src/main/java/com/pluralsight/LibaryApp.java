package com.pluralsight;
import java.util.Scanner;
public class LibaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[]  inventory = new Book[20];
         inventory[0] = new Book(1, "978-0-00-000001-1", "Pride and Prejudice");
         inventory[1] = new Book(2, "978-0-00-000002-8", "Moby-Dick");
         inventory[2] = new Book(3, "978-0-00-000003-5", "Great Expectations");
         inventory[3] = new Book(4, "978-0-00-000004-2", "Jane Eyre");
         inventory[4] = new Book(5, "978-0-00-000005-9", "Frankenstein");
         inventory[5] = new Book(6, "978-0-00-000006-6", "Dracula");
         inventory[6] = new Book(7, "978-0-00-000007-3", "The Adventures of Tom Sawyer");
         inventory[7] = new Book(8, "978-0-00-000008-0", "Alice's Adventures in Wonderland");
         inventory[8] = new Book(9, "978-0-00-000009-7", "The Great Gatsby");
         inventory[9] = new Book(10, "978-0-00-000010-3", "Treasure Island");
         inventory[10] = new Book(11, "978-0-00-000011-0", "The Odyssey");
         inventory[11] = new Book(12, "978-0-00-000012-7", "Wuthering Heights");
         inventory[12] = new Book(13, "978-0-00-000013-4", "A Tale of Two Cities");
         inventory[13] = new Book(14, "978-0-00-000014-1", "The Picture of Dorian Gray");
         inventory[14] = new Book(15, "978-0-00-000015-8", "Little Women");
         inventory[15] = new Book(16, "978-0-00-000016-5", "The Call of the Wild");
         inventory[16] = new Book(17, "978-0-00-000017-2", "Sherlock Holmes: A Study in Scarlet");
         inventory[17] = new Book(18, "978-0-00-000018-9", "The Time Machine");
         inventory[18] = new Book(19, "978-0-00-000019-6", "Heart of Darkness");
         inventory[19] = new Book(20, "978-0-00-000020-2", "Anne of Green Gables");

         int command = 0;

         while (command != 3) {
             System.out.println();
             System.out.println("Neightborhood Libary");
             System.out.println("1 - Show Available Books");
             System.out.println("2 - Show Checked Out Books");
             System.out.println("3 - Exit - closes out of the application");
             System.out.print("Enter a number: ");

             command = scanner.nextInt();
             scanner.nextLine();

             switch (command) {
                 case 1 -> showAvailableBooks(inventory);
                 case 2 -> showCheckedOutBooks(inventory);
                 case 3 -> System.out.println("Have a good day! Make sure to read!");
                 default -> System.out.println("Enter a number from 1-3");
             }
         }
    }
    public static void showAvailableBooks(Book[] invetory, Scanner scanner) {
        boolean found = false;
        for (Book currentBook : invetory) {
            if (currentBook != null && !currentBook.isCheckedOut()) {
                System.out.println("ID: " + currentBook.getId() + "ISBN" + currentBook.getIsbn() + "Title" + currentBook.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are available at the moment");
            return;
        }
        System.out.print("Enter the ID of the books to check out, or 0 to go back");
        int selectedID = scanner.nextInt();
        scanner.nextLine();

        if (selectedID == 0) {
            return;
        }
        Book selectedBook = null;
        for (Book currentBook: invetory) {
            if (currentBook != null && currentBook.getId() == selectedID && !currentBook.isCheckedOut()) {
                selectedBook = currentBook;
            }
        }
        if (selectedBook == null) {
            System.out.println("That ID is not one of the available books.");
            return;
        }
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        selectedBook.checkOut(name);
        System.out.println(selectedBook.getTitle() + " is now checked out to " + name + "!");
    }

}
