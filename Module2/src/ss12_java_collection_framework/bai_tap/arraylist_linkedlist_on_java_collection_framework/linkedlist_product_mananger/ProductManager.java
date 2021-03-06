package ss12_java_collection_framework.bai_tap.arraylist_linkedlist_on_java_collection_framework.linkedlist_product_mananger;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager<E> extends Product {
    Validation validation1 = new Validation();
    public static Scanner scanner = new Scanner(System.in);
    public LinkedList<Product> productLinkedList = new LinkedList<>();


    public ProductManager() {
    }

    public void displayProduct() {
        System.out.println("List Product: ");
        for (Product item : productLinkedList)
            if (item != null) {
                System.out.println(item);
            }
    }

    public void addProduct() {
        System.out.println("ADD PRODUCT");
        System.out.println("Add name product: ");
        String name = scanner.nextLine();
        System.out.println("Add Price product: ");
        double price = validation1.checkInputDouble();
        System.out.println("Add success");
//        int lastId = 0;
//        if (productLinkedList.size() > 0) {
//            lastId = productLinkedList.get(productLinkedList.size() - 1).getId();
//        }
        Product product = new Product(name, price);
        productLinkedList.add(product);

    }

    public void removeProduct() {
        System.out.println("REMOVE PRODUCT");
        System.out.println("Choose ID remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getId() == id) {
                productLinkedList.remove(i);
                break;
            }

        }
    }

    public void editProduct() {
        System.out.println("EDIT PRODUCT");
        System.out.println("Choose id edit product ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getId() == id) {
                System.out.println("set new Name:");
                String newName = scanner.nextLine();
                System.out.println("Set new ID: ");
                int newID = Integer.parseInt(scanner.nextLine());
                System.out.println("Set new Price: ");
                double newPrice = Double.parseDouble(scanner.nextLine());
                productLinkedList.get(i).setName(newName);
                productLinkedList.get(i).setId(newID);
                productLinkedList.get(i).setPrice(newPrice);
                break;
            }

        }
    }

    public void searchNameProduct() {
        System.out.println("SEARCH NAME PRODUCT");
        System.out.println("Enter name:");
        String search = scanner.nextLine();
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getName().equals(search)) {
                System.out.println(productLinkedList.get(i).toString());
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

    public LinkedList<Product> getProductLinkedList() {
        return productLinkedList;
    }

    public void setProductLinkedList(LinkedList<Product> productLinkedList) {
        this.productLinkedList = productLinkedList;
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
