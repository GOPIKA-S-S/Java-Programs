import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C++"};
        boolean[] issued = {false, false, false};

        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.length; i++) {
                        System.out.println((i + 1) + ". " + books[i] +
                                (issued[i] ? " (Issued)" : " (Available)"));
                    }
                    break;

                case 2:
                    System.out.print("Enter book number to issue: ");
                    int issue = sc.nextInt() - 1;

                    if (!issued[issue]) {
                        issued[issue] = true;
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("Book already issued.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to return: ");
                    int ret = sc.nextInt() - 1;

                    if (issued[ret]) {
                        issued[ret] = false;
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Book was not issued.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}