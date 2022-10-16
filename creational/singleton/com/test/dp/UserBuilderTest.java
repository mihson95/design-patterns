package com.test.dp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.dp.builder.Database;
import com.dp.builder.User;
import com.dp.builder.User.UserBuilder;

public class UserBuilderTest {

	@Test
	public void testUserCreation() {
		UserBuilder builder =  User.builder();
		User user = builder
				.username("mihir")
				.password("password")
				.email("email")
				.build();
		assertNotNull("If user is created using builder pattern it is not null", user);
		
	}
	
	@Test
	public void testDatabaseBuilder() {
		Database database = Database.builder()
						.name("test")
						.password("password")
						.url("url", 3000)
						.build();
		assertNotNull("If builder is called instance should not be null", database);
		assertEquals("if instance is returned, name should be same as input", "test",database.getName());
		
	}
}
