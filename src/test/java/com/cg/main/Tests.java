package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.Admin;
import com.cg.main.service.IAdminService;

@SpringBootTest
class Tests {

	@Autowired
	IAdminService s;

	/*
	 * @BeforeEach is used to signal that the annotated method should be executed
	 * before each @Test
	 */

	@BeforeEach
	void setUp() throws Exception {
	}

	/*
	 * @AfterEach is used to signal that the annotated method should be executed
	 * after each @Test
	 */

	@AfterEach
	void tearDown() throws Exception {
	}

	/*
	 * method for testing the service layer using admin pasword
	 */
	@Test
	void test() {
		Admin admin = s.addAdmin(new Admin("HARRY", "Hari32876@"));
		assertEquals("Hari32876@",admin.getAdminPassword());
	}
	/**
	 * method for testing the service layer using admin username
	 */
	@Test
	void test1() {
		Admin admin = s.addAdmin(new Admin("HARRY", "Hari32876@"));
		assertEquals("HARRY", admin.getAdminName());
	}
}