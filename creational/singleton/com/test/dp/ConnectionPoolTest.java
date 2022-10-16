package com.test.dp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.dp.ConnectionPool;

public class ConnectionPoolTest {

	@Test
	public void testSingleInstance() {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		assertNotNull("If an instance is called the return instance should not be null", connectionPool);
		
		ConnectionPool connectionPool2 = ConnectionPool.getInstance();
		assertEquals("If get instance is called twice the connection pool should remain the same", connectionPool, connectionPool2);
	}
}
