package com.orderservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderservice.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
