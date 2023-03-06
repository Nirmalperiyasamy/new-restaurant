package com.spring.restaurant.service;

import com.spring.restaurant.repository.EmployeeMenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeMenu {
    @Autowired
    private EmployeeMenuRepo employeeMenuRepo;

    public List<com.spring.restaurant.dao.EmployeeMenu> getAll() {
        return employeeMenuRepo.findAll();
    }
}
