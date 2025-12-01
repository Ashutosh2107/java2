//YOUTUBE CHANNEL CONCEPT
import java.util.Scanner;

class YouTube {
    private String CorrectPassword = "1234";
    private String channelName;
    private int subscriberCount;

    // Constructor
    public YouTube(String channelName) {
        this.channelName = channelName;
        this.subscriberCount = 0;
    }

    // Password checking method
    public boolean login(String password) {
        if (password.equals(CorrectPassword)) {
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Wrong Password! Access Denied.");
            return false;
        }
    }

    public String getName() {
        System.out.println("YouTube Channel Name: " + channelName);
        return channelName;
    }

    public int getSubscriberCount() {
        System.out.println("YouTube Subscriber Count: " + subscriberCount);
        return subscriberCount;
    }

    public void setSubscriberCount(int subscriberCount) {
        this.subscriberCount = subscriberCount;
        System.out.println("Updated Subscriber Count: " + subscriberCount);
        checkPrize();
    }

    public void setUnSubscriberCount(int count) {
        if (count > 0) {
            this.subscriberCount -= count;
            if (subscriberCount < 0) {
                subscriberCount = 0;
            }
            System.out.println("Subscribers Removed! New Count: " + subscriberCount);
        } else {
            System.out.println("Invalid number!");
        }
        checkPrize();
    }


    public void increaseSubscriberCount() {
        this.subscriberCount += 1;
        System.out.println("Updated Subscriber Count: " + subscriberCount);
        checkPrize();
    }

    public void decreaseSubscriberCount() {
        this.subscriberCount -= 1;
        if (subscriberCount < 0) subscriberCount = 0;

        System.out.println("Updated Subscriber Count: " + subscriberCount);
        checkPrize();
    }

    // Prize based on subscriber count
    public void checkPrize() {
        if (subscriberCount >= 10000000) {
            System.out.println("Prize: 🟦 *Diamond Play Button*");
        } else if (subscriberCount >= 1000000) {
            System.out.println("Prize: 🟨 *Gold Play Button*");
        } else if (subscriberCount >= 100000) {
            System.out.println("Prize: ⚪ *Silver Play Button*");
        } else {
            System.out.println("Prize: No prize yet. Keep growing!");
        }
    }
}

public class c13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take channel name from user
        System.out.print("Enter YouTube Channel Name: ");
        String name = sc.nextLine();

        YouTube yt = new YouTube(name);

        // Password check
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!yt.login(pass)) {
            return; // Stop program if password wrong
        }

        // Show Channel Name
        yt.getName();

        // Set subscriber count
        System.out.print("Enter Subscriber Count: ");
        int sub = sc.nextInt();
        yt.setSubscriberCount(sub);

        // Remove subscribers
        System.out.print("Enter Subscribers to Remove: ");
        int remove = sc.nextInt();
        yt.setUnSubscriberCount(remove);

        // Show final result
        yt.getSubscriberCount();

        yt.increaseSubscriberCount();
        yt.decreaseSubscriberCount();
    }
}