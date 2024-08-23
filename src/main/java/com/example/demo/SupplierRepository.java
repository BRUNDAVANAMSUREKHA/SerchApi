package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    // Define a method to find suppliers by company name
    List<Supplier> findByCompanyName(String companyName);
}
