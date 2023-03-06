package com.spring.restaurant.service;

import com.spring.restaurant.dao.EmployeeMenu;
import com.spring.restaurant.repository.EmployeeMenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeMenuImpl {
    @Autowired
    private EmployeeMenuRepo employeeMenuRepo;
    public List<EmployeeMenu> getAll(){
          return employeeMenuRepo.findAll();
    }
}
