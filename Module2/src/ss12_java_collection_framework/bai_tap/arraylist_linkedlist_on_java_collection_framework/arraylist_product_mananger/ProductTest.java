package ss12_java_collection_framework.bai_tap.arraylist_linkedlist_on_java_collection_framework.arraylist_product_mananger;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        ProductManager productManager1 = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        while (choose != 0) {

            System.out.println("Select Option");

            choose = Integer.parseInt(scanner.nextLine());
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
                    ProductManager.sortAscending(productManager.getProductLists());
                    break;
                case 7:
                    ProductManager.sortDescending(productManager1.getProductLists());
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
