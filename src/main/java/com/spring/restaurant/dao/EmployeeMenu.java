package com.spring.restaurant.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class EmployeeMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String food;
    private int price;
    private int quantity;
}
