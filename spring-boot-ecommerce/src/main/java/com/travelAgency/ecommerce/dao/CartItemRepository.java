package com.travelAgency.ecommerce.dao;

import com.travelAgency.ecommerce.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
