package controller;

import dto.ProductDTO;
import model.Product;
import service.IProductService;
import service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    IProductService iTempService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            default:
                findAll(request, response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
       String name = request.getParameter("name");
       float price = Float.parseFloat(request.getParameter("price"));
       int quantity = Integer.parseInt(request.getParameter("quantity"));
       String color = request.getParameter("color");
       String description = request.getParameter("description");
       int category = Integer.parseInt(request.getParameter("category"));

       Product product = new Product(name,price,quantity,color,description,category);
       iTempService.save(product);

        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) {
        List<ProductDTO> productDTOList = iTempService.getAll();
        request.setAttribute("productDTOList", productDTOList);
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

    }
}
