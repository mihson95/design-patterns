package com.dp.builder;

import lombok.Getter;

@Getter
public class Database {

	private String name;
	private String password;
	private String host;
	private Integer port;
	
	//Step 1 - Hide the constructor
	private Database(){}
	
	//Utility method - get builder
	public static DatabaseBuilder builder() {
		return new DatabaseBuilder();
	}
	
	//Step 2 - Create static inner class
	public static class DatabaseBuilder {
		//Step 3 - Copy all fields from outer
		
		private String name;
		private String password;
		private String host;
		private Integer port;
		
		//Step 6 - Hide DatabaseBuilder Constructor
		private DatabaseBuilder(){}
		
		//Step 4 - Create Setters - Fluent Interfaces(Setters)
		
		public DatabaseBuilder name(String name) {
			this.name = name;
			return this;
		}
		public DatabaseBuilder password(String password) {
			this.password = password;
			return this;
		}
		public DatabaseBuilder url(String host, Integer port) {
			this.host = host;
			this.port = port;
			return this;
		}
		
		//Step 5 - Create our Build Method
		public Database build() {
			Database database = new Database();
			database.host = this.host;
			database.port = this.port;
			database.name = this.name;
			database.password = this.password;
			return database;
		}
		
	}
}
