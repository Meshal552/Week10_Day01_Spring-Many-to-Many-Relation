package com.example.project3.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarShopRepository
        extends JpaRepository<CarShop, Integer>{
}