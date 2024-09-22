import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    Product product = new Product();
    System.out.println("Enter product data: ");
    System.out.print("Enter product name: ");
    product.name = sc.nextLine();
    System.out.print("Enter product price: ");
    product.price = Double.parseDouble(sc.nextLine());
    System.out.print("Enter quantity products in stock: ");
    product.quantity = Integer.parseInt(sc.nextLine());
    
    System.out.println();
    System.out.println("Product details: " + product);
    
    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt();
    product.addProducts(quantity);
    
    System.out.println();
    System.out.println("Updated data: " + product);
    
    System.out.println();
    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);
    
    System.out.println();
    System.out.println("Updated data: " + product);
    
    sc.close();
  }
}