package com.spring.restaurant.repository;

import com.spring.restaurant.dao.EmployeeMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeMenuRepo extends JpaRepository<EmployeeMenu,Integer> {

}
