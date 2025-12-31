package com.cetpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> 
{
}