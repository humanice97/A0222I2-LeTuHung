package com.codegym.furama.controller;

import com.codegym.furama.model.employee.Employee;
import com.codegym.furama.services.employee.impl.DepartmentServices;
import com.codegym.furama.services.employee.impl.EmployeeServices;
import com.codegym.furama.services.employee.impl.LevelServices;
import com.codegym.furama.services.employee.impl.PositionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;
    @Autowired
    private PositionServices positionServices;
    @Autowired
    private LevelServices levelServices;
    @Autowired
    private DepartmentServices departmentServices;

//    @GetMapping("list")
//    private String getList(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
//        model.addAttribute("employeeList", employeeServices.getAll(PageRequest.of(page, 4)));
//        return "employee/list";
//    }

    @GetMapping("")
    private String getPage(@PageableDefault(value = 1) Pageable pageable,
                           @RequestParam(value = "inputSearch", defaultValue = "") String nameSearch,
                           Model model) {
        Page<Employee> employees = employeeServices.findByName(nameSearch,pageable);
        model.addAttribute("employeeList",employees);
        model.addAttribute("nameSearch", nameSearch);
        return "employee/list";
    }

    @GetMapping(value = "save")
    private String getSave(@RequestParam(name = "id", defaultValue = "0") Integer id, Model model) {
        if (id == 0) {
            model.addAttribute("employee", new Employee());
        } else {
            model.addAttribute("employee", employeeServices.getEmployeeById(id));
        }
        model.addAttribute("positionList", positionServices.findAll());
        model.addAttribute("levelList", levelServices.findAll());
        model.addAttribute("departmentList", departmentServices.findAll());
        model.addAttribute("id", id);
        return "employee/save";
    }

    @PostMapping(value = "/save")
    private String saveEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("positionList", positionServices.findAll());
            model.addAttribute("levelList", levelServices.findAll());
            model.addAttribute("departmentList", departmentServices.findAll());

            return "employee/save";

        } else {
            employeeServices.save(employee);
            redirectAttributes.addFlashAttribute("msg", "add thanh cong");
            return "redirect:/employee";
        }

    }

    @GetMapping(value = "delete")
    private String deleteEmployee(@RequestParam(name = "id") Integer id) {
        employeeServices.delete(employeeServices.getEmployeeById(id));
        return "redirect:/employee";
    }
}
