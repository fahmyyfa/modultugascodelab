import java.util.ArrayList;
import java.util.Scanner;

class Student {
    Scanner scanner = new Scanner(System.in);
    private String nim;
    private String name;
    private String faculty;
    private String programStudi;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student(String nim, String name, String faculty, String programStudi) {
        this.nim = nim;
        this.name = name;
        this.faculty = faculty;
        this.programStudi = programStudi;
        LibrarySystem.getBookList();
        StudentDatabase.addStudent(this);
    }

    public void menuStudent() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Menu");
            System.out.println("1. Display Personal Information");
            System.out.println("2. Display Available Books");
            System.out.println("3. Show Borrowed Books");
            System.out.println("4. Return Books");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayInfo();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    showBorrowedBooks();
                    break;
                case 4:
                    returnBooks();
                    break;
                case 5:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Faculty: " + faculty);
        System.out.println("Program Studi: " + programStudi);
    }

    public void showBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books currently borrowed.");
        } else {
            System.out.println("Borrowed Books:");
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void logout() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed. Logging out. Goodbye, " + name + "!");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to return borrowed books? (yes/no)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("yes")) {
                for (Book book : borrowedBooks) {
                    book.returnBook();
                }
                System.out.println("Books returned. Logging out. Goodbye, " + name + "!");
            } else {
                System.out.println("Returning to main menu. Goodbye, " + name + "!");
            }
        }
        System.exit(0);
    }

    public void displayBooks() {
        System.out.println("List of Available Books:");
        System.out.printf("%-5s%-30s%-17s%-10s%-5s\n", "ID", "Title", "Author", "Category", "Stock");
        for (Book book : LibrarySystem.getBookList()) {
            System.out.println(book.getBookId() + "\t" + book.getTitle() + "\t" + book.getAuthor() + "\t"
                    + book.getCategory() + "\t" + book.getStock());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the book you want to borrow: ");
        String id = scanner.next();
        for (Book book : LibrarySystem.getBookList()) {
            if (book.getBookId().equals(id)) {
                System.out.println("Enter number of days to borrow: ");
                int days = scanner.nextInt();
                book.borrowBook(this, days);
                borrowedBooks.add(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the book you want to return: ");
        String id = scanner.next();
        for (Book book : borrowedBooks) {
            if (book.getBookId().equals(id)) {
                book.returnBook();
                borrowedBooks.remove(book);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("You have not borrowed this book.");
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}
