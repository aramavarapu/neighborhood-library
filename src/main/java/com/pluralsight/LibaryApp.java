package com.pluralsight;

public class LibaryApp {
    public static void main(String[] args) {
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
    }
}
