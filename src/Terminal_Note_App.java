import java.util.Scanner;

class Terminal_Note_App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();



    }
    private static void displayMainMenu() {
        while (true) {
            System.out.println("Welcome to Terminal Note App!");
            System.out.println("1. Add a note");
            System.out.println("2. View all notes");
            System.out.println("3. Edit a note");
            System.out.println("4. Delete a note");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add note method
                    break;
                case 2:
                    // View note method
                    break;
                case 3:
                    // Edit note method
                    break;
                case 4:
                    // Delete note method
                    break;
                case 5:
                    System.out.println("Exiting terminal note taking app...");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice.");


            }
        }
    }

    private static void addNote() {
        System.out.println("Enter the name of the note: ");
        String noteName = scanner.nextLine();

        System.out.println("Enter the content of the note: ");
        String noteContent = scanner.nextLine();
    }
}