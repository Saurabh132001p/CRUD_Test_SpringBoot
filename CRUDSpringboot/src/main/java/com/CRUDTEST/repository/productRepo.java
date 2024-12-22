package com.CRUDTEST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUDTEST.dto.Product;


@Repository
public interface productRepo extends JpaRepository<Product, Integer>{

}