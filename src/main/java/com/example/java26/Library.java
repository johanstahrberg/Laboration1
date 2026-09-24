package com.example.java26;

public class Library {

    private Book[] books = new Book[10];
    private Member[] members = new Member[10];
    private Member[] borrowedBy = new Member[10];

    private int bookCount = 0;
    private int memberCount = 0;

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Biblioteket har inte plats för fler böcker.");
        }

    }

        public void registerMember(Member member) {
            if (memberCount < members.length) {
                members[memberCount] = member;
                memberCount++;
            } else {
                System.out.println("Biblioteket har inte plats för fler medlemmar.");
            }
        }




}


























