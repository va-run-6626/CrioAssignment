package com.Varun.Assignment.Service;

import com.Varun.Assignment.entity.GroceryItem;
import com.Varun.Assignment.repository.IGroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroceryItemServiceImpl implements IGroceryItemService{

    @Autowired
    private IGroceryItemRepository groceryItemRepository;

    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemRepository.findAll();
    }

    public GroceryItem getGroceryItemById(Long id) {
        return groceryItemRepository.findById(id).get();
    }

    public GroceryItem saveGroceryItem(GroceryItem groceryItem) {
        return groceryItemRepository.save(groceryItem);
    }

    public void deleteGroceryItem(Long id) {
        groceryItemRepository.deleteById(id);
    }
}
