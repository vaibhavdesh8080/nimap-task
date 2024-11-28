package org.myventure.in.example.repository;

import org.myventure.in.example.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
