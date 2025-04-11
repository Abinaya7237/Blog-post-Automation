
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlogManager manager = new BlogManager();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n--- Blog Automation ---");
            System.out.println("1. Add Blog Post");
            System.out.println("2. Show All Posts");
            System.out.println("3. Save Blog");
            System.out.println("4. Load Blog");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter content: ");
                    String content = scanner.nextLine();
                    manager.addPost(new BlogPost(title, content));
                    break;
                case "2":
                    manager.showPosts();
                    break;
                case "3":
                    manager.saveToFile("blogdata.ser");
                    break;
                case "4":
                    manager.loadFromFile("blogdata.ser");
                    break;
                case "0":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (!choice.equals("0"));

        scanner.close();
    }
}
