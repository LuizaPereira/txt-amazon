package txt_amazon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Arts.txt"));
        ArrayList<Review> reviews = new ArrayList<>();
        while (input.hasNextLine()) {
            String nextLineAux = input.nextLine();
            if(nextLineAux.equals("")){
                String x = nextLineAux;
            }
            else{
                String productId = nextLineAux.split(":")[1].trim();
                String title = input.nextLine().split(":")[1].trim();
                String price = input.nextLine().split(":")[1].trim();
                Product product = new Product(productId, title , price);
                String userId = input.nextLine().split(":")[1].trim();
                String profileName = input.nextLine().split(":")[1].trim();

                User user = new User(userId, profileName);
                String[] auxHelpfulness = input.nextLine().split(": ")[1].split("/");
                Helpfulness helpfulness = new Helpfulness(Integer.parseInt(auxHelpfulness[0]),
                        Integer.parseInt(auxHelpfulness[0]) + Integer.parseInt(auxHelpfulness[1]));
                Review review = new Review(user, product, helpfulness, Double.parseDouble(input.nextLine().split(": ")[1]),
                        Long.parseLong(input.nextLine().split(": ")[1]), input.nextLine().split(": ")[1], input.nextLine().split(": ")[1]);
                reviews.add(review);
            }
        }
//        reviews.forEach(System.out::println);
    }
}