import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1, "Mai Van Hoang", "1983-08-20", "Ha Noi", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2022/08/shanks-toc-do-1-696x392.jpg?fit=700%2C20000&quality=95&ssl=1"));
        customerList.add(new Customer(2, "Mai Van Hoang1", "1983-08-20", "Ha Noi1", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2022/08/shanks-toc-do-1-696x392.jpg?fit=700%2C20000&quality=95&ssl=1"));
        customerList.add(new Customer(3, "Mai Van Hoang2", "1983-08-20", "Ha Noi2", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2022/08/shanks-toc-do-1-696x392.jpg?fit=700%2C20000&quality=95&ssl=1"));
        customerList.add(new Customer(4, "Mai Van Hoang3", "1983-08-20", "Ha Noi3", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2022/08/shanks-toc-do-1-696x392.jpg?fit=700%2C20000&quality=95&ssl=1"));
        customerList.add(new Customer(5, "Mai Van Hoang4", "1983-08-20", "Ha Noi4", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2022/08/shanks-toc-do-1-696x392.jpg?fit=700%2C20000&quality=95&ssl=1"));
        customerList.add(new Customer(6, "Mai Van Hoang5", "1983-08-20", "Ha Noi5", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2022/08/shanks-toc-do-1-696x392.jpg?fit=700%2C20000&quality=95&ssl=1"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
        request.setAttribute("listCustomer", customerList);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
