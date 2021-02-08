package com.cg.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.main.model.Admin;
import com.cg.main.repository.AdminRepository;



/***
 * 
 *AdminService class which implements IAdminService
 * helps in checking the user name and password
 *it checks the data given by the Admin is true with respect to the data in the database
 *
 */
@Service
@Transactional
public class AdminService implements IAdminService {
	
	
	@Autowired
	AdminRepository repository;
    /**
     * method to add the username and password details
     */
	@Override
	public Admin addAdmin(Admin a) {
	return repository.save(a);
	}
	
	
	
}
