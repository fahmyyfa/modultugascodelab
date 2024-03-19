import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String usernameAdmin = "Admin";
        String passwordAdmin = "Admin123";

        String[] mahasiswaNIM = {"123456789012345", "098765432109876"};

        System.out.println("=== System LIbrary ===");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. exit");
        System.out.print("Choose Option (1-3): ");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter your NIM: ");
                String nimMahasiswa = scanner.next();

                boolean isValidNIM = false;
                for (String nim : mahasiswaNIM){
                    if (nim.equals(nimMahasiswa)){
                        isValidNIM = true;
                        break;

                    }
                }
                if (isValidNIM){
                    System.out.println("Successfull login as Admin");
                } else {
                    System.out.println("User Not Found");
                }
                break;
            case 2 :
                System.out.println("Enter your username: ");
                String nameAdmin = scanner.next();
                System.out.println("Enter your password: ");
                String pwAdmin = scanner.next();

                if (nameAdmin.equals(usernameAdmin) && pwAdmin.equals(passwordAdmin)){
                    System.out.println("Successfull login as Admin");
                } else {
                    System.out.println("Admin User Not Found");
                }
                break;
            case 3 :
                System.out.println("adios");
                break;
        }
    }
}