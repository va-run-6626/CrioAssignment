package com.Varun.Assignment.repository;

import com.Varun.Assignment.entity.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
