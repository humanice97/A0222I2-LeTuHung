package controller;

import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;
import repository.impl.LoaiMatBangRepository;
import service.impl.LoaiMatBangService;
import service.impl.MatBangService;
import service.impl.TrangThaiService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MatBangServlet", value = "/matbang")
public class MatBangServlet extends HttpServlet {
    MatBangService matBangService = new MatBangService();
    LoaiMatBangService loaiMatBangService = new LoaiMatBangService();
    TrangThaiService trangThaiService = new TrangThaiService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                findAll(request, response);
                break;
        }


    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) {
        List<MatBang> matBangList = matBangService.selectAllMatBang();
        List<TrangThai> trangThaiList = trangThaiService.selectAllTrangThai();
        List<LoaiMatBang> loaiMatBangList = loaiMatBangService.selectAllLoaiMatBang();
        request.setAttribute("matBangList", matBangList);
        request.setAttribute("loaiMatBangList", loaiMatBangList);
        request.setAttribute("trangThaiList", trangThaiList);

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
                Create(request, response);
                break;
            case "edit":
                Edit(request, response);
                break;
            case "delete":
                Delete(request, response);
                break;
            case "search":
                Search(request, response);
                break;
        }
    }

    private void Search(HttpServletRequest request, HttpServletResponse response) {
    }

    private void Delete(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("productIdDelete");
        matBangService.deleteMatBang(id);
        loaiMatBangService.selectAllLoaiMatBang();
        trangThaiService.selectAllTrangThai();
        try {
            response.sendRedirect("matbang");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Edit(HttpServletRequest request, HttpServletResponse response) {
    }

    private void Create(HttpServletRequest request, HttpServletResponse response) {
    }
}
