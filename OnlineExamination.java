import java.util.*;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void updateProfile(String newUsername, String newPassword) {
        this.username = newUsername;
        this.password = newPassword;
        System.out.println("Profile updated successfully!");
    }
}

public class OnlineExamination {
    static Scanner sc = new Scanner(System.in);
    static User user = new User("Divyash", "Divyash1234"); // default login
    static boolean loggedIn = false;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== ONLINE EXAMINATION SYSTEM =====");
            System.out.println("1. Login");
            System.out.println("2. Update Profile & Password");
            System.out.println("3. Start Exam");
            System.out.println("4. Logout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: login(); break;
                case 2: if (loggedIn) updateProfile(); else System.out.println("Please login first."); break;
                case 3: if (loggedIn) startExam(); else System.out.println("Please login first."); break;
                case 4: if (loggedIn) logout(); else System.out.println("Not logged in."); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void login() {
        System.out.print("Enter Username: ");
        String u = sc.next();
        System.out.print("Enter Password: ");
        String p = sc.next();

        if (u.equals(user.username) && p.equals(user.password)) {
            loggedIn = true;
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    static void updateProfile() {
        System.out.print("Enter new username: ");
        String newU = sc.next();
        System.out.print("Enter new password: ");
        String newP = sc.next();
        user.updateProfile(newU, newP);
    }

    static void startExam() {
        System.out.println("\nExam Started! (Timer: 60 seconds)");
        String[] questions = {
                "Q1. Java is a __ language? \n1.Object-Oriented  2.Procedural  3.Scripting  4.Machine",
                "Q2. Which keyword is used to inherit a class in Java? \n1.this  2.super  3.extends  4.import",
                "Q3. Which of these is not a Java feature? \n1.Platform Independent  2.Multithreaded  3.Pointer Arithmetic  4.Secure"
        };
        int[] answers = {1, 3, 3};
        int score = 0;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter answer (1-4): ");

            // Timer check (60 sec)
            if ((System.currentTimeMillis() - startTime) / 1000 > 60) {
                System.out.println("Time up! Auto submitting...");
                break;
            }

            int ans = sc.nextInt();
            if (ans == answers[i]) score++;
        }
        System.out.println("Exam finished. Your Score: " + score + "/" + questions.length);
    }

    static void logout() {
        loggedIn = false;
        System.out.println("Logged out successfully.");
    }
}