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
		
		Database database;
		
		//Step 6 - Hide DatabaseBuilder Constructor
		private DatabaseBuilder(){this.database = new Database();}
		
		//Step 4 - Create Setters - Fluent Interfaces(Setters)

		//Creating Immutable Fields
		public DatabaseBuilder name(String name) {
			this.database.name = name;
			return this;
		}
		public DatabaseBuilder password(String password) {
			this.database.password = password;
			return this;
		}
		public DatabaseBuilder url(String host, Integer port) {
			this.database.host = host;
			this.database.port = port;
			return this;
		}
		
		//Step 5 - Create our Build Method
		public Database build() {
			if(!isValid()) {
				throw new RuntimeException("Invalid Configuration");
			}
			Database database = this.database;
			return database;
		}
		
		//Validate
		//Validation condition on port and database name should not be null
		public Boolean isValid() {
			if(this.database.port > 10000 || this.database.name == null) {
				return false;
			}
			return true;
		}
	}
}
