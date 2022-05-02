package com.sheryians.major.Repository;

import com.sheryians.major.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
    List<Product> findByCategory_Id(int id);

}
