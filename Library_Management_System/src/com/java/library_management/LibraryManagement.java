package com.java.library_management;

import java.util.Scanner;

public class LibraryManagement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Library library = new Library();

		while (true) {
			System.out.println("\n ****Library Management System****");
			System.out.println("1.Add Book");
			System.out.println("2.Add User");
			System.out.println("3.Display Books");
			System.out.println("4.Display Users");
			System.out.println("5.Issue Book");
			System.out.println("6.return Book");
			System.out.println("7.Exit");

			System.out.println("Enter a choice:");
			
			
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Book ID:");
				int bId = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter a book title:");
				String bTitle = sc.next();
				library.addBook(new Book(bId, bTitle));
				break;
				
			  case 2:
                  System.out.print("Enter User ID: ");
                  int uId = sc.nextInt();
                  sc.nextLine();
                  System.out.print("Enter User Name: ");
                  String uName = sc.nextLine();
                  library.addUser(new User(uId, uName));
                  break;

			case 3:
				library.displayBooks();
				break;

			case 4:
				library.displyUsers();
				break;

			case 5:
				System.out.print("Enter Book ID to Issue: ");
				int issueId = sc.nextInt();
				library.issueBook(issueId);
				break;

			case 6:
				System.out.print("Enter Book Id to return:");
				int returnId = sc.nextInt();
				library.returnBook(returnId);
				break;

			case 7:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice. Try again.");

			}

		}
	}

}
