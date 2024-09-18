package com.Varun.Assignment.controller;


import com.Varun.Assignment.entity.GroceryItem;
import com.Varun.Assignment.service.IGroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class GroceryItemController {
    @Autowired
    private IGroceryItemService groceryItemService;

    @GetMapping
    public List<GroceryItem> getAllItems() {
        return groceryItemService.getAllGroceryItems();
    }

    @GetMapping("/{id}")
    public GroceryItem getItemById(@PathVariable Long id) {
        return groceryItemService.getGroceryItemById(id);
    }

    @PostMapping
    public GroceryItem createItem(@RequestBody GroceryItem groceryItem) {
        return groceryItemService.saveGroceryItem(groceryItem);
    }

    @PutMapping("/{id}")
    public GroceryItem updateItem(@PathVariable Long id, @RequestBody GroceryItem groceryItem) {
        groceryItem.setId(id);
        return groceryItemService.saveGroceryItem(groceryItem);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        groceryItemService.deleteGroceryItem(id);
    }
}

