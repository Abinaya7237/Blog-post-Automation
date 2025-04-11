
import java.io.*;
import java.util.ArrayList;

public class BlogManager {
    private ArrayList<BlogPost> posts;

    public BlogManager() {
        posts = new ArrayList<>();
    }

    public void addPost(BlogPost post) {
        posts.add(post);
    }

    public void showPosts() {
        if (posts.isEmpty()) {
            System.out.println("No blog posts yet.");
        } else {
            for (BlogPost post : posts) {
                System.out.println(post);
            }
        }
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(posts);
            System.out.println("Blog saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving blog: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            posts = (ArrayList<BlogPost>) in.readObject();
            System.out.println("Blog loaded successfully!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading blog: " + e.getMessage());
        }
    }
}
