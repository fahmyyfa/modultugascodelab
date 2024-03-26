import java.util.ArrayList;
import java.util.Scanner;

class Admin {
    private String adminUsername;
    private String adminPassword;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Admin(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public void addStudent(String nim, String name, String faculty, String programStudi) {
        if (nim.length() == 15) {
            Student student = new Student(nim, name, faculty, programStudi);
            studentList.add(student);
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Invalid NIM length. Please enter a valid NIM.");
        }
    }

    public void inputBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select book type:");
        System.out.println("1. Story Book");
        System.out.println("2. History Book");
        System.out.println("3. Text Book");
        int choice = scanner.nextInt();

        System.out.print("Enter book title: ");
        String title = scanner.next();
        System.out.print("Enter author name: ");
        String author = scanner.next();
        System.out.print("Enter stock: ");
        int stock = scanner.nextInt();

        Book book;
        switch (choice) {
            case 1:
                book = new StoryBook(title, author, author, author, stock, stock);
                break;
            case 2:
                book = new HistoryBook(title, author, author, author, stock, stock);
                break;
            case 3:
                book = new TextBook(title, author, author, author, stock, stock);
                break;
            default:
                System.out.println("Invalid choice. Book not added.");
                return;
        }

        LibrarySystem.getBookList().add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        System.out.println("List of Available Books:");
        System.out.printf("%-4s%-27s%-11s%-8s%-10s\n", "ID", "Title", "Author", "Category", "Stock");
        for (Book book : LibrarySystem.getBookList()) {
            System.out.println(book.getBookId() + "   " + book.getTitle() + "             " + book.getAuthor() + "       " + book.getCategory() + "        " + book.getStock());
        }
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students registered yet.");
        } else {
            System.out.println("List of Registered Students:");
            System.out.println("NIM                 Name    Faculty   Program Studi");
            for (Student student : studentList) {
                System.out.println(student.getNim() + "     " + student.getName() + "     " + student.getFaculty() + "      " + student.getProgramStudi());
            }
        }
    }


    public boolean validateLogin(String username, String password) {
        return this.adminUsername.equals(username) && this.adminPassword.equals(password);
    }

    public void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Book");
            System.out.println("3. Display Students");
            System.out.println("4. Display Books");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    inputBook();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    System.out.println("Kembali ke menu utama");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student NIM: ");
        String nim = scanner.next();
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student faculty: ");
        String faculty = scanner.next();
        System.out.print("Enter student program studi: ");
        String programStudi = scanner.next();

        addStudent(nim, name, faculty, programStudi);
    }
}