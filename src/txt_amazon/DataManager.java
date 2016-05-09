package txt_amazon;

import com.sun.org.apache.regexp.internal.RE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Arts.txt"));
        ArrayList<Review> reviews = new ArrayList<Review>(9999999);
        while (input.hasNextLine()) {
            String nextLineAux = input.nextLine();
            if(nextLineAux.equals("")){
                String x = nextLineAux;
            }
            else{
                Product product = new Product(nextLineAux.split(": ")[1], input.nextLine().split(": ")[1], input.nextLine().split(": ")[1]);
                User user = new User(input.nextLine().split(": ")[1], input.nextLine().split(": ")[1]);
                String[] auxHelpfulness = input.nextLine().split(": ")[1].split("/");
                Helpfulness helpfulness = new Helpfulness(Integer.parseInt(auxHelpfulness[0]), Integer.parseInt(auxHelpfulness[0]) + Integer.parseInt(auxHelpfulness[1]));
                Review review = new Review(user, product, helpfulness, Double.parseDouble(input.nextLine().split(": ")[1]),
                        Long.parseLong(input.nextLine().split(": ")[1]), input.nextLine().split(": ")[1], input.nextLine().split(": ")[1]);
                reviews.add(review);
            }

        }
//        System.out.println(reviews);


//        inputs.forEach(System.out::println);

    }
}
