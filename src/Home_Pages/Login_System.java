package Home_Pages;

import java.io.*;
import java.util.Scanner;

public class Login_System {
    private static final String USER_FILE = "users.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public void run() {
        createFileIfNotExists(USER_FILE);

        boolean running = true;
        while (running) {
            System.out.println("1. Login");
            System.out.println("2. Create User");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login();
                    running = false;
                    break;
                case 2:
                    createUser();
                    running = false;
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void login() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine().trim();
        System.out.println("Enter password: ");
        String password = scanner.nextLine().trim();

        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[0].equals(username) && parts[1].equals(password)) {
                    System.out.println("Login successful!");
                    String name = parts[2];
                    System.out.println();
                    System.out.println("Hello " + name + ", welcome back to the All-in-One Hub!");
                    return;
                }
            }
            System.out.println("Invalid username or password.");
            login();
        } catch (IOException e) {
            System.err.println("Error reading user file: " + e.getMessage());
        }
    }

    private void createUser() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Enter new username: ");
        String username = scanner.nextLine().trim();
        System.out.println("Enter new password: ");
        String password = scanner.nextLine().trim();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            writer.write(username + "," + password + "," + name);
            writer.newLine();
            System.out.println("User created successfully!");
            System.out.println();
            System.out.println("Hello " + name + ", welcome to the All-in-One Hub!");
        } catch (IOException e) {
            System.err.println("Error writing to user file: " + e.getMessage());
        }
    }

    private void createFileIfNotExists(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Error creating file: " + e.getMessage());
            }
        }
    }
}
