package com.Varun.Assignment.Service;

import com.Varun.Assignment.entity.GroceryItem;
import com.Varun.Assignment.entity.Order;
import com.Varun.Assignment.repository.ICustomerRepository;
import com.Varun.Assignment.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService{

    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private ICustomerRepository customerRepository;


    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
    }

    @Override
    public Order saveOrder(Order order) {
        // Calculate total price
        Double totalPrice = order.getGroceryItems()
                .stream()
                .mapToDouble(GroceryItem::getPrice)
                .sum();
        order.setTotalPrice(totalPrice);
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}
