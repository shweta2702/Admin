package com.cg.main;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.controller.AdminController;

@SpringBootTest
class AdminModuleApplicationTests {

    @Autowired
    private AdminController contro;	
    /*
     * @Test is used to signal that the annotated method is a test method.
     *  test for Assert that actual is not null
     */
	@Test
	void contextLoads() {
		assertNotNull(contro);
	}

}
