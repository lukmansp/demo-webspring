package com.ecom_proj.ecom_project.repository;

import com.ecom_proj.ecom_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
