import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private static ArrayList<Student> userStudents = new ArrayList<>();
    private static Admin admin = new Admin("admin", "admin123");
    private static ArrayList<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        bookList.add(new HistoryBook("1", "Pemrograman BO", "Adnan", "Pemograman", 10, 7));
        bookList.add(new TextBook("2", "Pemrograman B1", "Afif", "Pemrograman", 8, 10));

        userStudents.add(new Student("202310370311147", "Sherlin", "Engineering", "Informatics"));
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        studentLogin();
                        break;
                    case 2:
                        adminLogin();
                        break;
                    case 3:
                        System.out.println("Exiting program. Thank you!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
        }
    }

    private static void studentLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();
        Student student = StudentDatabase.getStudentByNim(nim);

        if (student != null) {
            student.menuStudent();
        } else {
            System.out.println("Student not found. Please try again.");
        }
    }

    private static void adminLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter admin username: ");
        String username = scanner.next();
        System.out.print("Enter admin password: ");
        String password = scanner.next();

        if (admin.validateLogin(username, password)) {
            admin.menuAdmin();
        } else {
            System.out.println("Invalid admin credentials. Please try again.");
        }
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }
}
