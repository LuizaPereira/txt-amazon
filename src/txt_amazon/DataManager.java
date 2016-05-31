package txt_amazon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Arts.txt"));
        ArrayList<Review> reviews = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Helpfulness> helpfulnesses = new ArrayList<>();

        while (input.hasNextLine()) {
            String nextLineAux = input.nextLine();
            if (!nextLineAux.equals("")) {
                String productId = nextLineAux.split(":")[1].trim();
                String title = input.nextLine().split(":")[1].trim();

//                tratando preços unknown
                String priceStr = input.nextLine().split(":")[1].trim();
                Double price;
                try {
                    price = Double.parseDouble(priceStr);
                } catch (Exception e) {
                    price = Product.UNKNOWN_PRICE;
                }

                String userId = input.nextLine().split(":")[1].trim();
                String profileName = input.nextLine().split(":")[1].trim();
                String[] auxHelpfulness = input.nextLine().split(": ")[1].split("/");
                int positive = Integer.parseInt(auxHelpfulness[0]);
                int total = Integer.parseInt(auxHelpfulness[0]) + Integer.parseInt(auxHelpfulness[1]);
                Double score = Double.parseDouble(input.nextLine().split(": ")[1]);
                Long time = Long.parseLong(input.nextLine().split(": ")[1]);
                String summary = input.nextLine().split(": ")[1];
                String text = input.nextLine().split(": ")[1];

                Helpfulness helpfulness = new Helpfulness(positive, total);
                Product newProduct = new Product(productId, title, price);
                User newUser = new User(userId, profileName);
                helpfulnesses.add(helpfulness);

                boolean flagUser = false;
                boolean flagProduct = false;
                if (users.size() > 0) { // se ja existm usuarios
                    for (User user : users) { // para cada usuario existente
                        if (user.getUserId().equals(userId)) { //checa se ja existe um usuario com aquele id
                            flagUser = true;
                            Review reviewUser = new Review(score, time, summary, text, user, helpfulness); //cria uma review praquele usuario
                            user.novaReview(reviewUser); //adiciona a review no arraylist de reviews do usuario
                            reviews.add(reviewUser); //adiciona a review na lista de todas reviews

                            if (products.size() > 0) { //checa se existem produtos na lista
                                for (Product product : products) { // para cada produto na lista
                                    if (product.getProductId().equals(productId)) { //checa se o produto ja existe
                                        flagProduct = true;
                                        product.novaReview(reviewUser); //adiciona uma review na lista de reviews do produto
                                    }
                                }
                                if (!flagProduct){
                                    products.add(newProduct); // adiciona o produto novo na lista
                                    newProduct.novaReview(reviewUser); //adiciona a review na lista de reviews do produto
                                }
                            } else { // se a lista de produtos esta vazia
                                products.add(newProduct); // adiciona o produto novo na lista
                                newProduct.novaReview(reviewUser); //adiciona a review na lista de reviews do produto
                            }
                        }
                    }
                    if (!flagUser){
                    users.add(newUser);
                    Review reviewNewUser = new Review(score, time, summary, text, newUser, helpfulness); //cria uma review praquele usuario
                    newUser.novaReview(reviewNewUser); //adiciona a review no arraylist de reviews do usuario
                    reviews.add(reviewNewUser); //adiciona a review na lista de todas reviews
                    }
                } else { // se a lista de usuarios esta vazia
                    Review reviewNewUser = new Review(score, time, summary, text, newUser, helpfulness); // cria uma review pro novo usuario
                    newUser.novaReview(reviewNewUser); // adiciona a review na lista de reviews do novo user
                    reviews.add(reviewNewUser); // adiciona a review na lista
                    users.add(newUser); // adiciona o novo usuario na lista
                    if (products.size() > 0) { //checa se existem produtos na lista
                        for (Product product : products) { // para cada produto na lista
                            if (product.getProductId().equals(productId)) { //checa se o produto ja existe
                                flagProduct = true;
                                product.novaReview(reviewNewUser); //adiciona uma review na lista de reviews do produto
                            }
                        }
                        if (!flagProduct){
                            products.add(newProduct); // adiciona o produto novo na lista
                            newProduct.novaReview(reviewNewUser); //adiciona a review na lista de reviews do produto
                        }
                    } else { // se a lista de produtos esta vazia
                        products.add(newProduct); // adiciona o produto novo na lista
                        newProduct.novaReview(reviewNewUser); //adiciona a review na lista de reviews do produto
                    }
                }
            }
        }
    }
}