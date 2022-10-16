package com.dp;
public class ConnectionPool {

  //Step 3 - Add a static variable
  private static ConnectionPool instance = null;
  
  //Step 1 - Hide constructor
  private ConnectionPool(){}
  
  //Step 2 - Static Initializer
  public static ConnectionPool getInstance() {
      if(instance == null) {
		  synchronized (ConnectionPool.class) {
	    	  if(instance == null) {
	        	  instance = new ConnectionPool();
	          }
	      }
      }
	  return instance;
  }
}

//Eager initialization
//Lazy initialization(on demand initialization)