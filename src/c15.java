import java.util.*;

public class c15 {

    static Scanner sc = new Scanner(System.in);

    // username -> password
    static Map<String, String> users = new HashMap<>();

    // username -> followers set
    static Map<String, Set<String>> followers = new HashMap<>();

    // username -> following set
    static Map<String, Set<String>> following = new HashMap<>();

    static String currentUser = null;

    public static void main(String[] args) {

        while (true) {
            if (currentUser == null) {
                System.out.println("\n--- Instagram Mini ---");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1 -> register();
                    case 2 -> login();
                    case 3 -> { System.out.println("Bye!"); return; }
                    default -> System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("\n--- Welcome " + currentUser + " ---");
                System.out.println("1. Follow User");
                System.out.println("2. Unfollow User");
                System.out.println("3. Show My Followers");
                System.out.println("4. Show My Following");
                System.out.println("5. Logout");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1 -> followUser();
                    case 2 -> unfollowUser();
                    case 3 -> showFollowers();
                    case 4 -> showFollowing();
                    case 5 -> { currentUser = null; System.out.println("Logged out."); }
                    default -> System.out.println("Invalid choice.");
                }
            }
        }
    }

    // ------------------ FUNCTIONS ------------------

    static void register() {
        System.out.print("Enter username: ");
        String u = sc.nextLine();

        if (users.containsKey(u)) {
            System.out.println("Username already exists!");
            return;
        }

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        users.put(u, p);
        followers.put(u, new HashSet<>());
        following.put(u, new HashSet<>());

        System.out.println("Registration successful!");
    }

    static void login() {
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();

        if (users.containsKey(u) && users.get(u).equals(p)) {
            currentUser = u;
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    static void followUser() {
        System.out.print("Enter username to follow: ");
        String target = sc.nextLine();

        if (!users.containsKey(target)) {
            System.out.println("User not found!");
            return;
        }

        if (target.equals(currentUser)) {
            System.out.println("You cannot follow yourself!");
            return;
        }

        if (following.get(currentUser).contains(target)) {
            System.out.println("Already following!");
            return;
        }

        following.get(currentUser).add(target);
        followers.get(target).add(currentUser);

        System.out.println("You are now following " + target);
    }

    static void unfollowUser() {
        System.out.print("Enter username to unfollow: ");
        String target = sc.nextLine();

        if (!users.containsKey(target)) {
            System.out.println("User not found!");
            return;
        }

        if (!following.get(currentUser).contains(target)) {
            System.out.println("You are not following this user.");
            return;
        }

        following.get(currentUser).remove(target);
        followers.get(target).remove(currentUser);

        System.out.println("You unfollowed " + target);
    }

    static void showFollowers() {
        System.out.println("\nYour Followers: " + followers.get(currentUser));
    }

    static void showFollowing() {
        System.out.println("\nYou Follow: " + following.get(currentUser));
    }
}