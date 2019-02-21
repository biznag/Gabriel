package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateProduct {
    private static String name;
    private static double cost;
    private static double quantity;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Product> products = new ArrayList<>();

    public static ArrayList createAllProducts(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String productString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                productString += line;
            } else {
                parseProduct(productString);
                productString = "";
            }
        }
        return products;
    }

    private static void parseProduct(String string) {
        int pos = 0;
        int pos2 = 0;
        String name = "";
        int number = 0;
        double age = 0;
                pos = string.indexOf(",");
                pos2 = string.indexOf(",",pos+1);
                name = string.substring(0,pos);
                age = Double.parseDouble(string.substring(pos+1,pos2));
                number = Integer.parseInt(string.substring(pos2+1));


        products.add(new Product(name, number, age));
    }
}