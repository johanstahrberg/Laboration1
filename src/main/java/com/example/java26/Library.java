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

    public Member findMemberById(String id) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getId().equals(id)) {
                return members[i];
            }
        }

        return null;
    }

    public Book findBookByIsbn(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isbn().equals(isbn)) {
                return books[i];
            }
        }

        return null;
    }

    public int findBookIndexByIsbn(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isbn().equals(isbn)) {
                return i;
            }
        }

        return -1;
    }

    public void borrowBook(String isbn, String memberId) {
        Member member = findMemberById(memberId);

        if (member == null) {
            System.out.println("Medlemmen hittades inte.");
            return;
        }

        int bookIndex = findBookIndexByIsbn(isbn);

        if (bookIndex == -1) {
            System.out.println("Boken hittades inte.");
            return;
        }

        if (borrowedBy[bookIndex] != null) {
            System.out.println("Boken är redan utlånad.");
            return;
        }

        borrowedBy[bookIndex] = member;
        member.increaseActiveLoans();
        System.out.println("Boken har lånats ut.");
    }


}


























