package com.dp;
public class ConnectionPool {

  //Step 3 - Add a static variable
  private static ConnectionPool instance = new ConnectionPool();
  
  //Step 1 - Hide constructor
  private ConnectionPool(){}
  
  //Step 2 - Static Initializer
  public static ConnectionPool getInstance() {
        return instance;
  }
}

//Eager initialization