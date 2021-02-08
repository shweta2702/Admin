package com.cg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.main.model.Admin;

/**
 * Repository class
 * 
 * @author Shweta
 *
 */

@Repository // Indicates that an annotated class is a "Repository"
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
}
