package sample;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
    public String name;
    private int quantity;
    private double cost;

    Product(String n, int quant, double cost){
        name = n;
        quantity = quant;
        this.cost = cost;

    }
    //getters and setters
    public void setQuantity(int amt){
        quantity += amt;

    }
    public int getQuantity(){ return quantity;}

    public void purchase(){
        this.name = "";
        this.quantity = 0;
        this.cost = 0;

    }

    public void writeToFile() throws IOException{
        FileWriter fw = new FileWriter("products.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",\r");
        bw.write(Integer.toString(quantity) + ",\r");
        bw.write(Double.toString(cost) + "\r");
        bw.write(";\r");
        bw.close();
        System.out.println("loading");
    }

    public double getCost(){return cost;}

    @Override
    public String toString() {
        return name;
    }
}
