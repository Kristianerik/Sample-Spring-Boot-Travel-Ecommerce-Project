package com.travelAgency.ecommerce.dao;

import com.travelAgency.ecommerce.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CartRepository extends JpaRepository<Cart, Long> {

}
