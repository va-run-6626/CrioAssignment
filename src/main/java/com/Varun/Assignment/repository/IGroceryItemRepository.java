package com.Varun.Assignment.repository;

import com.Varun.Assignment.entity.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
