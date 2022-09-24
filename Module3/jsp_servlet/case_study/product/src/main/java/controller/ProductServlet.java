package controller;

import model.Category;
import model.Product;
import service.iml.CategoryService;
import service.iml.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductService();
    CategoryService categoryService = new CategoryService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                findAll(request, response);
                break;
        }


    }


    private void findAll(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.selectAllProduct();
        List<Category> categoryList = categoryService.selectAllCategory();
        request.setAttribute("productList", productList);
        request.setAttribute("categoryList", categoryList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
                case "create":
                    createProduct(request, response);
                    break;
            case "update":
                updateProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
            default:
                findAll(request, response);
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {

        String nameSearch = request.getParameter("nameSearch");
        List<Product> productList = productService.searchProduct(nameSearch);
        List<Category> categoryList = categoryService.selectAllCategory();
        request.setAttribute("productList", productList);
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("searchName", nameSearch);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("productIdDelete"));
        productService.deleteProduct(id);
        categoryService.selectAllCategory();
        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("productIdUpdate"));
        String name = request.getParameter("productNameUpdate");
        float price = Float.parseFloat(request.getParameter("productPriceUpdate"));
        int quantity = Integer.parseInt(request.getParameter("productQuantityUpdate"));
        String color = request.getParameter("productColorUpdate");
        String description = request.getParameter("productDescriptionUpdate");
        int category = Integer.parseInt(request.getParameter("productCategoryUpdate"));

        Product product = new Product(id, name, price, quantity, color, description, category);
        productService.updateProduct(product);
        categoryService.selectAllCategory();
        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("productNameCreate");
        float price = Float.parseFloat(request.getParameter("productPriceCreate"));
        String stQuantity= request.getParameter("productQuantityCreate");
        int quantity = 0;
        String color = request.getParameter("productColorCreate");
        String description = request.getParameter("productDescriptionCreate");
        int category = Integer.parseInt(request.getParameter("productCategoryCreate"));
        boolean isError = false;
        if (name == null || name.isEmpty()) {
            isError = true;
            request.setAttribute("name_blank", "Not blank name");
        }
        if(price < 0){
            isError = true;
            request.setAttribute("price_err", " Price is not < 0 ");
        }


        if(!checkQuantity(stQuantity)){
            isError = true;
            request.setAttribute("quantity_err", " Quantity is not < 0 and string");
        }
        else {
            quantity = Integer.parseInt(stQuantity);
        }


        if (color == null || color.isEmpty()) {
            isError = true;
            request.setAttribute("color_blank", "Not blank color");
        }
        if (description == null || description.isEmpty()) {
            isError = true;
            request.setAttribute("description_blank", "Not blank description");
        }

        if(category == 0 ){
            isError = true;
            request.setAttribute("category_err", " Please choose category");
        }
        if (!isError) {
            Product product = new Product(name, price, quantity, color, description, category);
            productService.createProduct(product);
            request.setAttribute("message", "create success: " + name);

        } else {
            request.setAttribute("productErr", new Product(name, price, quantity, color, description, category));

        }
        request.setAttribute("isError", isError);
        findAll(request, response);
    }

    private boolean checkQuantity(String val){
        try{
            int res = Integer.parseInt(val);
            return res > 0;
        }
        catch (Exception e){
            return false;
        }
    }
}

