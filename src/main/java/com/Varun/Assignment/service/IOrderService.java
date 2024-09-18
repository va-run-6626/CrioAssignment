package com.Varun.Assignment.service;

import com.Varun.Assignment.entity.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> getAllOrders();
    public Order getOrderById(Long id);
    public Order saveOrder(Order order);
    public void deleteOrder(Long id);
}
