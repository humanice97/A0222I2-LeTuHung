package ss12_java_collection_framework.bai_tap.arraylist_linkedlist_on_java_collection_framework.linkedlist_product_mananger;

import java.io.IOException;
import java.util.Scanner;



public class ProductTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        ProductManager productManager1 = new ProductManager();
        Validation validation = new Validation();

        int choose = -1;
        while (choose != 0) {
            System.out.println("Select Option");
            System.out.println("1 - Add Product");
            System.out.println("2 - Edit Product by Id");
            System.out.println("3 - Remove Product");
            System.out.println("4 - Display Product");
            System.out.println("5 - Search by Name Product");
            System.out.println("6 - Sort Ascending");
            System.out.println("7 - Sort Descending");
            System.out.println("0 - Exit");

            choose = validation.checkInputInt();

            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.removeProduct();
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.searchNameProduct();
                    break;
                case 6:
                    ProductManager.sortAscending(productManager.getProductLinkedList());
                    break;
                case 7:
                    ProductManager.sortDescending(productManager1.getProductLinkedList());
                    break;
                case 0:
                    System.out.println("Exited");
                    break;
                default:
                    break;
            }
        }
    }
}
