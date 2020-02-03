package com.eatza.restaurantsearch.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eatza.restaurantsearch.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
	
	Page<MenuItem> findByNameContaining(String name, Pageable pageable);
	
	Optional<MenuItem> findById(Long id);
	Page<MenuItem> findByMenu_id(Long id, Pageable pageable);

}
