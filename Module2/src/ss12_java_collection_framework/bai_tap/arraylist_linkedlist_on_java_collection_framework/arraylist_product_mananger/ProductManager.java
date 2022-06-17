package ss12_java_collection_framework.bai_tap.arraylist_linkedlist_on_java_collection_framework.arraylist_product_mananger;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager<E> extends Product {
    public static Scanner scanner = new Scanner(System.in);
    public ArrayList<Product> productLists = new ArrayList<>();

    public ProductManager() {
        productLists.add(new Product("iPhone 13", "Apple", 1200));
        productLists.add(new Product("Galaxy S20 Ultra", "SamSung", 1300));
        productLists.add(new Product("N20", "Nokia", 1000));
        productLists.add(new Product("BlackShark", "Xiaomi", 1200));
        productLists.add(new Product("iPhone 5s", "Apple", 550));
        productLists.add(new Product("Note 20", "SamSung", 1100));
    }

    public void displayProduct() {
        System.out.println("List Product: ");
        for (Product item : productLists)
            if (item != null) {
                System.out.println(item.toString());
            }
    }

    public void addProduct() {
        System.out.println("ADD PRODUCT");
        System.out.println("Add name product: ");
        String name = scanner.nextLine();
        System.out.println("Add ID product: ");
        String id = scanner.nextLine();
        System.out.println("Add Price product: ");
        double price = Double.parseDouble(scanner.nextLine());
        productLists.add(new Product(name, id, price));
        System.out.println("add success");
    }

    public void removeProduct() {
        System.out.println("REMOVE PRODUCT");
        System.out.println("Choose ID remove: ");
        String id = scanner.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getId().equals(id)) {
                productLists.remove(i);
                break;
            }

        }
    }

    public void editProduct() {
        System.out.println("EDIT PRODUCT");
        System.out.println("Choose id edit product ");
        String id = scanner.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getId().equals(id)) {
                System.out.println("set new Name:");
                String newName = scanner.nextLine();
                System.out.println("Set new ID: ");
                String newID = scanner.nextLine();
                System.out.println("Set new Price: ");
                double newPrice = Double.parseDouble(scanner.nextLine());
                productLists.get(i).setName(newName);
                productLists.get(i).setId(newID);
                productLists.get(i).setPrice(newPrice);
                break;
            }

        }
    }
    public void searchNameProduct(){
        System.out.println("SEARCH NAME PRODUCT");
        System.out.println("Enter name:");
        String search = scanner.nextLine();
        for (int i = 0; i < productLists.size() ; i++) {
            if (productLists.get(i).getName().equals(search)){
                System.out.println(productLists.get(i).toString());
            }
        }
    }

    public static void sortAscending(List<Product> productList2s) {
        System.out.println("Before sort");
        for (Product x : productList2s) {
            System.out.println(x);
        }
        int length = productList2s.size();
        boolean haveSwap;
        for (int i = 0; i < length; i++) {
            haveSwap = false;
            for (int j = 0; j < length; j++) {
                if (productList2s.get(i).getPrice() > productList2s.get(j).getPrice()) {
                    Product temp = new Product();
                    temp = productList2s.get(i);
                    productList2s.set(i, productList2s.get(j));
                    productList2s.set(j, temp);
                    haveSwap = true;
                }
            }
            if (haveSwap == false) {
                break;
            }

        }
        System.out.println("After Sort");
        for (Product x : productList2s) {
            System.out.println(x);
        }

    }

    public ArrayList<Product> getProductLists() {
        return productLists;
    }

    public void setProductLists(ArrayList<Product> productLists) {
        this.productLists = productLists;
    }

    public static void sortDescending(List<Product> productList1s) {
        System.out.println("Before sort");
        for (Product x : productList1s) {
            System.out.println(x);
        }
        int length = productList1s.size();
        boolean haveSwap;
        for (int i = 0; i < length; i++) {

            haveSwap = false;
            for (int j = 0; j < length; j++) {
                if (productList1s.get(i).getPrice() < productList1s.get(j).getPrice()) {
                    Product temp = new Product();
                    temp = productList1s.get(i);
                    productList1s.set(i, productList1s.get(j));
                    productList1s.set(j, temp);
                    haveSwap = true;
                }
            }
            if (haveSwap == false) {
                break;
            }

        }
        System.out.println("After Sort");
        for (Product x : productList1s) {
            System.out.println(x);
        }


    }
}
