package com.cg.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.main.model.Admin;
import com.cg.main.service.IAdminService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	IAdminService service;
	@ApiOperation(value="Click here to enter Username and password")
	@PostMapping("/AdminDetails")
	public ResponseEntity<Integer> addAdmin(@Valid @RequestBody Admin admin){
		Admin adminInfo = service.addAdmin(admin);
		return new ResponseEntity<>(adminInfo.getAdminId(),HttpStatus.OK);
	}
	
	
}
	

	
