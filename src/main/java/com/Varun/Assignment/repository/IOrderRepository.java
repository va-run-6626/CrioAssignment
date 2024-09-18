package com.Varun.Assignment.repository;

import com.Varun.Assignment.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Long> {
}
