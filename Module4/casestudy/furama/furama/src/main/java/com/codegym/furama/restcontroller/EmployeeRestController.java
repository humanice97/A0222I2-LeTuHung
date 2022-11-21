package com.codegym.furama.restcontroller;

import com.codegym.furama.model.employee.Employee;
import com.codegym.furama.services.employee.impl.DepartmentServices;
import com.codegym.furama.services.employee.impl.EmployeeServices;
import com.codegym.furama.services.employee.impl.LevelServices;
import com.codegym.furama.services.employee.impl.PositionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/api")
@CrossOrigin
public class EmployeeRestController {
    @Autowired
    private EmployeeServices employeeServices;
    @Autowired
    private PositionServices positionServices;
    @Autowired
    private LevelServices levelServices;
    @Autowired
    private DepartmentServices departmentServices;

    @GetMapping
    public ResponseEntity<Page<Employee>> getAll(@RequestParam("page") Integer page) {
        return new ResponseEntity<>(employeeServices.getAll(PageRequest.of(page, 4)), HttpStatus.OK);
    }
}
