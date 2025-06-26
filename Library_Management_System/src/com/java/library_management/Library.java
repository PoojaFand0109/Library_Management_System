package com.java.library_management;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<>();
	ArrayList<User> users = new ArrayList<>();

	void addBook(Book book) {
		books.add(book);
		System.out.println("Book added successfully");
	}

	void addUser(User user) {
		users.add(user);
		System.out.println("User added successfully");
	}

	void displayBooks() {
		System.out.println("\n List of books");

		for (Book b : books) {
			System.out.println("ID:" + b.bookId + ",Title:" + b.title + ",Issued:" + (b.isIssued ? "Yes" : "No"));

		}
	}

	void displyUsers() {
		System.out.println("\\n List of users");

		for (User u : users) {
			System.out.println("ID:" + u.userId + ",Name:" + u.name);
		}
	}

	void issueBook(int bookId) {
		for (Book b : books) {
			if (b.bookId == bookId) {
				if (!b.isIssued) {
					b.isIssued = true;
					System.out.println("Book issued successfully.");
				} else {
					System.out.println("Bookis already issued");
				}
				return;
			}
		}

		System.out.println("Book not found.");
	}

	void returnBook(int bookId) {
		for (Book b : books) {
			if (b.bookId == bookId) {
				if (b.isIssued) {
					b.isIssued = false;
					System.out.println("Book returned successfully.");
				} else {
					System.out.println("Bookis was not issued");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}
}
