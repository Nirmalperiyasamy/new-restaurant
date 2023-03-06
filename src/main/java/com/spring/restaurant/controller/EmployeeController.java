package com.spring.restaurant.controller;

import com.spring.restaurant.dto.UserDto;
import com.spring.restaurant.repository.EmployeeMenuRepo;
import com.spring.restaurant.service.EmployeeMenu;
import com.spring.restaurant.service.EmployeeServiceImpl;
import com.spring.restaurant.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.spring.restaurant.utils.Constants.*;

@Controller
@RequestMapping(EMPLOYEE)
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
    @Autowired
    private ManagerService managerService;
    @Autowired
    private EmployeeMenu employeeMenu;
    @Autowired
    private EmployeeMenuRepo employeeMenuRepo;

    @RequestMapping(PING)
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok("PONG EMLPOYEE");
    }


    @RequestMapping(ADD_EMPLOYEE)
    public String index() {
        return "employee-register";
    }


    @PostMapping(ADD_EMPLOYEE)
    public String addEmployee(@Valid @ModelAttribute UserDto dto) {
        employeeService.addEmployee(dto);
        return "redirect:/login";
    }


    @GetMapping(MENU)
    public String allMenu(Model model) {
        List<com.spring.restaurant.dao.EmployeeMenu> menu = employeeMenu.getAll();
        model.addAttribute("menus", menu);
        return "employee-menulist";
    }


}
