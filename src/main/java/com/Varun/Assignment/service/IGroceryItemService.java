package com.Varun.Assignment.service;

import com.Varun.Assignment.entity.GroceryItem;

import java.util.List;

public interface IGroceryItemService {
    public List<GroceryItem> getAllGroceryItems();
    public GroceryItem getGroceryItemById(Long id);
    public GroceryItem saveGroceryItem(GroceryItem groceryItem);
    public void deleteGroceryItem(Long id);
}
